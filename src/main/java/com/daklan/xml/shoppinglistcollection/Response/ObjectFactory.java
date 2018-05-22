
package com.daklan.xml.shoppinglistcollection.Response;

import javax.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.daklan.xml.shoppinglistcollection.Response package. 
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
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.daklan.xml.shoppinglistcollection.Response
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link ShoppinglistResponse }
     * 
     */
    public ShoppinglistResponse createShoppinglistResponse() {
        return new ShoppinglistResponse();
    }

    /**
     * Create an instance of {@link ShoppingListOut }
     * 
     */
    public ShoppingListOut createShoppingListOut() {
        return new ShoppingListOut();
    }

    /**
     * Create an instance of {@link ItemOut }
     * 
     */
    public ItemOut createItemOut() {
        return new ItemOut();
    }

    /**
     * Create an instance of {@link CategoryOut }
     * 
     */
    public CategoryOut createCategoryOut() {
        return new CategoryOut();
    }

    /**
     * Create an instance of {@link ShoppingCenterOut }
     * 
     */
    public ShoppingCenterOut createShoppingCenterOut() {
        return new ShoppingCenterOut();
    }

}
