//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2019.11.21 at 11:38:58 AM EST 
//


package org.cisecurity.oval.sc.win;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import org.cisecurity.oval.sc.CollectedItemBoolType;
import org.cisecurity.oval.sc.CollectedItemIntType;
import org.cisecurity.oval.sc.CollectedItemStringType;
import org.cisecurity.oval.sc.CollectedItemType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;extension base="{http://oval.cisecurity.org/XMLSchema/oval-system-characteristics-6}CollectedItemType">
 *       &lt;sequence>
 *         &lt;element name="user_sid" type="{http://oval.cisecurity.org/XMLSchema/oval-system-characteristics-6}CollectedItemStringType" minOccurs="0"/>
 *         &lt;element name="enabled" type="{http://oval.cisecurity.org/XMLSchema/oval-system-characteristics-6}CollectedItemBoolType" minOccurs="0"/>
 *         &lt;element name="group_sid" type="{http://oval.cisecurity.org/XMLSchema/oval-system-characteristics-6}CollectedItemStringType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="last_logon" type="{http://oval.cisecurity.org/XMLSchema/oval-system-characteristics-6}CollectedItemIntType" minOccurs="0"/>
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
    "userSid",
    "enabled",
    "groupSid",
    "lastLogon"
})
public class UserSidItem
    extends CollectedItemType
{

    @XmlElement(name = "user_sid")
    protected CollectedItemStringType userSid;
    protected CollectedItemBoolType enabled;
    @XmlElement(name = "group_sid")
    protected List<CollectedItemStringType> groupSid;
    @XmlElement(name = "last_logon")
    protected CollectedItemIntType lastLogon;

    /**
     * Gets the value of the userSid property.
     * 
     * @return
     *     possible object is
     *     {@link CollectedItemStringType }
     *     
     */
    public CollectedItemStringType getUserSid() {
        return userSid;
    }

    /**
     * Sets the value of the userSid property.
     * 
     * @param value
     *     allowed object is
     *     {@link CollectedItemStringType }
     *     
     */
    public void setUserSid(CollectedItemStringType value) {
        this.userSid = value;
    }

    /**
     * Gets the value of the enabled property.
     * 
     * @return
     *     possible object is
     *     {@link CollectedItemBoolType }
     *     
     */
    public CollectedItemBoolType getEnabled() {
        return enabled;
    }

    /**
     * Sets the value of the enabled property.
     * 
     * @param value
     *     allowed object is
     *     {@link CollectedItemBoolType }
     *     
     */
    public void setEnabled(CollectedItemBoolType value) {
        this.enabled = value;
    }

    /**
     * Gets the value of the groupSid property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the groupSid property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getGroupSid().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CollectedItemStringType }
     * 
     * 
     */
    public List<CollectedItemStringType> getGroupSid() {
        if (groupSid == null) {
            groupSid = new ArrayList<CollectedItemStringType>();
        }
        return this.groupSid;
    }

    /**
     * Gets the value of the lastLogon property.
     * 
     * @return
     *     possible object is
     *     {@link CollectedItemIntType }
     *     
     */
    public CollectedItemIntType getLastLogon() {
        return lastLogon;
    }

    /**
     * Sets the value of the lastLogon property.
     * 
     * @param value
     *     allowed object is
     *     {@link CollectedItemIntType }
     *     
     */
    public void setLastLogon(CollectedItemIntType value) {
        this.lastLogon = value;
    }

}
