package com.daklan.budget.control.soap.endpoint;

import com.daklan.xml.shoppinglistcollection.Request.*;
import com.daklan.xml.shoppinglistcollection.Response.*;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;


@Endpoint
public class ShoppingListEndpoint {

    private static final String NAMESPACE_URI = "http://www.daklan.com/xml/shoppinglistcollection";

    /**
     *
     * @param request
     * @return response
     */

    @PayloadRoot(namespace = NAMESPACE_URI, localPart = "ShoppinglistRequest")
    @ResponsePayload
    public ShoppinglistResponse getShoppingList(@RequestPayload ShoppinglistRequest request) {
        ShoppinglistResponse response = new ShoppinglistResponse();



        for(ShoppingListIn shoppingListIn : request.getShoppingList()) {

            ShoppingListOut shoppingListOut = new ShoppingListOut();

            shoppingListOut.setListTitle(shoppingListIn.getListTitle());
            shoppingListOut.setListPrice(getTotalPrice(shoppingListIn));
            shoppingListOut.setDateShopped(shoppingListIn.getDateShopped());
            shoppingListOut.setShoppingCenter(getShoppingCenter(shoppingListIn));
            getCategoriesList(shoppingListIn, shoppingListOut);
            response.getShoppingList().add(shoppingListOut);
        }

        return response;
    }

    /**
     *
     * @param shoppingListIn
     * @return totalPrice
     */
        private double getTotalPrice(ShoppingListIn shoppingListIn){

        double totalPrice = 0.0;

        for (CategoryIn categoryIn : shoppingListIn.getCategoryIn()) {
            double categoryPrice = 0.0;

            for (ItemIn itemIn : categoryIn.getItemIn()) {
                categoryPrice += itemIn.getUnitPrice() * itemIn.getNuItem();
            }
            totalPrice += categoryPrice;
        }
            return totalPrice;
    }

    /**
     *
     * @param shoppingListIn
     * @return shoppingCenterOut
     */

    private ShoppingCenterOut getShoppingCenter (ShoppingListIn shoppingListIn){

        ShoppingCenterOut shoppingCenterOut = new ShoppingCenterOut();
        shoppingCenterOut.setGivenName(shoppingListIn.getShoppingCenter().getGivenName());
        shoppingCenterOut.setAddress(shoppingListIn.getShoppingCenter().getAddress());
        shoppingCenterOut.setCode(shoppingListIn.getShoppingCenter().getCode());
        shoppingCenterOut.setOfficialName(shoppingListIn.getShoppingCenter().getOfficialName());

        return shoppingCenterOut;
    }

    /**
     *
     * @param shoppingListIn
     * @param shoppingListOut
     */
    private void getCategoriesList (ShoppingListIn shoppingListIn, ShoppingListOut shoppingListOut){


        for (CategoryIn categoryIn : shoppingListIn.getCategoryIn()) {
            CategoryOut categoryOut = new CategoryOut();
            categoryOut.setGivenName(categoryIn.getGivenName());
            categoryOut.setOfficialName(categoryIn.getOfficialName());
            categoryOut.setCategoryPrice(getCategoryPrice(categoryIn));
            getItemsList(categoryIn, categoryOut);
            shoppingListOut.getCategoryOut().add(categoryOut);
        }
    }

    /**
     *
     * @param categoryIn
     * @return categoryPrice
     */
    private double getCategoryPrice (CategoryIn categoryIn){
        double categoryPrice = 0.0;
        for (ItemIn itemIn : categoryIn.getItemIn()) {
            categoryPrice += itemIn.getUnitPrice() * itemIn.getNuItem();
        }
        return categoryPrice;
    }

    /**
     *
     * @param categoryIn
     * @param categoryOut
     */
    private void getItemsList (CategoryIn categoryIn, CategoryOut categoryOut){


        for (ItemIn itemIn : categoryIn.getItemIn()) {
            ItemOut itemOut = new ItemOut();
            itemOut.setGivenName(itemIn.getGivenName());
            itemOut.setCode(itemIn.getCode());
            itemOut.setBarcode(itemIn.getBarcode());
            itemOut.setDescription(itemIn.getDescription());
            itemOut.setNuItem(itemIn.getNuItem());
            itemOut.setUnitPrice(itemIn.getUnitPrice());

            categoryOut.getItemOut().add(itemOut);
        }
    }
}
