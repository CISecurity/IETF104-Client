//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2019.07.16 at 04:00:30 PM EDT 
//


package org.cisecurity.oval.sc;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;
import org.cisecurity.xmldsig.SignatureType;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the org.cisecurity.oval.sc package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _CollectedItem_QNAME = new QName("http://oval.cisecurity.org/XMLSchema/oval-system-characteristics-6", "collected_item");
    private final static QName _Signature_QNAME = new QName("http://www.w3.org/2000/09/xmldsig#", "Signature");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: org.cisecurity.oval.sc
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link OvalSystemCharacteristics }
     * 
     */
    public OvalSystemCharacteristics createOvalSystemCharacteristics() {
        return new OvalSystemCharacteristics();
    }

    /**
     * Create an instance of {@link SystemInfoType }
     * 
     */
    public SystemInfoType createSystemInfoType() {
        return new SystemInfoType();
    }

    /**
     * Create an instance of {@link CollectedObjectsType }
     * 
     */
    public CollectedObjectsType createCollectedObjectsType() {
        return new CollectedObjectsType();
    }

    /**
     * Create an instance of {@link SystemDataType }
     * 
     */
    public SystemDataType createSystemDataType() {
        return new SystemDataType();
    }

    /**
     * Create an instance of {@link CollectedItemType }
     * 
     */
    public CollectedItemType createCollectedItemType() {
        return new CollectedItemType();
    }

    /**
     * Create an instance of {@link CollectedItemFloatType }
     * 
     */
    public CollectedItemFloatType createCollectedItemFloatType() {
        return new CollectedItemFloatType();
    }

    /**
     * Create an instance of {@link CollectedItemEVRStringType }
     * 
     */
    public CollectedItemEVRStringType createCollectedItemEVRStringType() {
        return new CollectedItemEVRStringType();
    }

    /**
     * Create an instance of {@link CollectedItemDebianEVRStringType }
     * 
     */
    public CollectedItemDebianEVRStringType createCollectedItemDebianEVRStringType() {
        return new CollectedItemDebianEVRStringType();
    }

    /**
     * Create an instance of {@link ReferenceType }
     * 
     */
    public ReferenceType createReferenceType() {
        return new ReferenceType();
    }

    /**
     * Create an instance of {@link CollectedItemAnySimpleType }
     * 
     */
    public CollectedItemAnySimpleType createCollectedItemAnySimpleType() {
        return new CollectedItemAnySimpleType();
    }

    /**
     * Create an instance of {@link InterfaceType }
     * 
     */
    public InterfaceType createInterfaceType() {
        return new InterfaceType();
    }

    /**
     * Create an instance of {@link CollectedItemBinaryType }
     * 
     */
    public CollectedItemBinaryType createCollectedItemBinaryType() {
        return new CollectedItemBinaryType();
    }

    /**
     * Create an instance of {@link CollectedItemFilesetRevisionType }
     * 
     */
    public CollectedItemFilesetRevisionType createCollectedItemFilesetRevisionType() {
        return new CollectedItemFilesetRevisionType();
    }

    /**
     * Create an instance of {@link CollectedItemIPAddressType }
     * 
     */
    public CollectedItemIPAddressType createCollectedItemIPAddressType() {
        return new CollectedItemIPAddressType();
    }

    /**
     * Create an instance of {@link VariableValueType }
     * 
     */
    public VariableValueType createVariableValueType() {
        return new VariableValueType();
    }

    /**
     * Create an instance of {@link CollectedItemStringType }
     * 
     */
    public CollectedItemStringType createCollectedItemStringType() {
        return new CollectedItemStringType();
    }

    /**
     * Create an instance of {@link CollectedItemVersionType }
     * 
     */
    public CollectedItemVersionType createCollectedItemVersionType() {
        return new CollectedItemVersionType();
    }

    /**
     * Create an instance of {@link CollectedItemFieldType }
     * 
     */
    public CollectedItemFieldType createCollectedItemFieldType() {
        return new CollectedItemFieldType();
    }

    /**
     * Create an instance of {@link CollectedItemIPAddressStringType }
     * 
     */
    public CollectedItemIPAddressStringType createCollectedItemIPAddressStringType() {
        return new CollectedItemIPAddressStringType();
    }

    /**
     * Create an instance of {@link CollectedItemIOSVersionType }
     * 
     */
    public CollectedItemIOSVersionType createCollectedItemIOSVersionType() {
        return new CollectedItemIOSVersionType();
    }

    /**
     * Create an instance of {@link CollectedItemRecordType }
     * 
     */
    public CollectedItemRecordType createCollectedItemRecordType() {
        return new CollectedItemRecordType();
    }

    /**
     * Create an instance of {@link CollectedItemBoolType }
     * 
     */
    public CollectedItemBoolType createCollectedItemBoolType() {
        return new CollectedItemBoolType();
    }

    /**
     * Create an instance of {@link CollectedObjectType }
     * 
     */
    public CollectedObjectType createCollectedObjectType() {
        return new CollectedObjectType();
    }

    /**
     * Create an instance of {@link InterfacesType }
     * 
     */
    public InterfacesType createInterfacesType() {
        return new InterfacesType();
    }

    /**
     * Create an instance of {@link CollectedItemIntType }
     * 
     */
    public CollectedItemIntType createCollectedItemIntType() {
        return new CollectedItemIntType();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CollectedItemType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://oval.cisecurity.org/XMLSchema/oval-system-characteristics-6", name = "collected_item")
    public JAXBElement<CollectedItemType> createCollectedItem(CollectedItemType value) {
        return new JAXBElement<CollectedItemType>(_CollectedItem_QNAME, CollectedItemType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SignatureType }{@code >}}
     * 
     */
//    @XmlElementDecl(namespace = "http://www.w3.org/2000/09/xmldsig#", name = "Signature")
//    public JAXBElement<SignatureType> createSignature(SignatureType value) {
//        return new org.cisecurity.xmldsig.ObjectFactory().createSignature(value);
//        //return new JAXBElement<SignatureType>(_Signature_QNAME, SignatureType.class, null, value);
//    }

}