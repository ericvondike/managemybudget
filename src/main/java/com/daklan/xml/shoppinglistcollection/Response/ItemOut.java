
package com.daklan.xml.shoppinglistcollection.Response;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ItemOut complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ItemOut">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="givenName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="code" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="barcode" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="description" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="nuItem" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="unitPrice" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ItemOut", namespace = "http://www.daklan.com/xml/shoppinglistcollection", propOrder = {
    "givenName",
    "code",
    "barcode",
    "description",
    "nuItem",
    "unitPrice"
})
public class ItemOut {

    @XmlElement(namespace = "http://www.daklan.com/xml/shoppinglistcollection")
    protected String givenName;
    @XmlElement(namespace = "http://www.daklan.com/xml/shoppinglistcollection", required = true)
    protected String code;
    @XmlElement(namespace = "http://www.daklan.com/xml/shoppinglistcollection", required = true)
    protected String barcode;
    @XmlElement(namespace = "http://www.daklan.com/xml/shoppinglistcollection", required = true)
    protected String description;
    @XmlElement(namespace = "http://www.daklan.com/xml/shoppinglistcollection")
    protected int nuItem;
    @XmlElement(namespace = "http://www.daklan.com/xml/shoppinglistcollection")
    protected double unitPrice;

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
     * Gets the value of the barcode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBarcode() {
        return barcode;
    }

    /**
     * Sets the value of the barcode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBarcode(String value) {
        this.barcode = value;
    }

    /**
     * Gets the value of the description property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescription() {
        return description;
    }

    /**
     * Sets the value of the description property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescription(String value) {
        this.description = value;
    }

    /**
     * Gets the value of the nuItem property.
     * 
     */
    public int getNuItem() {
        return nuItem;
    }

    /**
     * Sets the value of the nuItem property.
     * 
     */
    public void setNuItem(int value) {
        this.nuItem = value;
    }

    /**
     * Gets the value of the unitPrice property.
     * 
     */
    public double getUnitPrice() {
        return unitPrice;
    }

    /**
     * Sets the value of the unitPrice property.
     * 
     */
    public void setUnitPrice(double value) {
        this.unitPrice = value;
    }

}
