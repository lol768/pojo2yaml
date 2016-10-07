//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2016.10.05 at 06:00:35 PM EEST 
//


package org.atoc.rars.retailsopi.generated.model.availability.response;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for C element declaration.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;element name="C"&gt;
 *   &lt;complexType&gt;
 *     &lt;complexContent&gt;
 *       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *         &lt;attribute name="c" use="required" type="{}ticketCodeType" /&gt;
 *         &lt;attribute name="r" use="required" type="{}routeCodeType" /&gt;
 *         &lt;attribute name="a" use="required" type="{http://www.w3.org/2001/XMLSchema}integer" /&gt;
 *         &lt;attribute name="o" type="{http://www.w3.org/2001/XMLSchema}integer" /&gt;
 *       &lt;/restriction&gt;
 *     &lt;/complexContent&gt;
 *   &lt;/complexType&gt;
 * &lt;/element&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "")
@XmlRootElement(name = "C")
public class TicketTypeRoute {

    @XmlAttribute(name = "c", required = true)
    protected String code;
    @XmlAttribute(name = "r", required = true)
    protected String routeCode;
    @XmlAttribute(name = "a", required = true)
    protected BigInteger numAvailable;
    @XmlAttribute(name = "o")
    protected BigInteger numOverAvailable;

    /**
     * Gets the value of the code property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCode() {
        return code;
    }

    /**
     * Sets the value of the code property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCode(String value) {
        this.code = value;
    }

    /**
     * Gets the value of the routeCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRouteCode() {
        return routeCode;
    }

    /**
     * Sets the value of the routeCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRouteCode(String value) {
        this.routeCode = value;
    }

    /**
     * Gets the value of the numAvailable property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getNumAvailable() {
        return numAvailable;
    }

    /**
     * Sets the value of the numAvailable property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setNumAvailable(BigInteger value) {
        this.numAvailable = value;
    }

    /**
     * Gets the value of the numOverAvailable property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getNumOverAvailable() {
        return numOverAvailable;
    }

    /**
     * Sets the value of the numOverAvailable property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setNumOverAvailable(BigInteger value) {
        this.numOverAvailable = value;
    }

}