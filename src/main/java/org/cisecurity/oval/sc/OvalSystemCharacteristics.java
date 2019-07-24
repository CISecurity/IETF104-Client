//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2019.07.16 at 04:00:30 PM EDT 
//


package org.cisecurity.oval.sc;

import javax.xml.bind.annotation.*;

import org.cisecurity.oval.common.GeneratorType;
import org.cisecurity.xmldsig.SignatureType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="generator" type="{http://oval.cisecurity.org/XMLSchema/oval-common-6}GeneratorType"/>
 *         &lt;element name="system_info" type="{http://oval.cisecurity.org/XMLSchema/oval-system-characteristics-6}SystemInfoType"/>
 *         &lt;element name="collected_objects" type="{http://oval.cisecurity.org/XMLSchema/oval-system-characteristics-6}CollectedObjectsType" minOccurs="0"/>
 *         &lt;element name="system_data" type="{http://oval.cisecurity.org/XMLSchema/oval-system-characteristics-6}SystemDataType" minOccurs="0"/>
 *         &lt;element ref="{http://www.w3.org/2000/09/xmldsig#}Signature" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "generator",
    "systemInfo",
    "collectedObjects",
    "systemData",
    "signature"
})
@XmlRootElement(name = "oval_system_characteristics", namespace = "http://oval.cisecurity.org/XMLSchema/oval-system-characteristics-6")
public class OvalSystemCharacteristics {

    public static final String NAMESPACE = "http://oval.cisecurity.org/XMLSchema/oval-system-characteristics-6";

    @XmlElement(required = true)
    protected GeneratorType generator;
    @XmlElement(name = "system_info")
    protected SystemInfoType systemInfo;
    @XmlElement(name = "collected_objects")
    protected CollectedObjectsType collectedObjects;
    @XmlElement(name = "system_data")
    protected SystemDataType systemData;
    @XmlElement(name = "Signature", namespace = "http://www.w3.org/2000/09/xmldsig#")
    protected SignatureType signature;

    @XmlAttribute(name = "collection-ref")
    protected String collectionRef;

    /**
     * Gets the value of the generator property.
     * 
     * @return
     *     possible object is
     *     {@link GeneratorType }
     *     
     */
    public GeneratorType getGenerator() {
        return generator;
    }

    /**
     * Sets the value of the generator property.
     * 
     * @param value
     *     allowed object is
     *     {@link GeneratorType }
     *     
     */
    public void setGenerator(GeneratorType value) {
        this.generator = value;
    }

    /**
     * Gets the value of the systemInfo property.
     * 
     * @return
     *     possible object is
     *     {@link SystemInfoType }
     *     
     */
    public SystemInfoType getSystemInfo() {
        return systemInfo;
    }

    /**
     * Sets the value of the systemInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link SystemInfoType }
     *     
     */
    public void setSystemInfo(SystemInfoType value) {
        this.systemInfo = value;
    }

    /**
     * Gets the value of the collectedObjects property.
     * 
     * @return
     *     possible object is
     *     {@link CollectedObjectsType }
     *     
     */
    public CollectedObjectsType getCollectedObjects() {
        return collectedObjects;
    }

    /**
     * Sets the value of the collectedObjects property.
     * 
     * @param value
     *     allowed object is
     *     {@link CollectedObjectsType }
     *     
     */
    public void setCollectedObjects(CollectedObjectsType value) {
        this.collectedObjects = value;
    }

    /**
     * Gets the value of the systemData property.
     * 
     * @return
     *     possible object is
     *     {@link SystemDataType }
     *     
     */
    public SystemDataType getSystemData() {
        return systemData;
    }

    /**
     * Sets the value of the systemData property.
     * 
     * @param value
     *     allowed object is
     *     {@link SystemDataType }
     *     
     */
    public void setSystemData(SystemDataType value) {
        this.systemData = value;
    }

    /**
     * The optional Signature element allows an XML Signature as defined by the W3C to be attached to the document. This allows authentication and data integrity to be provided to the user. Enveloped signatures are supported. More information about the official W3C Recommendation regarding XML digital signatures can be found at http://www.w3.org/TR/xmldsig-core/.
     * 
     * @return
     *     possible object is
     *     {@link SignatureType }
     *     
     */
    public SignatureType getSignature() {
        return signature;
    }

    /**
     * Sets the value of the signature property.
     * 
     * @param value
     *     allowed object is
     *     {@link SignatureType }
     *     
     */
    public void setSignature(SignatureType value) {
        this.signature = value;
    }

    public void setCollectionRef(String collectionRef) { this.collectionRef = collectionRef; }
    public String getCollectionRef() { return collectionRef; }
}
