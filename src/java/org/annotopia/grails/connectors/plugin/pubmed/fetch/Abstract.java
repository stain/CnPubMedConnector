//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.1.3-b01-fcs 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2009.06.03 at 01:03:34 AM EDT 
//


package org.annotopia.grails.connectors.plugin.pubmed.fetch;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;



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
 *         &lt;sequence>
 *           &lt;element ref="{}AbstractText"/>
 *           &lt;element ref="{}CopyrightInformation" minOccurs="0"/>
 *         &lt;/sequence>
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
    "abstractText",
    "copyrightInformation"
})
@XmlRootElement(name = "Abstract")
public class Abstract {

    @XmlElement(name = "AbstractText", required = true)
    protected AbstractText abstractText;
    @XmlElement(name = "CopyrightInformation")
    protected CopyrightInformation copyrightInformation;

    /**
     * Gets the value of the abstractText property.
     * 
     * @return
     *     possible object is
     *     {@link AbstractText }
     *     
     */
    public AbstractText getAbstractText() {
        return abstractText;
    }

    /**
     * Sets the value of the abstractText property.
     * 
     * @param value
     *     allowed object is
     *     {@link AbstractText }
     *     
     */
    public void setAbstractText(AbstractText value) {
        this.abstractText = value;
    }

    /**
     * Gets the value of the copyrightInformation property.
     * 
     * @return
     *     possible object is
     *     {@link CopyrightInformation }
     *     
     */
    public CopyrightInformation getCopyrightInformation() {
        return copyrightInformation;
    }

    /**
     * Sets the value of the copyrightInformation property.
     * 
     * @param value
     *     allowed object is
     *     {@link CopyrightInformation }
     *     
     */
    public void setCopyrightInformation(CopyrightInformation value) {
        this.copyrightInformation = value;
    }

}
