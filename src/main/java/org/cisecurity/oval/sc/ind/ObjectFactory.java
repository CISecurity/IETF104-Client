//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2019.07.20 at 09:27:07 AM EDT 
//


package org.cisecurity.oval.sc.ind;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;
import org.cisecurity.oval.sc.CollectedItemIntType;
import org.cisecurity.oval.sc.CollectedItemStringType;
import org.cisecurity.oval.sc.CollectedItemType;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the org.cisecurity.oval.sc.ind package. 
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

    private final static QName _FamilyItem_QNAME = new QName("http://oval.cisecurity.org/XMLSchema/oval-system-characteristics-6#independent", "family_item");
    private final static QName _CollectedItem_QNAME = new QName("http://oval.cisecurity.org/XMLSchema/oval-system-characteristics-6", "collected_item");
    private final static QName _TextfilecontentItem_QNAME = new QName("http://oval.cisecurity.org/XMLSchema/oval-system-characteristics-6#independent", "textfilecontent_item");
    private final static QName _VariableItem_QNAME = new QName("http://oval.cisecurity.org/XMLSchema/oval-system-characteristics-6#independent", "variable_item");
    private final static QName _ProcessenvironmentItem_QNAME = new QName("http://oval.cisecurity.org/XMLSchema/oval-system-characteristics-6#independent", "processenvironment_item");
    private final static QName _LdapItem_QNAME = new QName("http://oval.cisecurity.org/XMLSchema/oval-system-characteristics-6#independent", "ldap_item");
    private final static QName _FilehashItem_QNAME = new QName("http://oval.cisecurity.org/XMLSchema/oval-system-characteristics-6#independent", "filehash_item");
    private final static QName _EnvironmentvariableItem_QNAME = new QName("http://oval.cisecurity.org/XMLSchema/oval-system-characteristics-6#independent", "environmentvariable_item");
    private final static QName _SqlItem_QNAME = new QName("http://oval.cisecurity.org/XMLSchema/oval-system-characteristics-6#independent", "sql_item");
    private final static QName _XmlfilecontentItem_QNAME = new QName("http://oval.cisecurity.org/XMLSchema/oval-system-characteristics-6#independent", "xmlfilecontent_item");
    private final static QName _ProcessenvironmentItemPid_QNAME = new QName("http://oval.cisecurity.org/XMLSchema/oval-system-characteristics-6#independent", "pid");
    private final static QName _LdapItemRelativeDn_QNAME = new QName("http://oval.cisecurity.org/XMLSchema/oval-system-characteristics-6#independent", "relative_dn");
    private final static QName _LdapItemAttribute_QNAME = new QName("http://oval.cisecurity.org/XMLSchema/oval-system-characteristics-6#independent", "attribute");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: org.cisecurity.oval.sc.ind
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link ProcessenvironmentItem }
     * 
     */
    public ProcessenvironmentItem createProcessenvironmentItem() {
        return new ProcessenvironmentItem();
    }

    /**
     * Create an instance of {@link LdapItem }
     * 
     */
    public LdapItem createLdapItem() {
        return new LdapItem();
    }

    /**
     * Create an instance of {@link TextfilecontentItem }
     * 
     */
    public TextfilecontentItem createTextfilecontentItem() {
        return new TextfilecontentItem();
    }

    /**
     * Create an instance of {@link VariableItem }
     * 
     */
    public VariableItem createVariableItem() {
        return new VariableItem();
    }

    /**
     * Create an instance of {@link FamilyItem }
     * 
     */
    public FamilyItem createFamilyItem() {
        return new FamilyItem();
    }

    /**
     * Create an instance of {@link XmlfilecontentItem }
     * 
     */
    public XmlfilecontentItem createXmlfilecontentItem() {
        return new XmlfilecontentItem();
    }

    /**
     * Create an instance of {@link EnvironmentvariableItem }
     * 
     */
    public EnvironmentvariableItem createEnvironmentvariableItem() {
        return new EnvironmentvariableItem();
    }

    /**
     * Create an instance of {@link SqlItem }
     * 
     */
    public SqlItem createSqlItem() {
        return new SqlItem();
    }

    /**
     * Create an instance of {@link FilehashItem }
     * 
     */
    public FilehashItem createFilehashItem() {
        return new FilehashItem();
    }

    /**
     * Create an instance of {@link EntityItemEngineType }
     * 
     */
    public EntityItemEngineType createEntityItemEngineType() {
        return new EntityItemEngineType();
    }

    /**
     * Create an instance of {@link EntityItemWindowsViewType }
     * 
     */
    public EntityItemWindowsViewType createEntityItemWindowsViewType() {
        return new EntityItemWindowsViewType();
    }

    /**
     * Create an instance of {@link EntityItemVariableRefType }
     * 
     */
    public EntityItemVariableRefType createEntityItemVariableRefType() {
        return new EntityItemVariableRefType();
    }

    /**
     * Create an instance of {@link EntityItemLdaptypeType }
     * 
     */
    public EntityItemLdaptypeType createEntityItemLdaptypeType() {
        return new EntityItemLdaptypeType();
    }

    /**
     * Create an instance of {@link EntityItemHashTypeType }
     * 
     */
    public EntityItemHashTypeType createEntityItemHashTypeType() {
        return new EntityItemHashTypeType();
    }

    /**
     * Create an instance of {@link EntityItemFamilyType }
     * 
     */
    public EntityItemFamilyType createEntityItemFamilyType() {
        return new EntityItemFamilyType();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FamilyItem }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://oval.cisecurity.org/XMLSchema/oval-system-characteristics-6#independent", name = "family_item", substitutionHeadNamespace = "http://oval.cisecurity.org/XMLSchema/oval-system-characteristics-6", substitutionHeadName = "collected_item")
    public JAXBElement<FamilyItem> createFamilyItem(FamilyItem value) {
        return new JAXBElement<FamilyItem>(_FamilyItem_QNAME, FamilyItem.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link TextfilecontentItem }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://oval.cisecurity.org/XMLSchema/oval-system-characteristics-6#independent", name = "textfilecontent_item", substitutionHeadNamespace = "http://oval.cisecurity.org/XMLSchema/oval-system-characteristics-6", substitutionHeadName = "collected_item")
    public JAXBElement<TextfilecontentItem> createTextfilecontentItem(TextfilecontentItem value) {
        return new JAXBElement<TextfilecontentItem>(_TextfilecontentItem_QNAME, TextfilecontentItem.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link VariableItem }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://oval.cisecurity.org/XMLSchema/oval-system-characteristics-6#independent", name = "variable_item", substitutionHeadNamespace = "http://oval.cisecurity.org/XMLSchema/oval-system-characteristics-6", substitutionHeadName = "collected_item")
    public JAXBElement<VariableItem> createVariableItem(VariableItem value) {
        return new JAXBElement<VariableItem>(_VariableItem_QNAME, VariableItem.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ProcessenvironmentItem }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://oval.cisecurity.org/XMLSchema/oval-system-characteristics-6#independent", name = "processenvironment_item", substitutionHeadNamespace = "http://oval.cisecurity.org/XMLSchema/oval-system-characteristics-6", substitutionHeadName = "collected_item")
    public JAXBElement<ProcessenvironmentItem> createProcessenvironmentItem(ProcessenvironmentItem value) {
        return new JAXBElement<ProcessenvironmentItem>(_ProcessenvironmentItem_QNAME, ProcessenvironmentItem.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LdapItem }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://oval.cisecurity.org/XMLSchema/oval-system-characteristics-6#independent", name = "ldap_item", substitutionHeadNamespace = "http://oval.cisecurity.org/XMLSchema/oval-system-characteristics-6", substitutionHeadName = "collected_item")
    public JAXBElement<LdapItem> createLdapItem(LdapItem value) {
        return new JAXBElement<LdapItem>(_LdapItem_QNAME, LdapItem.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FilehashItem }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://oval.cisecurity.org/XMLSchema/oval-system-characteristics-6#independent", name = "filehash_item", substitutionHeadNamespace = "http://oval.cisecurity.org/XMLSchema/oval-system-characteristics-6", substitutionHeadName = "collected_item")
    public JAXBElement<FilehashItem> createFilehashItem(FilehashItem value) {
        return new JAXBElement<FilehashItem>(_FilehashItem_QNAME, FilehashItem.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EnvironmentvariableItem }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://oval.cisecurity.org/XMLSchema/oval-system-characteristics-6#independent", name = "environmentvariable_item", substitutionHeadNamespace = "http://oval.cisecurity.org/XMLSchema/oval-system-characteristics-6", substitutionHeadName = "collected_item")
    public JAXBElement<EnvironmentvariableItem> createEnvironmentvariableItem(EnvironmentvariableItem value) {
        return new JAXBElement<EnvironmentvariableItem>(_EnvironmentvariableItem_QNAME, EnvironmentvariableItem.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SqlItem }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://oval.cisecurity.org/XMLSchema/oval-system-characteristics-6#independent", name = "sql_item", substitutionHeadNamespace = "http://oval.cisecurity.org/XMLSchema/oval-system-characteristics-6", substitutionHeadName = "collected_item")
    public JAXBElement<SqlItem> createSqlItem(SqlItem value) {
        return new JAXBElement<SqlItem>(_SqlItem_QNAME, SqlItem.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XmlfilecontentItem }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://oval.cisecurity.org/XMLSchema/oval-system-characteristics-6#independent", name = "xmlfilecontent_item", substitutionHeadNamespace = "http://oval.cisecurity.org/XMLSchema/oval-system-characteristics-6", substitutionHeadName = "collected_item")
    public JAXBElement<XmlfilecontentItem> createXmlfilecontentItem(XmlfilecontentItem value) {
        return new JAXBElement<XmlfilecontentItem>(_XmlfilecontentItem_QNAME, XmlfilecontentItem.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CollectedItemIntType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://oval.cisecurity.org/XMLSchema/oval-system-characteristics-6#independent", name = "pid", scope = ProcessenvironmentItem.class)
    public JAXBElement<CollectedItemIntType> createProcessenvironmentItemPid(CollectedItemIntType value) {
        return new JAXBElement<CollectedItemIntType>(_ProcessenvironmentItemPid_QNAME, CollectedItemIntType.class, ProcessenvironmentItem.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CollectedItemStringType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://oval.cisecurity.org/XMLSchema/oval-system-characteristics-6#independent", name = "relative_dn", scope = LdapItem.class)
    public JAXBElement<CollectedItemStringType> createLdapItemRelativeDn(CollectedItemStringType value) {
        return new JAXBElement<CollectedItemStringType>(_LdapItemRelativeDn_QNAME, CollectedItemStringType.class, LdapItem.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CollectedItemStringType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://oval.cisecurity.org/XMLSchema/oval-system-characteristics-6#independent", name = "attribute", scope = LdapItem.class)
    public JAXBElement<CollectedItemStringType> createLdapItemAttribute(CollectedItemStringType value) {
        return new JAXBElement<CollectedItemStringType>(_LdapItemAttribute_QNAME, CollectedItemStringType.class, LdapItem.class, value);
    }

}