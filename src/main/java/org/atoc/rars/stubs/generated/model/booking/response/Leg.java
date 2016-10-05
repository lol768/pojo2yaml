//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2016.10.05 at 10:33:31 AM EEST 
//


package org.atoc.rars.stubs.generated.model.booking.response;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for L element declaration.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;element name="L"&gt;
 *   &lt;complexType&gt;
 *     &lt;complexContent&gt;
 *       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *         &lt;sequence&gt;
 *           &lt;element ref="{}P" maxOccurs="unbounded" minOccurs="0"/&gt;
 *           &lt;element ref="{}F" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;/sequence&gt;
 *         &lt;attribute name="i" use="required" type="{}idType" /&gt;
 *         &lt;attribute name="o" use="required" type="{}legOriginType" /&gt;
 *         &lt;attribute name="d" use="required" type="{}legDestinationType" /&gt;
 *         &lt;attribute name="p" use="required" type="{}timeType" /&gt;
 *         &lt;attribute name="r" use="required" type="{}timeType" /&gt;
 *         &lt;attribute name="s" use="required" type="{}retailServiceIdType" /&gt;
 *         &lt;attribute name="v" use="required" type="{}serviceTypeType" /&gt;
 *         &lt;attribute name="t" use="required" type="{}dateType" /&gt;
 *         &lt;attribute name="h" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *         &lt;attribute name="m" type="{}commentType" /&gt;
 *       &lt;/restriction&gt;
 *     &lt;/complexContent&gt;
 *   &lt;/complexType&gt;
 * &lt;/element&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "paxSet",
    "facility"
})
@XmlRootElement(name = "L")
public class Leg {

    @XmlElement(name = "P")
    protected List<PaxSet> paxSet;
    @XmlElement(name = "F")
    protected List<Facility> facility;
    @XmlAttribute(name = "i", required = true)
    protected String id;
    @XmlAttribute(name = "o", required = true)
    protected String originCode;
    @XmlAttribute(name = "d", required = true)
    protected String destinationCode;
    @XmlAttribute(name = "p", required = true)
    protected String departAt;
    @XmlAttribute(name = "r", required = true)
    protected String arriveAt;
    @XmlAttribute(name = "s", required = true)
    protected String serviceId;
    @XmlAttribute(name = "v", required = true)
    protected String serviceType;
    @XmlAttribute(name = "t", required = true)
    protected String date;
    @XmlAttribute(name = "h")
    protected Boolean coachSplit;
    @XmlAttribute(name = "m")
    protected String reservationComment;

    /**
     * Gets the value of the paxSet property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the paxSet property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPaxSet().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PaxSet }
     * 
     * 
     */
    public List<PaxSet> getPaxSet() {
        if (paxSet == null) {
            paxSet = new ArrayList<PaxSet>();
        }
        return this.paxSet;
    }

    /**
     * Gets the value of the facility property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the facility property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFacility().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Facility }
     * 
     * 
     */
    public List<Facility> getFacility() {
        if (facility == null) {
            facility = new ArrayList<Facility>();
        }
        return this.facility;
    }

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setId(String value) {
        this.id = value;
    }

    /**
     * Gets the value of the originCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOriginCode() {
        return originCode;
    }

    /**
     * Sets the value of the originCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOriginCode(String value) {
        this.originCode = value;
    }

    /**
     * Gets the value of the destinationCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDestinationCode() {
        return destinationCode;
    }

    /**
     * Sets the value of the destinationCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDestinationCode(String value) {
        this.destinationCode = value;
    }

    /**
     * Gets the value of the departAt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDepartAt() {
        return departAt;
    }

    /**
     * Sets the value of the departAt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDepartAt(String value) {
        this.departAt = value;
    }

    /**
     * Gets the value of the arriveAt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getArriveAt() {
        return arriveAt;
    }

    /**
     * Sets the value of the arriveAt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setArriveAt(String value) {
        this.arriveAt = value;
    }

    /**
     * Gets the value of the serviceId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getServiceId() {
        return serviceId;
    }

    /**
     * Sets the value of the serviceId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setServiceId(String value) {
        this.serviceId = value;
    }

    /**
     * Gets the value of the serviceType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getServiceType() {
        return serviceType;
    }

    /**
     * Sets the value of the serviceType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setServiceType(String value) {
        this.serviceType = value;
    }

    /**
     * Gets the value of the date property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDate() {
        return date;
    }

    /**
     * Sets the value of the date property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDate(String value) {
        this.date = value;
    }

    /**
     * Gets the value of the coachSplit property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCoachSplit() {
        return coachSplit;
    }

    /**
     * Sets the value of the coachSplit property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCoachSplit(Boolean value) {
        this.coachSplit = value;
    }

    /**
     * Gets the value of the reservationComment property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReservationComment() {
        return reservationComment;
    }

    /**
     * Sets the value of the reservationComment property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReservationComment(String value) {
        this.reservationComment = value;
    }

}