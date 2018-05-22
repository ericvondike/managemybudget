
package com.daklan.xml.shoppinglistcollection.Request;

import javax.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.daklan.xml.shoppinglistcollection.Request package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {


    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.daklan.xml.shoppinglistcollection.Request
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link ShoppinglistRequest }
     * 
     */
    public ShoppinglistRequest createShoppinglistRequest() {
        return new ShoppinglistRequest();
    }

    /**
     * Create an instance of {@link ShoppingListIn }
     * 
     */
    public ShoppingListIn createShoppingListIn() {
        return new ShoppingListIn();
    }

    /**
     * Create an instance of {@link ShoppingCenterIn }
     * 
     */
    public ShoppingCenterIn createShoppingCenterIn() {
        return new ShoppingCenterIn();
    }

    /**
     * Create an instance of {@link CategoryIn }
     * 
     */
    public CategoryIn createCategoryIn() {
        return new CategoryIn();
    }

    /**
     * Create an instance of {@link ItemIn }
     * 
     */
    public ItemIn createItemIn() {
        return new ItemIn();
    }

}
