
package com.daklan.xml.shoppinglistcollection.Response;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for ShoppingListOut complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ShoppingListOut">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="listTitle" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="listPrice" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="dateShopped" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *         &lt;element name="shoppingCenter" type="{http://www.daklan.com/xml/shoppinglistcollection}ShoppingCenterOut"/>
 *         &lt;element name="categoryOut" type="{http://www.daklan.com/xml/shoppinglistcollection}CategoryOut" maxOccurs="unbounded"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ShoppingListOut", namespace = "http://www.daklan.com/xml/shoppinglistcollection", propOrder = {
    "listTitle",
    "listPrice",
    "dateShopped",
    "shoppingCenter",
    "categoryOut"
})
public class ShoppingListOut {

    @XmlElement(namespace = "http://www.daklan.com/xml/shoppinglistcollection", required = true)
    protected String listTitle;
    @XmlElement(namespace = "http://www.daklan.com/xml/shoppinglistcollection")
    protected double listPrice;
    @XmlElement(namespace = "http://www.daklan.com/xml/shoppinglistcollection", required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar dateShopped;
    @XmlElement(namespace = "http://www.daklan.com/xml/shoppinglistcollection", required = true)
    protected ShoppingCenterOut shoppingCenter;
    @XmlElement(namespace = "http://www.daklan.com/xml/shoppinglistcollection", required = true)
    protected List<CategoryOut> categoryOut;

    /**
     * Gets the value of the listTitle property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getListTitle() {
        return listTitle;
    }

    /**
     * Sets the value of the listTitle property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setListTitle(String value) {
        this.listTitle = value;
    }

    /**
     * Gets the value of the listPrice property.
     * 
     */
    public double getListPrice() {
        return listPrice;
    }

    /**
     * Sets the value of the listPrice property.
     * 
     */
    public void setListPrice(double value) {
        this.listPrice = value;
    }

    /**
     * Gets the value of the dateShopped property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDateShopped() {
        return dateShopped;
    }

    /**
     * Sets the value of the dateShopped property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDateShopped(XMLGregorianCalendar value) {
        this.dateShopped = value;
    }

    /**
     * Gets the value of the shoppingCenter property.
     * 
     * @return
     *     possible object is
     *     {@link ShoppingCenterOut }
     *     
     */
    public ShoppingCenterOut getShoppingCenter() {
        return shoppingCenter;
    }

    /**
     * Sets the value of the shoppingCenter property.
     * 
     * @param value
     *     allowed object is
     *     {@link ShoppingCenterOut }
     *     
     */
    public void setShoppingCenter(ShoppingCenterOut value) {
        this.shoppingCenter = value;
    }

    /**
     * Gets the value of the categoryOut property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the categoryOut property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCategoryOut().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CategoryOut }
     * 
     * 
     */
    public List<CategoryOut> getCategoryOut() {
        if (categoryOut == null) {
            categoryOut = new ArrayList<CategoryOut>();
        }
        return this.categoryOut;
    }

}
