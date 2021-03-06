//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2019.08.05 at 06:06:48 PM EDT 
//


package org.cisecurity.oval.collection.ind;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.*;

import org.cisecurity.oval.collection.ObjectFilter;
import org.cisecurity.oval.collection.ObjectStringType;
import org.cisecurity.oval.collection.ObjectType;
import org.cisecurity.oval.collection.Set;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;extension base="{http://oval.cisecurity.org/XMLSchema/oval-collections-6}ObjectType">
 *       &lt;sequence>
 *         &lt;choice>
 *           &lt;element ref="{http://oval.cisecurity.org/XMLSchema/oval-collections-6}set"/>
 *           &lt;sequence>
 *             &lt;element name="behaviors" type="{http://oval.cisecurity.org/XMLSchema/oval-collections-6#independent}FileBehaviors" minOccurs="0"/>
 *             &lt;choice>
 *               &lt;element name="filepath" type="{http://oval.cisecurity.org/XMLSchema/oval-collections-6}ObjectStringType"/>
 *               &lt;sequence>
 *                 &lt;element name="path" type="{http://oval.cisecurity.org/XMLSchema/oval-collections-6}ObjectStringType"/>
 *                 &lt;element name="filename" type="{http://oval.cisecurity.org/XMLSchema/oval-collections-6}ObjectStringType"/>
 *               &lt;/sequence>
 *             &lt;/choice>
 *             &lt;element name="xpath" type="{http://oval.cisecurity.org/XMLSchema/oval-collections-6}ObjectStringType"/>
 *             &lt;element ref="{http://oval.cisecurity.org/XMLSchema/oval-collections-6}object_filter" maxOccurs="unbounded" minOccurs="0"/>
 *           &lt;/sequence>
 *         &lt;/choice>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlRootElement(name = "xmlfilecontent_object")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "set",
    "behaviors",
    "filepath",
    "path",
    "filename",
    "xpath",
    "objectFilter"
})
public class XmlfilecontentObject
    extends ObjectType
{

    @XmlElement(namespace = "http://oval.cisecurity.org/XMLSchema/oval-collections-6")
    protected Set set;
    protected FileBehaviors behaviors;
    protected ObjectStringType filepath;
    protected ObjectStringType path;
    protected ObjectStringType filename;
    protected ObjectStringType xpath;
    @XmlElement(name = "object_filter", namespace = "http://oval.cisecurity.org/XMLSchema/oval-collections-6")
    protected List<ObjectFilter> objectFilter;

    /**
     * Gets the value of the set property.
     * 
     * @return
     *     possible object is
     *     {@link Set }
     *     
     */
    public Set getSet() {
        return set;
    }

    /**
     * Sets the value of the set property.
     * 
     * @param value
     *     allowed object is
     *     {@link Set }
     *     
     */
    public void setSet(Set value) {
        this.set = value;
    }

    /**
     * Gets the value of the behaviors property.
     * 
     * @return
     *     possible object is
     *     {@link FileBehaviors }
     *     
     */
    public FileBehaviors getBehaviors() {
        return behaviors;
    }

    /**
     * Sets the value of the behaviors property.
     * 
     * @param value
     *     allowed object is
     *     {@link FileBehaviors }
     *     
     */
    public void setBehaviors(FileBehaviors value) {
        this.behaviors = value;
    }

    /**
     * Gets the value of the filepath property.
     * 
     * @return
     *     possible object is
     *     {@link ObjectStringType }
     *     
     */
    public ObjectStringType getFilepath() {
        return filepath;
    }

    /**
     * Sets the value of the filepath property.
     * 
     * @param value
     *     allowed object is
     *     {@link ObjectStringType }
     *     
     */
    public void setFilepath(ObjectStringType value) {
        this.filepath = value;
    }

    /**
     * Gets the value of the path property.
     * 
     * @return
     *     possible object is
     *     {@link ObjectStringType }
     *     
     */
    public ObjectStringType getPath() {
        return path;
    }

    /**
     * Sets the value of the path property.
     * 
     * @param value
     *     allowed object is
     *     {@link ObjectStringType }
     *     
     */
    public void setPath(ObjectStringType value) {
        this.path = value;
    }

    /**
     * Gets the value of the filename property.
     * 
     * @return
     *     possible object is
     *     {@link ObjectStringType }
     *     
     */
    public ObjectStringType getFilename() {
        return filename;
    }

    /**
     * Sets the value of the filename property.
     * 
     * @param value
     *     allowed object is
     *     {@link ObjectStringType }
     *     
     */
    public void setFilename(ObjectStringType value) {
        this.filename = value;
    }

    /**
     * Gets the value of the xpath property.
     * 
     * @return
     *     possible object is
     *     {@link ObjectStringType }
     *     
     */
    public ObjectStringType getXpath() {
        return xpath;
    }

    /**
     * Sets the value of the xpath property.
     * 
     * @param value
     *     allowed object is
     *     {@link ObjectStringType }
     *     
     */
    public void setXpath(ObjectStringType value) {
        this.xpath = value;
    }

    /**
     * Gets the value of the objectFilter property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the objectFilter property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getObjectFilter().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ObjectFilter }
     * 
     * 
     */
    public List<ObjectFilter> getObjectFilter() {
        if (objectFilter == null) {
            objectFilter = new ArrayList<ObjectFilter>();
        }
        return this.objectFilter;
    }

}
