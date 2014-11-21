//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.1.3-b01-fcs 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2009.06.03 at 01:03:34 AM EDT 
//


package org.annotopia.grails.connectors.plugin.pubmed.fetch;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;



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
 *         &lt;choice>
 *           &lt;choice>
 *             &lt;sequence>
 *               &lt;element ref="{}LastName"/>
 *               &lt;choice minOccurs="0">
 *                 &lt;element ref="{}ForeName"/>
 *                 &lt;sequence>
 *                   &lt;element ref="{}FirstName"/>
 *                   &lt;element ref="{}MiddleName" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/choice>
 *               &lt;element ref="{}Initials" minOccurs="0"/>
 *               &lt;element ref="{}Suffix" minOccurs="0"/>
 *             &lt;/sequence>
 *             &lt;element ref="{}CollectiveName"/>
 *           &lt;/choice>
 *         &lt;/choice>
 *         &lt;element ref="{}Affiliation" minOccurs="0"/>
 *         &lt;element ref="{}DatesAssociatedWithName" minOccurs="0"/>
 *         &lt;element ref="{}NameQualifier" minOccurs="0"/>
 *         &lt;element ref="{}OtherInformation" minOccurs="0"/>
 *         &lt;element ref="{}TitleAssociatedWithName" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="ValidYN" default="Y">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN">
 *             &lt;enumeration value="N"/>
 *             &lt;enumeration value="Y"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "lastName",
    "foreName",
    "firstName",
    "middleName",
    "initials",
    "suffix",
    "collectiveName",
    "affiliation",
    "datesAssociatedWithName",
    "nameQualifier",
    "otherInformation",
    "titleAssociatedWithName"
})
@XmlRootElement(name = "Author")
public class Author {

    @XmlElement(name = "LastName")
    protected LastName lastName;
    @XmlElement(name = "ForeName")
    protected ForeName foreName;
    @XmlElement(name = "FirstName")
    protected FirstName firstName;
    @XmlElement(name = "MiddleName")
    protected MiddleName middleName;
    @XmlElement(name = "Initials")
    protected Initials initials;
    @XmlElement(name = "Suffix")
    protected Suffix suffix;
    @XmlElement(name = "CollectiveName")
    protected CollectiveName collectiveName;
    @XmlElement(name = "Affiliation")
    protected Affiliation affiliation;
    @XmlElement(name = "DatesAssociatedWithName")
    protected DatesAssociatedWithName datesAssociatedWithName;
    @XmlElement(name = "NameQualifier")
    protected NameQualifier nameQualifier;
    @XmlElement(name = "OtherInformation")
    protected OtherInformation otherInformation;
    @XmlElement(name = "TitleAssociatedWithName")
    protected TitleAssociatedWithName titleAssociatedWithName;
    @XmlAttribute(name = "ValidYN")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String validYN;

    /**
     * Gets the value of the lastName property.
     * 
     * @return
     *     possible object is
     *     {@link LastName }
     *     
     */
    public LastName getLastName() {
        return lastName;
    }

    /**
     * Sets the value of the lastName property.
     * 
     * @param value
     *     allowed object is
     *     {@link LastName }
     *     
     */
    public void setLastName(LastName value) {
        this.lastName = value;
    }

    /**
     * Gets the value of the foreName property.
     * 
     * @return
     *     possible object is
     *     {@link ForeName }
     *     
     */
    public ForeName getForeName() {
        return foreName;
    }

    /**
     * Sets the value of the foreName property.
     * 
     * @param value
     *     allowed object is
     *     {@link ForeName }
     *     
     */
    public void setForeName(ForeName value) {
        this.foreName = value;
    }

    /**
     * Gets the value of the firstName property.
     * 
     * @return
     *     possible object is
     *     {@link FirstName }
     *     
     */
    public FirstName getFirstName() {
        return firstName;
    }

    /**
     * Sets the value of the firstName property.
     * 
     * @param value
     *     allowed object is
     *     {@link FirstName }
     *     
     */
    public void setFirstName(FirstName value) {
        this.firstName = value;
    }

    /**
     * Gets the value of the middleName property.
     * 
     * @return
     *     possible object is
     *     {@link MiddleName }
     *     
     */
    public MiddleName getMiddleName() {
        return middleName;
    }

