
package com.daklan.xml.shoppinglistcollection.Request;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for ShoppingCenterIn complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ShoppingCenterIn">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="givenName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="code" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="telNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="address" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="datesOpen" type="{http://www.w3.org/2001/XMLSchema}date" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="officialName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ShoppingCenterIn", namespace = "http://www.daklan.com/xml/shoppinglistcollection", propOrder = {
    "givenName",
    "code",
    "telNumber",
    "address",
    "datesOpen",
    "officialName"
})
public class ShoppingCenterIn {

    @XmlElement(namespace = "http://www.daklan.com/xml/shoppinglistcollection")
    protected String givenName;
    @XmlElement(namespace = "http://www.daklan.com/xml/shoppinglistcollection", required = true)
    protected String code;
    @XmlElement(namespace = "http://www.daklan.com/xml/shoppinglistcollection")
    protected String telNumber;
    @XmlElement(namespace = "http://www.daklan.com/xml/shoppinglistcollection")
    protected String address;
    @XmlElement(namespace = "http://www.daklan.com/xml/shoppinglistcollection")
    @XmlSchemaType(name = "date")
    protected List<XMLGregorianCalendar> datesOpen;
    @XmlElement(namespace = "http://www.daklan.com/xml/shoppinglistcollection", required = true)
    protected String officialName;

    /**
     * Gets the value of the givenName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGivenName() {
        return givenName;
    }

    /**
     * Sets the value of the givenName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGivenName(String value) {
        this.givenName = value;
    }

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
     * Gets the value of the telNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTelNumber() {
        return telNumber;
    }

    /**
     * Sets the value of the telNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTelNumber(String value) {
        this.telNumber = value;
    }

    /**
     * Gets the value of the address property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAddress() {
        return address;
    }

    /**
     * Sets the value of the address property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAddress(String value) {
        this.address = value;
    }

    /**
     * Gets the value of the datesOpen property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the datesOpen property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDatesOpen().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link XMLGregorianCalendar }
     * 
     * 
     */
    public List<XMLGregorianCalendar> getDatesOpen() {
        if (datesOpen == null) {
            datesOpen = new ArrayList<XMLGregorianCalendar>();
        }
        return this.datesOpen;
    }

    /**
     * Gets the value of the officialName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOfficialName() {
        return officialName;
    }

    /**
     * Sets the value of the officialName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOfficialName(String value) {
        this.officialName = value;
    }

}
