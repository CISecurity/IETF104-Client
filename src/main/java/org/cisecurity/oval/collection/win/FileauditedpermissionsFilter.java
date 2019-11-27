//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2019.11.21 at 11:38:45 AM EST 
//


package org.cisecurity.oval.collection.win;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import org.cisecurity.oval.collection.FilterStringType;
import org.cisecurity.oval.collection.FilterType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;extension base="{http://oval.cisecurity.org/XMLSchema/oval-collections-6}FilterType">
 *       &lt;sequence>
 *         &lt;element name="filepath" type="{http://oval.cisecurity.org/XMLSchema/oval-collections-6}FilterStringType" minOccurs="0"/>
 *         &lt;element name="path" type="{http://oval.cisecurity.org/XMLSchema/oval-collections-6}FilterStringType" minOccurs="0"/>
 *         &lt;element name="filename" type="{http://oval.cisecurity.org/XMLSchema/oval-collections-6}FilterStringType" minOccurs="0"/>
 *         &lt;element name="trustee_sid" type="{http://oval.cisecurity.org/XMLSchema/oval-collections-6}FilterStringType" minOccurs="0"/>
 *         &lt;element name="standard_delete" type="{http://oval.cisecurity.org/XMLSchema/oval-collections-6#windows}FilterAuditType" minOccurs="0"/>
 *         &lt;element name="standard_read_control" type="{http://oval.cisecurity.org/XMLSchema/oval-collections-6#windows}FilterAuditType" minOccurs="0"/>
 *         &lt;element name="standard_write_dac" type="{http://oval.cisecurity.org/XMLSchema/oval-collections-6#windows}FilterAuditType" minOccurs="0"/>
 *         &lt;element name="standard_write_owner" type="{http://oval.cisecurity.org/XMLSchema/oval-collections-6#windows}FilterAuditType" minOccurs="0"/>
 *         &lt;element name="standard_synchronize" type="{http://oval.cisecurity.org/XMLSchema/oval-collections-6#windows}FilterAuditType" minOccurs="0"/>
 *         &lt;element name="access_system_security" type="{http://oval.cisecurity.org/XMLSchema/oval-collections-6#windows}FilterAuditType" minOccurs="0"/>
 *         &lt;element name="generic_read" type="{http://oval.cisecurity.org/XMLSchema/oval-collections-6#windows}FilterAuditType" minOccurs="0"/>
 *         &lt;element name="generic_write" type="{http://oval.cisecurity.org/XMLSchema/oval-collections-6#windows}FilterAuditType" minOccurs="0"/>
 *         &lt;element name="generic_execute" type="{http://oval.cisecurity.org/XMLSchema/oval-collections-6#windows}FilterAuditType" minOccurs="0"/>
 *         &lt;element name="generic_all" type="{http://oval.cisecurity.org/XMLSchema/oval-collections-6#windows}FilterAuditType" minOccurs="0"/>
 *         &lt;element name="file_read_data" type="{http://oval.cisecurity.org/XMLSchema/oval-collections-6#windows}FilterAuditType" minOccurs="0"/>
 *         &lt;element name="file_write_data" type="{http://oval.cisecurity.org/XMLSchema/oval-collections-6#windows}FilterAuditType" minOccurs="0"/>
 *         &lt;element name="file_append_data" type="{http://oval.cisecurity.org/XMLSchema/oval-collections-6#windows}FilterAuditType" minOccurs="0"/>
 *         &lt;element name="file_read_ea" type="{http://oval.cisecurity.org/XMLSchema/oval-collections-6#windows}FilterAuditType" minOccurs="0"/>
 *         &lt;element name="file_write_ea" type="{http://oval.cisecurity.org/XMLSchema/oval-collections-6#windows}FilterAuditType" minOccurs="0"/>
 *         &lt;element name="file_execute" type="{http://oval.cisecurity.org/XMLSchema/oval-collections-6#windows}FilterAuditType" minOccurs="0"/>
 *         &lt;element name="file_delete_child" type="{http://oval.cisecurity.org/XMLSchema/oval-collections-6#windows}FilterAuditType" minOccurs="0"/>
 *         &lt;element name="file_read_attributes" type="{http://oval.cisecurity.org/XMLSchema/oval-collections-6#windows}FilterAuditType" minOccurs="0"/>
 *         &lt;element name="file_write_attributes" type="{http://oval.cisecurity.org/XMLSchema/oval-collections-6#windows}FilterAuditType" minOccurs="0"/>
 *         &lt;element name="windows_view" type="{http://oval.cisecurity.org/XMLSchema/oval-collections-6#windows}FilterWindowsViewType" minOccurs="0"/>
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
    "filepath",
    "path",
    "filename",
    "trusteeSid",
    "standardDelete",
    "standardReadControl",
    "standardWriteDac",
    "standardWriteOwner",
    "standardSynchronize",
    "accessSystemSecurity",
    "genericRead",
    "genericWrite",
    "genericExecute",
    "genericAll",
    "fileReadData",
    "fileWriteData",
    "fileAppendData",
    "fileReadEa",
    "fileWriteEa",
    "fileExecute",
    "fileDeleteChild",
    "fileReadAttributes",
    "fileWriteAttributes",
    "windowsView"
})
public class FileauditedpermissionsFilter
    extends FilterType
{

    protected FilterStringType filepath;
    protected FilterStringType path;
    protected FilterStringType filename;
    @XmlElement(name = "trustee_sid")
    protected FilterStringType trusteeSid;
    @XmlElement(name = "standard_delete")
    protected FilterAuditType standardDelete;
    @XmlElement(name = "standard_read_control")
    protected FilterAuditType standardReadControl;
    @XmlElement(name = "standard_write_dac")
    protected FilterAuditType standardWriteDac;
    @XmlElement(name = "standard_write_owner")
    protected FilterAuditType standardWriteOwner;
    @XmlElement(name = "standard_synchronize")
    protected FilterAuditType standardSynchronize;
    @XmlElement(name = "access_system_security")
    protected FilterAuditType accessSystemSecurity;
    @XmlElement(name = "generic_read")
    protected FilterAuditType genericRead;
    @XmlElement(name = "generic_write")
    protected FilterAuditType genericWrite;
    @XmlElement(name = "generic_execute")
    protected FilterAuditType genericExecute;
    @XmlElement(name = "generic_all")
    protected FilterAuditType genericAll;
    @XmlElement(name = "file_read_data")
    protected FilterAuditType fileReadData;
    @XmlElement(name = "file_write_data")
    protected FilterAuditType fileWriteData;
    @XmlElement(name = "file_append_data")
    protected FilterAuditType fileAppendData;
    @XmlElement(name = "file_read_ea")
    protected FilterAuditType fileReadEa;
    @XmlElement(name = "file_write_ea")
    protected FilterAuditType fileWriteEa;
    @XmlElement(name = "file_execute")
    protected FilterAuditType fileExecute;
    @XmlElement(name = "file_delete_child")
    protected FilterAuditType fileDeleteChild;
    @XmlElement(name = "file_read_attributes")
    protected FilterAuditType fileReadAttributes;
    @XmlElement(name = "file_write_attributes")
    protected FilterAuditType fileWriteAttributes;
    @XmlElement(name = "windows_view")
    protected FilterWindowsViewType windowsView;

    /**
     * Gets the value of the filepath property.
     * 
     * @return
     *     possible object is
     *     {@link FilterStringType }
     *     
     */
    public FilterStringType getFilepath() {
        return filepath;
    }

    /**
     * Sets the value of the filepath property.
     * 
     * @param value
     *     allowed object is
     *     {@link FilterStringType }
     *     
     */
    public void setFilepath(FilterStringType value) {
        this.filepath = value;
    }

    /**
     * Gets the value of the path property.
     * 
     * @return
     *     possible object is
     *     {@link FilterStringType }
     *     
     */
    public FilterStringType getPath() {
        return path;
    }

    /**
     * Sets the value of the path property.
     * 
     * @param value
     *     allowed object is
     *     {@link FilterStringType }
     *     
     */
    public void setPath(FilterStringType value) {
        this.path = value;
    }

    /**
     * Gets the value of the filename property.
     * 
     * @return
     *     possible object is
     *     {@link FilterStringType }
     *     
     */
    public FilterStringType getFilename() {
        return filename;
    }

    /**
     * Sets the value of the filename property.
     * 
     * @param value
     *     allowed object is
     *     {@link FilterStringType }
     *     
     */
    public void setFilename(FilterStringType value) {
        this.filename = value;
    }

    /**
     * Gets the value of the trusteeSid property.
     * 
     * @return
     *     possible object is
     *     {@link FilterStringType }
     *     
     */
    public FilterStringType getTrusteeSid() {
        return trusteeSid;
    }

    /**
     * Sets the value of the trusteeSid property.
     * 
     * @param value
     *     allowed object is
     *     {@link FilterStringType }
     *     
     */
    public void setTrusteeSid(FilterStringType value) {
        this.trusteeSid = value;
    }

    /**
     * Gets the value of the standardDelete property.
     * 
     * @return
     *     possible object is
     *     {@link FilterAuditType }
     *     
     */
    public FilterAuditType getStandardDelete() {
        return standardDelete;
    }

    /**
     * Sets the value of the standardDelete property.
     * 
     * @param value
     *     allowed object is
     *     {@link FilterAuditType }
     *     
     */
    public void setStandardDelete(FilterAuditType value) {
        this.standardDelete = value;
    }

    /**
     * Gets the value of the standardReadControl property.
     * 
     * @return
     *     possible object is
     *     {@link FilterAuditType }
     *     
     */
    public FilterAuditType getStandardReadControl() {
        return standardReadControl;
    }

    /**
     * Sets the value of the standardReadControl property.
     * 
     * @param value
     *     allowed object is
     *     {@link FilterAuditType }
     *     
     */
    public void setStandardReadControl(FilterAuditType value) {
        this.standardReadControl = value;
    }

    /**
     * Gets the value of the standardWriteDac property.
     * 
     * @return
     *     possible object is
     *     {@link FilterAuditType }
     *     
     */
    public FilterAuditType getStandardWriteDac() {
        return standardWriteDac;
    }

    /**
     * Sets the value of the standardWriteDac property.
     * 
     * @param value
     *     allowed object is
     *     {@link FilterAuditType }
     *     
     */
    public void setStandardWriteDac(FilterAuditType value) {
        this.standardWriteDac = value;
    }

    /**
     * Gets the value of the standardWriteOwner property.
     * 
     * @return
     *     possible object is
     *     {@link FilterAuditType }
     *     
     */
    public FilterAuditType getStandardWriteOwner() {
        return standardWriteOwner;
    }

    /**
     * Sets the value of the standardWriteOwner property.
     * 
     * @param value
     *     allowed object is
     *     {@link FilterAuditType }
     *     
     */
    public void setStandardWriteOwner(FilterAuditType value) {
        this.standardWriteOwner = value;
    }

    /**
     * Gets the value of the standardSynchronize property.
     * 
     * @return
     *     possible object is
     *     {@link FilterAuditType }
     *     
     */
    public FilterAuditType getStandardSynchronize() {
        return standardSynchronize;
    }

    /**
     * Sets the value of the standardSynchronize property.
     * 
     * @param value
     *     allowed object is
     *     {@link FilterAuditType }
     *     
     */
    public void setStandardSynchronize(FilterAuditType value) {
        this.standardSynchronize = value;
    }

    /**
     * Gets the value of the accessSystemSecurity property.
     * 
     * @return
     *     possible object is
     *     {@link FilterAuditType }
     *     
     */
    public FilterAuditType getAccessSystemSecurity() {
        return accessSystemSecurity;
    }

    /**
     * Sets the value of the accessSystemSecurity property.
     * 
     * @param value
     *     allowed object is
     *     {@link FilterAuditType }
     *     
     */
    public void setAccessSystemSecurity(FilterAuditType value) {
        this.accessSystemSecurity = value;
    }

    /**
     * Gets the value of the genericRead property.
     * 
     * @return
     *     possible object is
     *     {@link FilterAuditType }
     *     
     */
    public FilterAuditType getGenericRead() {
        return genericRead;
    }

    /**
     * Sets the value of the genericRead property.
     * 
     * @param value
     *     allowed object is
     *     {@link FilterAuditType }
     *     
     */
    public void setGenericRead(FilterAuditType value) {
        this.genericRead = value;
    }

    /**
     * Gets the value of the genericWrite property.
     * 
     * @return
     *     possible object is
     *     {@link FilterAuditType }
     *     
     */
    public FilterAuditType getGenericWrite() {
        return genericWrite;
    }

    /**
     * Sets the value of the genericWrite property.
     * 
     * @param value
     *     allowed object is
     *     {@link FilterAuditType }
     *     
     */
    public void setGenericWrite(FilterAuditType value) {
        this.genericWrite = value;
    }

    /**
     * Gets the value of the genericExecute property.
     * 
     * @return
     *     possible object is
     *     {@link FilterAuditType }
     *     
     */
    public FilterAuditType getGenericExecute() {
        return genericExecute;
    }

    /**
     * Sets the value of the genericExecute property.
     * 
     * @param value
     *     allowed object is
     *     {@link FilterAuditType }
     *     
     */
    public void setGenericExecute(FilterAuditType value) {
        this.genericExecute = value;
    }

    /**
     * Gets the value of the genericAll property.
     * 
     * @return
     *     possible object is
     *     {@link FilterAuditType }
     *     
     */
    public FilterAuditType getGenericAll() {
        return genericAll;
    }

    /**
     * Sets the value of the genericAll property.
     * 
     * @param value
     *     allowed object is
     *     {@link FilterAuditType }
     *     
     */
    public void setGenericAll(FilterAuditType value) {
        this.genericAll = value;
    }

    /**
     * Gets the value of the fileReadData property.
     * 
     * @return
     *     possible object is
     *     {@link FilterAuditType }
     *     
     */
    public FilterAuditType getFileReadData() {
        return fileReadData;
    }

    /**
     * Sets the value of the fileReadData property.
     * 
     * @param value
     *     allowed object is
     *     {@link FilterAuditType }
     *     
     */
    public void setFileReadData(FilterAuditType value) {
        this.fileReadData = value;
    }

    /**
     * Gets the value of the fileWriteData property.
     * 
     * @return
     *     possible object is
     *     {@link FilterAuditType }
     *     
     */
    public FilterAuditType getFileWriteData() {
        return fileWriteData;
    }

    /**
     * Sets the value of the fileWriteData property.
     * 
     * @param value
     *     allowed object is
     *     {@link FilterAuditType }
     *     
     */
    public void setFileWriteData(FilterAuditType value) {
        this.fileWriteData = value;
    }

    /**
     * Gets the value of the fileAppendData property.
     * 
     * @return
     *     possible object is
     *     {@link FilterAuditType }
     *     
     */
    public FilterAuditType getFileAppendData() {
        return fileAppendData;
    }

    /**
     * Sets the value of the fileAppendData property.
     * 
     * @param value
     *     allowed object is
     *     {@link FilterAuditType }
     *     
     */
    public void setFileAppendData(FilterAuditType value) {
        this.fileAppendData = value;
    }

    /**
     * Gets the value of the fileReadEa property.
     * 
     * @return
     *     possible object is
     *     {@link FilterAuditType }
     *     
     */
    public FilterAuditType getFileReadEa() {
        return fileReadEa;
    }

    /**
     * Sets the value of the fileReadEa property.
     * 
     * @param value
     *     allowed object is
     *     {@link FilterAuditType }
     *     
     */
    public void setFileReadEa(FilterAuditType value) {
        this.fileReadEa = value;
    }

    /**
     * Gets the value of the fileWriteEa property.
     * 
     * @return
     *     possible object is
     *     {@link FilterAuditType }
     *     
     */
    public FilterAuditType getFileWriteEa() {
        return fileWriteEa;
    }

    /**
     * Sets the value of the fileWriteEa property.
     * 
     * @param value
     *     allowed object is
     *     {@link FilterAuditType }
     *     
     */
    public void setFileWriteEa(FilterAuditType value) {
        this.fileWriteEa = value;
    }

    /**
     * Gets the value of the fileExecute property.
     * 
     * @return
     *     possible object is
     *     {@link FilterAuditType }
     *     
     */
    public FilterAuditType getFileExecute() {
        return fileExecute;
    }

    /**
     * Sets the value of the fileExecute property.
     * 
     * @param value
     *     allowed object is
     *     {@link FilterAuditType }
     *     
     */
    public void setFileExecute(FilterAuditType value) {
        this.fileExecute = value;
    }

    /**
     * Gets the value of the fileDeleteChild property.
     * 
     * @return
     *     possible object is
     *     {@link FilterAuditType }
     *     
     */
    public FilterAuditType getFileDeleteChild() {
        return fileDeleteChild;
    }

    /**
     * Sets the value of the fileDeleteChild property.
     * 
     * @param value
     *     allowed object is
     *     {@link FilterAuditType }
     *     
     */
    public void setFileDeleteChild(FilterAuditType value) {
        this.fileDeleteChild = value;
    }

    /**
     * Gets the value of the fileReadAttributes property.
     * 
     * @return
     *     possible object is
     *     {@link FilterAuditType }
     *     
     */
    public FilterAuditType getFileReadAttributes() {
        return fileReadAttributes;
    }

    /**
     * Sets the value of the fileReadAttributes property.
     * 
     * @param value
     *     allowed object is
     *     {@link FilterAuditType }
     *     
     */
    public void setFileReadAttributes(FilterAuditType value) {
        this.fileReadAttributes = value;
    }

    /**
     * Gets the value of the fileWriteAttributes property.
     * 
     * @return
     *     possible object is
     *     {@link FilterAuditType }
     *     
     */
    public FilterAuditType getFileWriteAttributes() {
        return fileWriteAttributes;
    }

    /**
     * Sets the value of the fileWriteAttributes property.
     * 
     * @param value
     *     allowed object is
     *     {@link FilterAuditType }
     *     
     */
    public void setFileWriteAttributes(FilterAuditType value) {
        this.fileWriteAttributes = value;
    }

    /**
     * Gets the value of the windowsView property.
     * 
     * @return
     *     possible object is
     *     {@link FilterWindowsViewType }
     *     
     */
    public FilterWindowsViewType getWindowsView() {
        return windowsView;
    }

    /**
     * Sets the value of the windowsView property.
     * 
     * @param value
     *     allowed object is
     *     {@link FilterWindowsViewType }
     *     
     */
    public void setWindowsView(FilterWindowsViewType value) {
        this.windowsView = value;
    }

}