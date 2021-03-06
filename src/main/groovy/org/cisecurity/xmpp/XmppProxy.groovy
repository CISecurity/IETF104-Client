package org.cisecurity.xmpp

import groovy.json.JsonSlurper
import org.cisecurity.csat.Control
import org.cisecurity.csat.Csat
import org.cisecurity.csat.Invalid
import org.cisecurity.csat.Valid
import org.cisecurity.oval.collection.ind.EnvironmentvariableFilter
import org.cisecurity.xmpp.extensions.collection.oval.OvalCollectionSystem
import org.cisecurity.oval.collection.ind.EnvironmentvariableObject
import org.cisecurity.oval.collection.ind.FamilyObject
import org.cisecurity.oval.sc.ind.EnvironmentvariableItem
import org.cisecurity.oval.sc.ind.FamilyItem
import org.cisecurity.xmpp.exc.XmppConnectionInvalidCredentialsException
import org.cisecurity.xmpp.exc.XmppConnectionInvalidException
import org.cisecurity.oval.collection.OvalObjects
import org.cisecurity.oval.sc.OvalSystemCharacteristics
import org.cisecurity.xmpp.addition.model.Addition
import org.cisecurity.xmpp.extensions.collection.oval.OvalCollectionManager
import org.cisecurity.xmpp.trust.TrustAllX509TrustManager
import rocks.xmpp.addr.Jid
import rocks.xmpp.core.net.client.SocketConnectionConfiguration
import rocks.xmpp.core.session.Extension
import rocks.xmpp.core.session.XmppClient
import rocks.xmpp.core.session.XmppSession
import rocks.xmpp.core.session.XmppSessionConfiguration
import rocks.xmpp.core.session.debug.ConsoleDebugger
import rocks.xmpp.core.stanza.AbstractIQHandler
import rocks.xmpp.core.stanza.IQHandler
import rocks.xmpp.core.stanza.model.IQ
import rocks.xmpp.core.stanza.model.Message
import rocks.xmpp.core.stanza.model.StanzaErrorException
import rocks.xmpp.core.stanza.model.errors.Condition
import rocks.xmpp.extensions.disco.ServiceDiscoveryManager
import rocks.xmpp.extensions.disco.model.info.InfoNode
import rocks.xmpp.extensions.filetransfer.FileTransfer
import rocks.xmpp.extensions.filetransfer.FileTransferManager
import rocks.xmpp.extensions.last.LastActivityManager
import rocks.xmpp.extensions.last.model.LastActivity
import rocks.xmpp.extensions.pubsub.PubSubManager
import rocks.xmpp.extensions.pubsub.PubSubNode
import rocks.xmpp.extensions.pubsub.PubSubService
import rocks.xmpp.im.roster.RosterManager
import javax.net.ssl.HostnameVerifier
import javax.net.ssl.SSLContext
import javax.net.ssl.SSLSession
import javax.net.ssl.TrustManager
import java.nio.file.Paths
import java.security.SecureRandom
import java.time.Duration
import java.util.concurrent.TimeUnit

class XmppProxy {
	XmppClient   xmppClient
	String       xmppDomain
	//SwingBuilder swingBuilder
	Closure callback

	/**
	 *
	 * @param user
	 * @return
	 */
	def connect(User user) {
		if (!xmppClient) {
			initializeXmpp()
		}

		if (user.username && user.password) {
			xmppClient.login(user.username, user.password, user.resource)
		} else {
			throw new XmppConnectionInvalidCredentialsException("Invalid XMPP Credentials")
		}
	}

	/**
	 *
	 * @return
	 */
	def close() {
		if (xmppClient) {
			println "Closing XMPP client..."
			xmppClient.close()
		}
	}

	/**
	 *
	 * @param chat
	 * @return
	 */
	def sendMessage(Chat chat) {
		if (getStatus() == XmppSession.Status.AUTHENTICATED) {
//			println chat
//			xmppClient.sendMessage(
//				new Message(
//					Jid.of("${chat.to}@${xmppDomain}"),
//					Message.Type.CHAT,
//					chat.msg)
//			)

			try {
				Addition addition = new Addition(52, 22)

				// Request the sum of two values (52 + 22). The requester will calculate it for you and return a result.
				IQ resultIQ2 = xmppClient.query(IQ.get(Jid.of("${chat.to}@${xmppDomain}/resource"), addition)).getResult()

				callback(resultIQ2.getExtension(Addition.class))
			} catch (StanzaErrorException s) {
				if (s.getCondition() == Condition.SERVICE_UNAVAILABLE) {
					def b
				}
			}

		} else {
			println getStatus()
			throw new XmppConnectionInvalidException("XMPP Session Invalid")
		}
	}

