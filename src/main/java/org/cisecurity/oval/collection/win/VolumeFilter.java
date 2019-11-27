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
import org.cisecurity.oval.collection.FilterBoolType;
import org.cisecurity.oval.collection.FilterIntType;
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
 *         &lt;element name="rootpath" type="{http://oval.cisecurity.org/XMLSchema/oval-collections-6}FilterStringType" minOccurs="0"/>
 *         &lt;element name="file_system" type="{http://oval.cisecurity.org/XMLSchema/oval-collections-6}FilterStringType" minOccurs="0"/>
 *         &lt;element name="name" type="{http://oval.cisecurity.org/XMLSchema/oval-collections-6}FilterStringType" minOccurs="0"/>
 *         &lt;element name="drive_type" type="{http://oval.cisecurity.org/XMLSchema/oval-collections-6#windows}FilterDriveTypeType" minOccurs="0"/>
 *         &lt;element name="volume_max_component_length" type="{http://oval.cisecurity.org/XMLSchema/oval-collections-6}FilterIntType" minOccurs="0"/>
 *         &lt;element name="serial_number" type="{http://oval.cisecurity.org/XMLSchema/oval-collections-6}FilterIntType" minOccurs="0"/>
 *         &lt;element name="file_case_sensitive_search" type="{http://oval.cisecurity.org/XMLSchema/oval-collections-6}FilterBoolType" minOccurs="0"/>
 *         &lt;element name="file_case_preserved_names" type="{http://oval.cisecurity.org/XMLSchema/oval-collections-6}FilterBoolType" minOccurs="0"/>
 *         &lt;element name="file_unicode_on_disk" type="{http://oval.cisecurity.org/XMLSchema/oval-collections-6}FilterBoolType" minOccurs="0"/>
 *         &lt;element name="file_persistent_acls" type="{http://oval.cisecurity.org/XMLSchema/oval-collections-6}FilterBoolType" minOccurs="0"/>
 *         &lt;element name="file_file_compression" type="{http://oval.cisecurity.org/XMLSchema/oval-collections-6}FilterBoolType" minOccurs="0"/>
 *         &lt;element name="file_volume_quotas" type="{http://oval.cisecurity.org/XMLSchema/oval-collections-6}FilterBoolType" minOccurs="0"/>
 *         &lt;element name="file_supports_sparse_files" type="{http://oval.cisecurity.org/XMLSchema/oval-collections-6}FilterBoolType" minOccurs="0"/>
 *         &lt;element name="file_supports_reparse_points" type="{http://oval.cisecurity.org/XMLSchema/oval-collections-6}FilterBoolType" minOccurs="0"/>
 *         &lt;element name="file_supports_remote_storage" type="{http://oval.cisecurity.org/XMLSchema/oval-collections-6}FilterBoolType" minOccurs="0"/>
 *         &lt;element name="file_volume_is_compressed" type="{http://oval.cisecurity.org/XMLSchema/oval-collections-6}FilterBoolType" minOccurs="0"/>
 *         &lt;element name="file_supports_object_ids" type="{http://oval.cisecurity.org/XMLSchema/oval-collections-6}FilterBoolType" minOccurs="0"/>
 *         &lt;element name="file_supports_encryption" type="{http://oval.cisecurity.org/XMLSchema/oval-collections-6}FilterBoolType" minOccurs="0"/>
 *         &lt;element name="file_named_streams" type="{http://oval.cisecurity.org/XMLSchema/oval-collections-6}FilterBoolType" minOccurs="0"/>
 *         &lt;element name="file_read_only_volume" type="{http://oval.cisecurity.org/XMLSchema/oval-collections-6}FilterBoolType" minOccurs="0"/>
 *         &lt;element name="file_sequential_write_once" type="{http://oval.cisecurity.org/XMLSchema/oval-collections-6}FilterBoolType" minOccurs="0"/>
 *         &lt;element name="file_supports_transactions" type="{http://oval.cisecurity.org/XMLSchema/oval-collections-6}FilterBoolType" minOccurs="0"/>
 *         &lt;element name="file_supports_hard_links" type="{http://oval.cisecurity.org/XMLSchema/oval-collections-6}FilterBoolType" minOccurs="0"/>
 *         &lt;element name="file_supports_extended_attributes" type="{http://oval.cisecurity.org/XMLSchema/oval-collections-6}FilterBoolType" minOccurs="0"/>
 *         &lt;element name="file_supports_open_by_file_id" type="{http://oval.cisecurity.org/XMLSchema/oval-collections-6}FilterBoolType" minOccurs="0"/>
 *         &lt;element name="file_supports_usn_journal" type="{http://oval.cisecurity.org/XMLSchema/oval-collections-6}FilterBoolType" minOccurs="0"/>
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
    "rootpath",
    "fileSystem",
    "name",
    "driveType",
    "volumeMaxComponentLength",
    "serialNumber",
    "fileCaseSensitiveSearch",
    "fileCasePreservedNames",
    "fileUnicodeOnDisk",
    "filePersistentAcls",
    "fileFileCompression",
    "fileVolumeQuotas",
    "fileSupportsSparseFiles",
    "fileSupportsReparsePoints",
    "fileSupportsRemoteStorage",
    "fileVolumeIsCompressed",
    "fileSupportsObjectIds",
    "fileSupportsEncryption",
    "fileNamedStreams",
    "fileReadOnlyVolume",
    "fileSequentialWriteOnce",
    "fileSupportsTransactions",
    "fileSupportsHardLinks",
    "fileSupportsExtendedAttributes",
    "fileSupportsOpenByFileId",
    "fileSupportsUsnJournal"
})
public class VolumeFilter
    extends FilterType
{

    protected FilterStringType rootpath;
    @XmlElement(name = "file_system")
    protected FilterStringType fileSystem;
    protected FilterStringType name;
    @XmlElement(name = "drive_type")
    protected FilterDriveTypeType driveType;
    @XmlElement(name = "volume_max_component_length")
    protected FilterIntType volumeMaxComponentLength;
    @XmlElement(name = "serial_number")
    protected FilterIntType serialNumber;
    @XmlElement(name = "file_case_sensitive_search")
    protected FilterBoolType fileCaseSensitiveSearch;
    @XmlElement(name = "file_case_preserved_names")
    protected FilterBoolType fileCasePreservedNames;
    @XmlElement(name = "file_unicode_on_disk")
    protected FilterBoolType fileUnicodeOnDisk;
    @XmlElement(name = "file_persistent_acls")
    protected FilterBoolType filePersistentAcls;
    @XmlElement(name = "file_file_compression")
    protected FilterBoolType fileFileCompression;
    @XmlElement(name = "file_volume_quotas")
    protected FilterBoolType fileVolumeQuotas;
    @XmlElement(name = "file_supports_sparse_files")
    protected FilterBoolType fileSupportsSparseFiles;
    @XmlElement(name = "file_supports_reparse_points")
    protected FilterBoolType fileSupportsReparsePoints;
    @XmlElement(name = "file_supports_remote_storage")
    protected FilterBoolType fileSupportsRemoteStorage;
    @XmlElement(name = "file_volume_is_compressed")
    protected FilterBoolType fileVolumeIsCompressed;
    @XmlElement(name = "file_supports_object_ids")
    protected FilterBoolType fileSupportsObjectIds;
    @XmlElement(name = "file_supports_encryption")
    protected FilterBoolType fileSupportsEncryption;
    @XmlElement(name = "file_named_streams")
    protected FilterBoolType fileNamedStreams;
    @XmlElement(name = "file_read_only_volume")
    protected FilterBoolType fileReadOnlyVolume;
    @XmlElement(name = "file_sequential_write_once")
    protected FilterBoolType fileSequentialWriteOnce;
    @XmlElement(name = "file_supports_transactions")
    protected FilterBoolType fileSupportsTransactions;
    @XmlElement(name = "file_supports_hard_links")
    protected FilterBoolType fileSupportsHardLinks;
    @XmlElement(name = "file_supports_extended_attributes")
    protected FilterBoolType fileSupportsExtendedAttributes;
    @XmlElement(name = "file_supports_open_by_file_id")
    protected FilterBoolType fileSupportsOpenByFileId;
    @XmlElement(name = "file_supports_usn_journal")
    protected FilterBoolType fileSupportsUsnJournal;

    /**
     * Gets the value of the rootpath property.
     * 
     * @return
     *     possible object is
     *     {@link FilterStringType }
     *     
     */
    public FilterStringType getRootpath() {
        return rootpath;
    }

    /**
     * Sets the value of the rootpath property.
     * 
     * @param value
     *     allowed object is
     *     {@link FilterStringType }
     *     
     */
    public void setRootpath(FilterStringType value) {
        this.rootpath = value;
    }

    /**
     * Gets the value of the fileSystem property.
     * 
     * @return
     *     possible object is
     *     {@link FilterStringType }
     *     
     */
    public FilterStringType getFileSystem() {
        return fileSystem;
    }

    /**
     * Sets the value of the fileSystem property.
     * 
     * @param value
     *     allowed object is
     *     {@link FilterStringType }
     *     
     */
    public void setFileSystem(FilterStringType value) {
        this.fileSystem = value;
    }

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link FilterStringType }
     *     
     */
    public FilterStringType getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link FilterStringType }
     *     
     */
    public void setName(FilterStringType value) {
        this.name = value;
    }

    /**
     * Gets the value of the driveType property.
     * 
     * @return
     *     possible object is
     *     {@link FilterDriveTypeType }
     *     
     */
    public FilterDriveTypeType getDriveType() {
        return driveType;
    }

    /**
     * Sets the value of the driveType property.
     * 
     * @param value
     *     allowed object is
     *     {@link FilterDriveTypeType }
     *     
     */
    public void setDriveType(FilterDriveTypeType value) {
        this.driveType = value;
    }

    /**
     * Gets the value of the volumeMaxComponentLength property.
     * 
     * @return
     *     possible object is
     *     {@link FilterIntType }
     *     
     */
    public FilterIntType getVolumeMaxComponentLength() {
        return volumeMaxComponentLength;
    }

    /**
     * Sets the value of the volumeMaxComponentLength property.
     * 
     * @param value
     *     allowed object is
     *     {@link FilterIntType }
     *     
     */
    public void setVolumeMaxComponentLength(FilterIntType value) {
        this.volumeMaxComponentLength = value;
    }

    /**
     * Gets the value of the serialNumber property.
     * 
     * @return
     *     possible object is
     *     {@link FilterIntType }
     *     
     */
    public FilterIntType getSerialNumber() {
        return serialNumber;
    }

    /**
     * Sets the value of the serialNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link FilterIntType }
     *     
     */
    public void setSerialNumber(FilterIntType value) {
        this.serialNumber = value;
    }

    /**
     * Gets the value of the fileCaseSensitiveSearch property.
     * 
     * @return
     *     possible object is
     *     {@link FilterBoolType }
     *     
     */
    public FilterBoolType getFileCaseSensitiveSearch() {
        return fileCaseSensitiveSearch;
    }

    /**
     * Sets the value of the fileCaseSensitiveSearch property.
     * 
     * @param value
     *     allowed object is
     *     {@link FilterBoolType }
     *     
     */
    public void setFileCaseSensitiveSearch(FilterBoolType value) {
        this.fileCaseSensitiveSearch = value;
    }

    /**
     * Gets the value of the fileCasePreservedNames property.
     * 
     * @return
     *     possible object is
     *     {@link FilterBoolType }
     *     
     */
    public FilterBoolType getFileCasePreservedNames() {
        return fileCasePreservedNames;
    }

    /**
     * Sets the value of the fileCasePreservedNames property.
     * 
     * @param value
     *     allowed object is
     *     {@link FilterBoolType }
     *     
     */
    public void setFileCasePreservedNames(FilterBoolType value) {
        this.fileCasePreservedNames = value;
    }

    /**
     * Gets the value of the fileUnicodeOnDisk property.
     * 
     * @return
     *     possible object is
     *     {@link FilterBoolType }
     *     
     */
    public FilterBoolType getFileUnicodeOnDisk() {
        return fileUnicodeOnDisk;
    }

    /**
     * Sets the value of the fileUnicodeOnDisk property.
     * 
     * @param value
     *     allowed object is
     *     {@link FilterBoolType }
     *     
     */
    public void setFileUnicodeOnDisk(FilterBoolType value) {
        this.fileUnicodeOnDisk = value;
    }

    /**
     * Gets the value of the filePersistentAcls property.
     * 
     * @return
     *     possible object is
     *     {@link FilterBoolType }
     *     
     */
    public FilterBoolType getFilePersistentAcls() {
        return filePersistentAcls;
    }

    /**
     * Sets the value of the filePersistentAcls property.
     * 
     * @param value
     *     allowed object is
     *     {@link FilterBoolType }
     *     
     */
    public void setFilePersistentAcls(FilterBoolType value) {
        this.filePersistentAcls = value;
    }

    /**
     * Gets the value of the fileFileCompression property.
     * 
     * @return
     *     possible object is
     *     {@link FilterBoolType }
     *     
     */
    public FilterBoolType getFileFileCompression() {
        return fileFileCompression;
    }

    /**
     * Sets the value of the fileFileCompression property.
     * 
     * @param value
     *     allowed object is
     *     {@link FilterBoolType }
     *     
     */
    public void setFileFileCompression(FilterBoolType value) {
        this.fileFileCompression = value;
    }

    /**
     * Gets the value of the fileVolumeQuotas property.
     * 
     * @return
     *     possible object is
     *     {@link FilterBoolType }
     *     
     */
    public FilterBoolType getFileVolumeQuotas() {
        return fileVolumeQuotas;
    }

    /**
     * Sets the value of the fileVolumeQuotas property.
     * 
     * @param value
     *     allowed object is
     *     {@link FilterBoolType }
     *     
     */
    public void setFileVolumeQuotas(FilterBoolType value) {
        this.fileVolumeQuotas = value;
    }

    /**
     * Gets the value of the fileSupportsSparseFiles property.
     * 
     * @return
     *     possible object is
     *     {@link FilterBoolType }
     *     
     */
    public FilterBoolType getFileSupportsSparseFiles() {
        return fileSupportsSparseFiles;
    }

    /**
     * Sets the value of the fileSupportsSparseFiles property.
     * 
     * @param value
     *     allowed object is
     *     {@link FilterBoolType }
     *     
     */
    public void setFileSupportsSparseFiles(FilterBoolType value) {
        this.fileSupportsSparseFiles = value;
    }

    /**
     * Gets the value of the fileSupportsReparsePoints property.
     * 
     * @return
     *     possible object is
     *     {@link FilterBoolType }
     *     
     */
    public FilterBoolType getFileSupportsReparsePoints() {
        return fileSupportsReparsePoints;
    }

    /**
     * Sets the value of the fileSupportsReparsePoints property.
     * 
     * @param value
     *     allowed object is
     *     {@link FilterBoolType }
     *     
     */
    public void setFileSupportsReparsePoints(FilterBoolType value) {
        this.fileSupportsReparsePoints = value;
    }

    /**
     * Gets the value of the fileSupportsRemoteStorage property.
     * 
     * @return
     *     possible object is
     *     {@link FilterBoolType }
     *     
     */
    public FilterBoolType getFileSupportsRemoteStorage() {
        return fileSupportsRemoteStorage;
    }

    /**
     * Sets the value of the fileSupportsRemoteStorage property.
     * 
     * @param value
     *     allowed object is
     *     {@link FilterBoolType }
     *     
     */
    public void setFileSupportsRemoteStorage(FilterBoolType value) {
        this.fileSupportsRemoteStorage = value;
    }

    /**
     * Gets the value of the fileVolumeIsCompressed property.
     * 
     * @return
     *     possible object is
     *     {@link FilterBoolType }
     *     
     */
    public FilterBoolType getFileVolumeIsCompressed() {
        return fileVolumeIsCompressed;
    }

    /**
     * Sets the value of the fileVolumeIsCompressed property.
     * 
     * @param value
     *     allowed object is
     *     {@link FilterBoolType }
     *     
     */
    public void setFileVolumeIsCompressed(FilterBoolType value) {
        this.fileVolumeIsCompressed = value;
    }

    /**
     * Gets the value of the fileSupportsObjectIds property.
     * 
     * @return
     *     possible object is
     *     {@link FilterBoolType }
     *     
     */
    public FilterBoolType getFileSupportsObjectIds() {
        return fileSupportsObjectIds;
    }

    /**
     * Sets the value of the fileSupportsObjectIds property.
     * 
     * @param value
     *     allowed object is
     *     {@link FilterBoolType }
     *     
     */
    public void setFileSupportsObjectIds(FilterBoolType value) {
        this.fileSupportsObjectIds = value;
    }

    /**
     * Gets the value of the fileSupportsEncryption property.
     * 
     * @return
     *     possible object is
     *     {@link FilterBoolType }
     *     
     */
    public FilterBoolType getFileSupportsEncryption() {
        return fileSupportsEncryption;
    }

    /**
     * Sets the value of the fileSupportsEncryption property.
     * 
     * @param value
     *     allowed object is
     *     {@link FilterBoolType }
     *     
     */
    public void setFileSupportsEncryption(FilterBoolType value) {
        this.fileSupportsEncryption = value;
    }

    /**
     * Gets the value of the fileNamedStreams property.
     * 
     * @return
     *     possible object is
     *     {@link FilterBoolType }
     *     
     */
    public FilterBoolType getFileNamedStreams() {
        return fileNamedStreams;
    }

    /**
     * Sets the value of the fileNamedStreams property.
     * 
     * @param value
     *     allowed object is
     *     {@link FilterBoolType }
     *     
     */
    public void setFileNamedStreams(FilterBoolType value) {
        this.fileNamedStreams = value;
    }

    /**
     * Gets the value of the fileReadOnlyVolume property.
     * 
     * @return
     *     possible object is
     *     {@link FilterBoolType }
     *     
     */
    public FilterBoolType getFileReadOnlyVolume() {
        return fileReadOnlyVolume;
    }

    /**
     * Sets the value of the fileReadOnlyVolume property.
     * 
     * @param value
     *     allowed object is
     *     {@link FilterBoolType }
     *     
     */
    public void setFileReadOnlyVolume(FilterBoolType value) {
        this.fileReadOnlyVolume = value;
    }

    /**
     * Gets the value of the fileSequentialWriteOnce property.
     * 
     * @return
     *     possible object is
     *     {@link FilterBoolType }
     *     
     */
    public FilterBoolType getFileSequentialWriteOnce() {
        return fileSequentialWriteOnce;
    }

    /**
     * Sets the value of the fileSequentialWriteOnce property.
     * 
     * @param value
     *     allowed object is
     *     {@link FilterBoolType }
     *     
     */
    public void setFileSequentialWriteOnce(FilterBoolType value) {
        this.fileSequentialWriteOnce = value;
    }

    /**
     * Gets the value of the fileSupportsTransactions property.
     * 
     * @return
     *     possible object is
     *     {@link FilterBoolType }
     *     
     */
    public FilterBoolType getFileSupportsTransactions() {
        return fileSupportsTransactions;
    }

    /**
     * Sets the value of the fileSupportsTransactions property.
     * 
     * @param value
     *     allowed object is
     *     {@link FilterBoolType }
     *     
     */
    public void setFileSupportsTransactions(FilterBoolType value) {
        this.fileSupportsTransactions = value;
    }

    /**
     * Gets the value of the fileSupportsHardLinks property.
     * 
     * @return
     *     possible object is
     *     {@link FilterBoolType }
     *     
     */
    public FilterBoolType getFileSupportsHardLinks() {
        return fileSupportsHardLinks;
    }

    /**
     * Sets the value of the fileSupportsHardLinks property.
     * 
     * @param value
     *     allowed object is
     *     {@link FilterBoolType }
     *     
     */
    public void setFileSupportsHardLinks(FilterBoolType value) {
        this.fileSupportsHardLinks = value;
    }

    /**
     * Gets the value of the fileSupportsExtendedAttributes property.
     * 
     * @return
     *     possible object is
     *     {@link FilterBoolType }
     *     
     */
    public FilterBoolType getFileSupportsExtendedAttributes() {
        return fileSupportsExtendedAttributes;
    }

    /**
     * Sets the value of the fileSupportsExtendedAttributes property.
     * 
     * @param value
     *     allowed object is
     *     {@link FilterBoolType }
     *     
     */
    public void setFileSupportsExtendedAttributes(FilterBoolType value) {
        this.fileSupportsExtendedAttributes = value;
    }

    /**
     * Gets the value of the fileSupportsOpenByFileId property.
     * 
     * @return
     *     possible object is
     *     {@link FilterBoolType }
     *     
     */
    public FilterBoolType getFileSupportsOpenByFileId() {
        return fileSupportsOpenByFileId;
    }

    /**
     * Sets the value of the fileSupportsOpenByFileId property.
     * 
     * @param value
     *     allowed object is
     *     {@link FilterBoolType }
     *     
     */
    public void setFileSupportsOpenByFileId(FilterBoolType value) {
        this.fileSupportsOpenByFileId = value;
    }

    /**
     * Gets the value of the fileSupportsUsnJournal property.
     * 
     * @return
     *     possible object is
     *     {@link FilterBoolType }
     *     
     */
    public FilterBoolType getFileSupportsUsnJournal() {
        return fileSupportsUsnJournal;
    }

    /**
     * Sets the value of the fileSupportsUsnJournal property.
     * 
     * @param value
     *     allowed object is
     *     {@link FilterBoolType }
     *     
     */
    public void setFileSupportsUsnJournal(FilterBoolType value) {
        this.fileSupportsUsnJournal = value;
    }

}