    /**
     * Sets the value of the middleName property.
     * 
     * @param value
     *     allowed object is
     *     {@link MiddleName }
     *     
     */
    public void setMiddleName(MiddleName value) {
        this.middleName = value;
    }

    /**
     * Gets the value of the initials property.
     * 
     * @return
     *     possible object is
     *     {@link Initials }
     *     
     */
    public Initials getInitials() {
        return initials;
    }

    /**
     * Sets the value of the initials property.
     * 
     * @param value
     *     allowed object is
     *     {@link Initials }
     *     
     */
    public void setInitials(Initials value) {
        this.initials = value;
    }

    /**
     * Gets the value of the suffix property.
     * 
     * @return
     *     possible object is
     *     {@link Suffix }
     *     
     */
    public Suffix getSuffix() {
        return suffix;
    }

    /**
     * Sets the value of the suffix property.
     * 
     * @param value
     *     allowed object is
     *     {@link Suffix }
     *     
     */
    public void setSuffix(Suffix value) {
        this.suffix = value;
    }

    /**
     * Gets the value of the collectiveName property.
     * 
     * @return
     *     possible object is
     *     {@link CollectiveName }
     *     
     */
    public CollectiveName getCollectiveName() {
        return collectiveName;
    }

    /**
     * Sets the value of the collectiveName property.
     * 
     * @param value
     *     allowed object is
     *     {@link CollectiveName }
     *     
     */
    public void setCollectiveName(CollectiveName value) {
        this.collectiveName = value;
    }

    /**
     * Gets the value of the affiliation property.
     * 
     * @return
     *     possible object is
     *     {@link Affiliation }
     *     
     */
    public Affiliation getAffiliation() {
        return affiliation;
    }

    /**
     * Sets the value of the affiliation property.
     * 
     * @param value
     *     allowed object is
     *     {@link Affiliation }
     *     
     */
    public void setAffiliation(Affiliation value) {
        this.affiliation = value;
    }

    /**
     * Gets the value of the datesAssociatedWithName property.
     * 
     * @return
     *     possible object is
     *     {@link DatesAssociatedWithName }
     *     
     */
    public DatesAssociatedWithName getDatesAssociatedWithName() {
        return datesAssociatedWithName;
    }

    /**
     * Sets the value of the datesAssociatedWithName property.
     * 
     * @param value
     *     allowed object is
     *     {@link DatesAssociatedWithName }
     *     
     */
    public void setDatesAssociatedWithName(DatesAssociatedWithName value) {
        this.datesAssociatedWithName = value;
    }

    /**
     * Gets the value of the nameQualifier property.
     * 
     * @return
     *     possible object is
     *     {@link NameQualifier }
     *     
     */
    public NameQualifier getNameQualifier() {
        return nameQualifier;
    }

    /**
     * Sets the value of the nameQualifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link NameQualifier }
     *     
     */
    public void setNameQualifier(NameQualifier value) {
        this.nameQualifier = value;
    }

    /**
     * Gets the value of the otherInformation property.
     * 
     * @return
     *     possible object is
     *     {@link OtherInformation }
     *     
     */
    public OtherInformation getOtherInformation() {
        return otherInformation;
    }

    /**
     * Sets the value of the otherInformation property.
     * 
     * @param value
     *     allowed object is
     *     {@link OtherInformation }
     *     
     */
    public void setOtherInformation(OtherInformation value) {
        this.otherInformation = value;
    }

    /**
     * Gets the value of the titleAssociatedWithName property.
     * 
     * @return
     *     possible object is
     *     {@link TitleAssociatedWithName }
     *     
     */
    public TitleAssociatedWithName getTitleAssociatedWithName() {
        return titleAssociatedWithName;
    }

    /**
     * Sets the value of the titleAssociatedWithName property.
     * 
     * @param value
     *     allowed object is
     *     {@link TitleAssociatedWithName }
     *     
     */
    public void setTitleAssociatedWithName(TitleAssociatedWithName value) {
        this.titleAssociatedWithName = value;
    }

    /**
     * Gets the value of the validYN property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getValidYN() {
        if (validYN == null) {
            return "Y";
        } else {
            return validYN;
        }
    }

    /**
     * Sets the value of the validYN property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setValidYN(String value) {
        this.validYN = value;
    }

}
