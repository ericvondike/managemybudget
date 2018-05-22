
package com.daklan.xml.shoppinglistcollection.Response;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CategoryOut complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CategoryOut">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="givenName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="officialName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="categoryPrice" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="itemOut" type="{http://www.daklan.com/xml/shoppinglistcollection}ItemOut" maxOccurs="unbounded"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CategoryOut", namespace = "http://www.daklan.com/xml/shoppinglistcollection", propOrder = {
    "givenName",
    "officialName",
    "categoryPrice",
    "itemOut"
})
public class CategoryOut {

    @XmlElement(namespace = "http://www.daklan.com/xml/shoppinglistcollection")
    protected String givenName;
    @XmlElement(namespace = "http://www.daklan.com/xml/shoppinglistcollection", required = true)
    protected String officialName;
    @XmlElement(namespace = "http://www.daklan.com/xml/shoppinglistcollection")
    protected double categoryPrice;
    @XmlElement(namespace = "http://www.daklan.com/xml/shoppinglistcollection", required = true)
    protected List<ItemOut> itemOut;

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

    /**
     * Gets the value of the categoryPrice property.
     * 
     */
    public double getCategoryPrice() {
        return categoryPrice;
    }

    /**
     * Sets the value of the categoryPrice property.
     * 
     */
    public void setCategoryPrice(double value) {
        this.categoryPrice = value;
    }

    /**
     * Gets the value of the itemOut property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the itemOut property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getItemOut().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ItemOut }
     * 
     * 
     */
    public List<ItemOut> getItemOut() {
        if (itemOut == null) {
            itemOut = new ArrayList<ItemOut>();
        }
        return this.itemOut;
    }

}