	/**
	 *
	 * @return
	 */
	def getStatus() {
		return xmppClient ? xmppClient.getStatus() : XmppSession.Status.DISCONNECTED
	}

	def discoverServices(Jid anotherEntity) {
		ServiceDiscoveryManager serviceDiscoveryManager = xmppClient.getManager(ServiceDiscoveryManager.class)
		//serviceDiscoveryManager.addFeature("http://cisecurity.org/sacm/sacm-collection")

		InfoNode infoNode = serviceDiscoveryManager.discoverInformation(anotherEntity).result

		println "---> DISCO#INFO"
		println "- FEATURES:"
		infoNode.features.each { f -> println f }
		println "- IDENTITIES:"
		infoNode.identities.each { i -> println "${i.name} (${i.type})" }
		println "- EXTENSIONS:"
		infoNode.extensions.each { e -> println e.items.collect() }

		//serviceDiscoveryManager.setItemProvider("sacm", ResultSetProvider.forItems([]))
//		println "DISCO#ITEMS"
//		ItemNode node = serviceDiscoveryManager.discoverItems(anotherEntity).result
//		println node.node
//		node.items.each { i -> println i.name}
		println "SACM? ${xmppClient.isSupported("http://oval.cisecurity.org/XMLSchema/oval-collections-6", anotherEntity).result}"

		xmppClient.getEnabledFeatures().each { f -> println f}
	}

	def offerFile(Jid anotherEntity) {
		println "OFFERING FILE (I AM --> ${xmppClient.connectedResource})"
		def p = "C:\\_Development\\Projects\\Assessor-Shared\\benchmarks\\Microsoft Windows 10 Release 1709"
		def n = "${p}\\CIS_Microsoft_Windows_10_Enterprise_Release_1709_Benchmark_v1.4.0-xccdf.xml"
		//def n = "${p}\\CIS_Microsoft_Windows_10_Enterprise_Release_1709_Benchmark_v1.4.0-cpe-dictionary.xml"
		def f = new File(n)
		def d = Duration.ofSeconds(60, 0)
		FileTransferManager fileTransferManager = xmppClient.getManager(FileTransferManager.class)
		FileTransfer ft = fileTransferManager.offerFile(f, "Win10", anotherEntity, d).result
		return ft.transfer()
	}

	def lastActivity(Jid anotherEntity) {
		LastActivityManager lastActivityManager = xmppClient.getManager(LastActivityManager.class)
		LastActivity lastActivity = lastActivityManager.getLastActivity(anotherEntity).getResult()
		return lastActivity.seconds
	}

	def createNodes() {
		PubSubManager pubSubManager = xmppClient.getManager(PubSubManager.class)
		PubSubService pubSubService = pubSubManager.createPubSubService(Jid.of(xmppClient.connectedResource.domain))
		//Collection<PubSubFeature> pubSubFeatures = pubSubService.discoverFeatures().result
		PubSubNode policyNode = pubSubService.node("policy")
		policyNode.create()
		PubSubNode actualsNode = pubSubService.node("actuals")
		actualsNode.create()
		def b
	}

	def performCollection(Jid collector, OvalObjects ovalObjects) {
		OvalCollectionManager m = xmppClient.getManager(OvalCollectionManager.class)
		OvalSystemCharacteristics ovalSystemCharacteristics = m.collect(collector, ovalObjects).getResult()
		return ovalSystemCharacteristics
	}

	def performCollectionAndPublish(Jid anotherEntity, OvalObjects ovalObjects) {
		OvalCollectionManager m = xmppClient.getManager(OvalCollectionManager.class)
		OvalSystemCharacteristics ovalSystemCharacteristics = m.collect(anotherEntity, ovalObjects).getResult()

		def allNodesFromAllServices = []

		PubSubManager pubSubManager = xmppClient.getManager(PubSubManager.class)
		List<PubSubService> pubSubServices = pubSubManager.discoverPubSubServices().getResult()
		pubSubServices.each { pss ->
			allNodesFromAllServices.addAll(pss.discoverNodes().getResult())
		}

		PubSubNode node = allNodesFromAllServices.find { n -> n.id == "actuals" }
		if (node) {
			node.publish(ovalSystemCharacteristics)
		}

		return ovalSystemCharacteristics
	}

	/**
	 * This entity tells the collector to collect.
	 * The collector returns system characteristics to this entity
	 * This entity sends the system characteristics to the repository entity
	 * @param collector
	 * @param ovalObjects
	 * @param repository
	 * @return
	 */
	def performCollection(Jid collector, OvalObjects ovalObjects, Jid repository) {
		OvalCollectionManager manager = xmppClient.getManager(OvalCollectionManager.class)
		OvalSystemCharacteristics ovalSystemCharacteristics =
			manager.collectAndForward(collector, ovalObjects, repository).getResult()
		return ovalSystemCharacteristics
	}

