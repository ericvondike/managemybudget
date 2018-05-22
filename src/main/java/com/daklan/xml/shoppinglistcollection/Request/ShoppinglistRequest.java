
package com.daklan.xml.shoppinglistcollection.Request;

import java.util.ArrayList;
import java.util.List;
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
 *         &lt;element name="shoppingList" type="{http://www.daklan.com/xml/shoppinglistcollection}ShoppingListIn" maxOccurs="unbounded" minOccurs="0"/>
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
    "shoppingList"
})
@XmlRootElement(name = "ShoppinglistRequest", namespace = "http://www.daklan.com/xml/shoppinglistcollection")
public class ShoppinglistRequest {

    @XmlElement(namespace = "http://www.daklan.com/xml/shoppinglistcollection")
    protected List<ShoppingListIn> shoppingList;

    /**
     * Gets the value of the shoppingList property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the shoppingList property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getShoppingList().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ShoppingListIn }
     * 
     * 
     */
    public List<ShoppingListIn> getShoppingList() {
        if (shoppingList == null) {
            shoppingList = new ArrayList<ShoppingListIn>();
        }
        return this.shoppingList;
    }

}
