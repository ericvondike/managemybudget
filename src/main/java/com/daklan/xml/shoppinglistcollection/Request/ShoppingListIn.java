
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
 * <p>Java class for ShoppingListIn complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ShoppingListIn">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="listTitle" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="dateShopped" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *         &lt;element name="shoppingCenter" type="{http://www.daklan.com/xml/shoppinglistcollection}ShoppingCenterIn"/>
 *         &lt;element name="categoryIn" type="{http://www.daklan.com/xml/shoppinglistcollection}CategoryIn" maxOccurs="unbounded"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ShoppingListIn", namespace = "http://www.daklan.com/xml/shoppinglistcollection", propOrder = {
    "listTitle",
    "dateShopped",
    "shoppingCenter",
    "categoryIn"
})
public class ShoppingListIn {

    @XmlElement(namespace = "http://www.daklan.com/xml/shoppinglistcollection", required = true)
    protected String listTitle;
    @XmlElement(namespace = "http://www.daklan.com/xml/shoppinglistcollection", required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar dateShopped;
    @XmlElement(namespace = "http://www.daklan.com/xml/shoppinglistcollection", required = true)
    protected ShoppingCenterIn shoppingCenter;
    @XmlElement(namespace = "http://www.daklan.com/xml/shoppinglistcollection", required = true)
    protected List<CategoryIn> categoryIn;

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
     *     {@link ShoppingCenterIn }
     *     
     */
    public ShoppingCenterIn getShoppingCenter() {
        return shoppingCenter;
    }

    /**
     * Sets the value of the shoppingCenter property.
     * 
     * @param value
     *     allowed object is
     *     {@link ShoppingCenterIn }
     *     
     */
    public void setShoppingCenter(ShoppingCenterIn value) {
        this.shoppingCenter = value;
    }

    /**
     * Gets the value of the categoryIn property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the categoryIn property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCategoryIn().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CategoryIn }
     * 
     * 
     */
    public List<CategoryIn> getCategoryIn() {
        if (categoryIn == null) {
            categoryIn = new ArrayList<CategoryIn>();
        }
        return this.categoryIn;
    }

}
