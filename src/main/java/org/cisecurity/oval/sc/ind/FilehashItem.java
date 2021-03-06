//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2019.07.20 at 09:27:07 AM EDT 
//


package org.cisecurity.oval.sc.ind;

import javax.xml.bind.annotation.*;

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
 *         &lt;element name="filepath" type="{http://oval.cisecurity.org/XMLSchema/oval-system-characteristics-6}CollectedItemStringType" minOccurs="0"/>
 *         &lt;element name="path" type="{http://oval.cisecurity.org/XMLSchema/oval-system-characteristics-6}CollectedItemStringType" minOccurs="0"/>
 *         &lt;element name="filename" type="{http://oval.cisecurity.org/XMLSchema/oval-system-characteristics-6}CollectedItemStringType" minOccurs="0"/>
 *         &lt;element name="hash_type" type="{http://oval.cisecurity.org/XMLSchema/oval-system-characteristics-6#independent}EntityItemHashTypeType" minOccurs="0"/>
 *         &lt;element name="hash" type="{http://oval.cisecurity.org/XMLSchema/oval-system-characteristics-6}CollectedItemStringType" minOccurs="0"/>
 *         &lt;element name="windows_view" type="{http://oval.cisecurity.org/XMLSchema/oval-system-characteristics-6#independent}EntityItemWindowsViewType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlRootElement(name = "filehash_item")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "filepath",
    "path",
    "filename",
    "hashType",
    "hash",
    "windowsView"
})
public class FilehashItem
    extends CollectedItemType
{

    protected CollectedItemStringType filepath;
    protected CollectedItemStringType path;
    protected CollectedItemStringType filename;
    @XmlElement(name = "hash_type")
    protected EntityItemHashTypeType hashType;
    protected CollectedItemStringType hash;
    @XmlElement(name = "windows_view")
    protected EntityItemWindowsViewType windowsView;

    /**
     * Gets the value of the filepath property.
     * 
     * @return
     *     possible object is
     *     {@link CollectedItemStringType }
     *     
     */
    public CollectedItemStringType getFilepath() {
        return filepath;
    }

    /**
     * Sets the value of the filepath property.
     * 
     * @param value
     *     allowed object is
     *     {@link CollectedItemStringType }
     *     
     */
    public void setFilepath(CollectedItemStringType value) {
        this.filepath = value;
    }

    /**
     * Gets the value of the path property.
     * 
     * @return
     *     possible object is
     *     {@link CollectedItemStringType }
     *     
     */
    public CollectedItemStringType getPath() {
        return path;
    }

    /**
     * Sets the value of the path property.
     * 
     * @param value
     *     allowed object is
     *     {@link CollectedItemStringType }
     *     
     */
    public void setPath(CollectedItemStringType value) {
        this.path = value;
    }

    /**
     * Gets the value of the filename property.
     * 
     * @return
     *     possible object is
     *     {@link CollectedItemStringType }
     *     
     */
    public CollectedItemStringType getFilename() {
        return filename;
    }

    /**
     * Sets the value of the filename property.
     * 
     * @param value
     *     allowed object is
     *     {@link CollectedItemStringType }
     *     
     */
    public void setFilename(CollectedItemStringType value) {
        this.filename = value;
    }

    /**
     * Gets the value of the hashType property.
     * 
     * @return
     *     possible object is
     *     {@link EntityItemHashTypeType }
     *     
     */
    public EntityItemHashTypeType getHashType() {
        return hashType;
    }

    /**
     * Sets the value of the hashType property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityItemHashTypeType }
     *     
     */
    public void setHashType(EntityItemHashTypeType value) {
        this.hashType = value;
    }

    /**
     * Gets the value of the hash property.
     * 
     * @return
     *     possible object is
     *     {@link CollectedItemStringType }
     *     
     */
    public CollectedItemStringType getHash() {
        return hash;
    }

    /**
     * Sets the value of the hash property.
     * 
     * @param value
     *     allowed object is
     *     {@link CollectedItemStringType }
     *     
     */
    public void setHash(CollectedItemStringType value) {
        this.hash = value;
    }

    /**
     * Gets the value of the windowsView property.
     * 
     * @return
     *     possible object is
     *     {@link EntityItemWindowsViewType }
     *     
     */
    public EntityItemWindowsViewType getWindowsView() {
        return windowsView;
    }

    /**
     * Sets the value of the windowsView property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityItemWindowsViewType }
     *     
     */
    public void setWindowsView(EntityItemWindowsViewType value) {
        this.windowsView = value;
    }

}