	def sendCollectionRequest(Jid requestee, OvalObjects ovalObjects) {
		Message message = new Message(requestee, Message.Type.NORMAL, "[BODY] Payload is a collection request", "[SUBJECT] OVAL collection request")
		message.addExtension(ovalObjects)
		xmppClient.send(message)
	}

	def sendCollectionResponse(Jid respondee, OvalSystemCharacteristics ovalSystemCharacteristics) {
		Message message = new Message(respondee)
		message.addExtension(ovalSystemCharacteristics)
		xmppClient.send(message)
	}

	def sendCSATAverageRequest(Jid recipient, Csat csat) {
		Message message = new Message(recipient, Message.Type.NORMAL, "[BODY] CSAT Average Request", "[SUBJECT] CSAT Average Request")
		message.addExtension(csat)
		xmppClient.sendMessage(message)
	}

	def sendCSATValidationRequest(Jid recipient, Csat csat) {
		Message message = new Message(recipient, Message.Type.NORMAL, "[BODY] CSAT Validation Request", "[SUBJECT] CSAT Validation Request")
		message.addExtension(csat)
		xmppClient.sendMessage(message)
	}

	/**
	 *
	 * @return
	 */
	def initializeXmpp() {
		println "Initialize XMPP"
		// Create a TLS context
		final SSLContext sc = SSLContext.getInstance("TLS")

		TrustManager[] tm = [new TrustAllX509TrustManager()]

		// Set our custom trust manager
		sc.init(null, tm, new SecureRandom())

		SocketConnectionConfiguration tcpConfiguration = SocketConnectionConfiguration.builder()
			.hostname(xmppDomain)
			.port(5222)
			.sslContext(sc)
			.hostnameVerifier(new HostnameVerifier() {
				boolean verify(String urlHostName, SSLSession session) {
					return true
				}
			}).build()

		// Configure the XMPP session configuration
		XmppSessionConfiguration.Builder sessionConfigurationBuilder = XmppSessionConfiguration.builder()
		//XmppSessionConfiguration collectionsConfiguration = XmppSessionConfiguration.builder()
			.extensions(
				//Extension.of(INDEPENDENT_COLLECTION_NS, false, cs),
				//Extension.of(INDEPENDENT_SYSCHAR_NS, false, ss),
				Extension.of(OvalObjects.NAMESPACE, OvalCollectionManager.class, true, OvalObjects.class, OvalSystemCharacteristics.class), // Include OVAL-6 collections
				Extension.of(OvalObjects.class),
				Extension.of(OvalSystemCharacteristics.NAMESPACE, OvalCollectionManager.class, true, OvalObjects.class, OvalSystemCharacteristics.class), // Include OVAL-6 system characteristics
				Extension.of(OvalSystemCharacteristics.class),
				Extension.of(Csat.class),
				Extension.of(Addition.class))  // This is a sample extension from the xmpp.rocks documentation
			.debugger(ConsoleDebugger.class)
			.defaultResponseTimeout(Duration.ofSeconds(30))

		// Load up the package/class definitions for extensions...
		def json = new JsonSlurper().parse(getClass().getResourceAsStream("/packages.json"))

		// COLLECTION
		json."collections".each { collection ->
			Class[] collectionClasses = new Class[collection."classes".size()]
			collection."classes".eachWithIndex { clazz, i -> collectionClasses[i] = Class.forName(clazz) }

			// Add the extension to the builder
			sessionConfigurationBuilder.extensions(Extension.of(collection."namespace", false, collectionClasses))
		}

		// SYSTEM CHARACTERISTICS
		json."system-characteristics".each { scs ->
			Class[] systemCharacteristicsClasses = new Class[scs."classes".size()]
			scs."classes".eachWithIndex { clazz, i -> systemCharacteristicsClasses[i] = Class.forName(clazz) }

			// Add the extension to the builder
			sessionConfigurationBuilder.extensions(Extension.of(scs."namespace", false, systemCharacteristicsClasses))
		}

		// TODO: EVALUATION?

		XmppSessionConfiguration collectionsConfiguration = sessionConfigurationBuilder.build()
		xmppClient = XmppClient.create(xmppDomain, collectionsConfiguration, tcpConfiguration)

//		xmppClient.addOutboundPresenceListener { e ->
//			println "[OUTBOUND PRESENCE]: ${e.getPresence()}"
//		}
//
//		// Listen for presence changes
//		xmppClient.addInboundPresenceListener { e ->
//			println "[INBOUND PRESENCE]: ${e.getPresence()}"
////			Presence presence = e.getPresence()
////
////			// Deal with Presence updates
////			Contact contact = xmppClient.getManager(RosterManager.class).getContact(presence.getFrom())
////			if (contact) {
////				// contact's presence has updated.
////			}
////
////			// Presence Subscription requests
////			if (presence.getType() == Presence.Type.SUBSCRIBE) {
////				// presence.getFrom() wants to subscribe to your presence.
////
////				// Approve:
////				//xmppClient.getManager(PresenceManager.class).approveSubscription(presence.getFrom())
////
////				// Deny:
////				//xmppClient.getManager(PresenceManager.class).denySubscription(presence.getFrom())
////			}
//		}


		// Listen for messages
		xmppClient.addInboundMessageListener { e ->
			Message message = e.getMessage()
			if (message.hasExtension(OvalObjects.class)) {
				OvalObjects oo = message.getExtension(OvalObjects.class)
				println " OVAL OBJECTS :: COLLECTION-ID --> ${oo.collectionId}"

				def ocs = new OvalCollectionSystem(collectionRequest: oo)
				def osc = ocs.collect()

				println " [${xmppClient.connectedResource}] COLLECTED :: COLLECTION-REF --> ${osc.collectionRef}"
			}
		}

		xmppClient.addInboundMessageListener { e ->
			Message message = e.getMessage()
			if (message.hasExtension(OvalSystemCharacteristics.class)) {
				OvalSystemCharacteristics osc = message.getExtension(OvalSystemCharacteristics.class)
				println " OVAL SYSTEM CHARACTERISTICS :: COLLECTION-REF --> ${osc.collectionRef}"
			}
		}

		xmppClient.addInboundMessageListener { e ->
			Message message = e.getMessage()
			if (message.hasExtension(Csat.class)) {
				Csat csat = message.getExtension(Csat.class)
				if (csat.validation) {
					println "RECEIVED CSAT VALIDATION MESSAGE: @validation-key='${csat.validation.licenseKey}'"
				} else if (csat.average) {
					println "RECEIVED CSAT AVERAGE MESSAGE: @industry='${csat.average.industry}' @validation-key='${csat.average.licenseKey}'"
				}
			}
		}

		// Listen for messages
		//xmppClient.addOutboundMessageListener { e -> fmt(e) }

		// IQ HANDLERS
		//iqHandlerServices.each { iqh -> iqh.addIQHandler(xmppClient) }
		xmppClient.addIQHandler(Csat.class, new IQHandler() {
			@Override
			IQ handleRequest(IQ iq) {
				Csat csat = iq.getExtension(Csat.class)
				if (csat.validation) {
					println "RECEIVED CSAT VALIDATION MESSAGE: @validation-key='${csat.validation.licenseKey}'"

					if (csat.validation.licenseKey == "d31f4355-ad3a-4214-ac69-b3625ffe4612") {
						csat.validation.valid = new Valid()
					} else {
						csat.validation.invalid = new Invalid(reason: ["Invalid license key"])
					}
				} else if (csat.average) {
					println "RECEIVED CSAT AVERAGE MESSAGE: @industry='${csat.average.industry}' @validation-key='${csat.average.licenseKey}'"
					csat.average.control << new Control(id: 1, average: 2.3)
					csat.average.control << new Control(id: 2, average: 2.3)
				}
				return iq.createResult(csat)
			}
		})

//		xmppClient.addOutboundIQListener{ e ->
//			println "[OUTBOUND IQ] ${e.IQ}"
//		}
//		xmppClient.addInboundIQListener { e ->
//			println "[OUTBOUND IQ] ${e.IQ}"
//		}

		// Listen for roster pushes
		xmppClient.getManager(RosterManager.class).addRosterListener { e ->
			// Roster has changed
		}


		xmppClient.getManager(FileTransferManager.class).addFileTransferOfferListener { e ->
			println "ACCEPTING FILE TRANSFER (I AM --> ${xmppClient.connectedResource})"
			FileTransfer ft = e.accept(Paths.get(e.getName())).result

			println "ADDING FILE TRANSFER STATUS LISTENER"
			ft.addFileTransferStatusListener { l ->
				if (l.status == FileTransfer.Status.COMPLETED) { println "${l.status}; ${l.bytesTransferred}" }
			}

			println "TRANSFERRING"
			ft.transfer().get(15, TimeUnit.SECONDS)

			println "EXCEPTION?"
			if (ft.exception) { println ft.exception.localizedMessage }

			println "File Transfer --> Status: ${ft.status}; Bytes: ${ft.bytesTransferred}"
		}

		xmppClient.connect()
	}

	/**
	 * Format a message and add it to the conversation
	 */
	def fmt = { e ->
		Message message = e.getMessage()
		def from = message.from ?: xmppClient.getConnectedResource().toString()
		def fm = "[From]: ${from}; [BODY]: ${message.body}"

		println fm

		//swingBuilder."conversation".text += fm + System.lineSeparator()
		callback(fm)
	}
}
