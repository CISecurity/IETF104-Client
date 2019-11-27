//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2019.11.21 at 11:38:58 AM EST 
//


package org.cisecurity.oval.sc.win;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import org.cisecurity.oval.sc.CollectedItemStringType;
import org.cisecurity.oval.sc.CollectedItemType;


/**
 * The userright_item is used to specify a trustee name and corresponding SID that has been granted a user right/privilege.
 * 
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;extension base="{http://oval.cisecurity.org/XMLSchema/oval-system-characteristics-6}CollectedItemType">
 *       &lt;sequence>
 *         &lt;element name="userright" type="{http://oval.cisecurity.org/XMLSchema/oval-system-characteristics-6#windows}EntityItemUserRightType" minOccurs="0"/>
 *         &lt;element name="trustee_name" type="{http://oval.cisecurity.org/XMLSchema/oval-system-characteristics-6}CollectedItemStringType" minOccurs="0"/>
 *         &lt;element name="trustee_sid" type="{http://oval.cisecurity.org/XMLSchema/oval-system-characteristics-6}CollectedItemStringType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "userright",
    "trusteeName",
    "trusteeSid"
})
public class UserrightItem
    extends CollectedItemType
{

    protected EntityItemUserRightType userright;
    @XmlElement(name = "trustee_name")
    protected CollectedItemStringType trusteeName;
    @XmlElement(name = "trustee_sid")
    protected CollectedItemStringType trusteeSid;

    /**
     * Gets the value of the userright property.
     * 
     * @return
     *     possible object is
     *     {@link EntityItemUserRightType }
     *     
     */
    public EntityItemUserRightType getUserright() {
        return userright;
    }

    /**
     * Sets the value of the userright property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityItemUserRightType }
     *     
     */
    public void setUserright(EntityItemUserRightType value) {
        this.userright = value;
    }

    /**
     * Gets the value of the trusteeName property.
     * 
     * @return
     *     possible object is
     *     {@link CollectedItemStringType }
     *     
     */
    public CollectedItemStringType getTrusteeName() {
        return trusteeName;
    }

    /**
     * Sets the value of the trusteeName property.
     * 
     * @param value
     *     allowed object is
     *     {@link CollectedItemStringType }
     *     
     */
    public void setTrusteeName(CollectedItemStringType value) {
        this.trusteeName = value;
    }

    /**
     * Gets the value of the trusteeSid property.
     * 
     * @return
     *     possible object is
     *     {@link CollectedItemStringType }
     *     
     */
    public CollectedItemStringType getTrusteeSid() {
        return trusteeSid;
    }

    /**
     * Sets the value of the trusteeSid property.
     * 
     * @param value
     *     allowed object is
     *     {@link CollectedItemStringType }
     *     
     */
    public void setTrusteeSid(CollectedItemStringType value) {
        this.trusteeSid = value;
    }

}