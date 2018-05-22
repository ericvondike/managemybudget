package com.daklan.budget.control.rest.service.impl;

import com.daklan.budget.control.rest.dto.input.ItemCategoryIn;
import com.daklan.budget.control.rest.dto.input.ItemIn;
import com.daklan.budget.control.rest.dto.input.ShoppingListIn;
import com.daklan.budget.control.rest.dto.output.ItemCategoryOut;
import com.daklan.budget.control.rest.dto.output.ItemOut;
import com.daklan.budget.control.rest.dto.output.ShoppingCenterOut;
import com.daklan.budget.control.rest.dto.output.ShoppingListOut;
import com.daklan.budget.control.rest.service.BasketService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.*;

/**
 *
 */
@Service
public class BasketServiceImpl implements BasketService {


    private ShoppingListIn shoppingListIn;
    private ShoppingListOut shoppingListOut;

    /**
     *
     * @param shoppingListIn
     * @param shoppingListOut
     */
    @Autowired
    public BasketServiceImpl(ShoppingListIn shoppingListIn, ShoppingListOut shoppingListOut) {
        this.shoppingListIn = shoppingListIn;
        this.shoppingListOut = shoppingListOut;
    }


    /**
     *
     * @param shoppingListIn
     * @return shoppingListOut
     */
    @Override
    public ShoppingListOut BuildBasket(ShoppingListIn shoppingListIn) {

        shoppingListOut.setListPrice(shoppingListIn.getListPrice());
        shoppingListOut.setListTitle(shoppingListIn.getListTitle());
        shoppingListOut.setShoppingCenter(getShoppingCenter(shoppingListIn));
        shoppingListOut.setItemCategoryList(getItemCategoryList(shoppingListIn));


        return shoppingListOut;
    }


    /**
     *
     * @param shoppingListIn
     * @return dates
     * Returns a list of the days at which the shoppingcenter is open.
     */
    private List<LocalDate> getDatesOpen(ShoppingListIn shoppingListIn) {
        List<LocalDate> dates = new ArrayList<>();

        for (LocalDate date : shoppingListIn.getShoppingCenter().getDatesOpen()) {
            dates.add(date);
        }

        return dates;
    }

    /**
     *
     * @param shoppingListIn
     * @return
     */
    private ShoppingCenterOut getShoppingCenter(ShoppingListIn shoppingListIn) {
        ShoppingCenterOut shoppingCenterOut = new ShoppingCenterOut();

        shoppingCenterOut.setDatesOpen(getDatesOpen(shoppingListIn));
        shoppingCenterOut.setTelNumber(shoppingListIn.getShoppingCenter().getTelNumber());
        shoppingCenterOut.setOfficialname(shoppingListIn.getShoppingCenter().getOfficialname());
        shoppingCenterOut.setGivenName(shoppingListIn.getShoppingCenter().getGivenName());
        shoppingCenterOut.setCode(shoppingListIn.getShoppingCenter().getCode());
        shoppingCenterOut.setAddress(shoppingListIn.getShoppingCenter().getAddress());

        return shoppingCenterOut;
    }

    /**
     *
     * @param shoppingListIn
     * @return
     */
    private List<ItemCategoryOut> getItemCategoryList(ShoppingListIn shoppingListIn) {
        List<ItemCategoryOut> itemCategoryOuts = new ArrayList<>();

        for(ItemCategoryIn itemCategoryIn : shoppingListIn.getItemCategoryList()) {
            ItemCategoryOut itemCategoryOut = new ItemCategoryOut();

            itemCategoryOut.setItemCategoryGivenName(itemCategoryIn.getItemCategoryGivenName());
            itemCategoryOut.setItemCategory(itemCategoryIn.getItemCategory());
            itemCategoryOut.setNumItem(itemCategoryIn.getNumItem());
            itemCategoryOut.setItemCategoryPrice(itemCategoryIn.getItemCategoryPrice());
            itemCategoryOut.setItemsList(getItemsList(itemCategoryIn));

            itemCategoryOuts.add(itemCategoryOut);
        }

        return itemCategoryOuts;
    }

    /**
     *
     * @param itemCategoryIn
     * @return
     */
    private List<ItemOut> getItemsList(ItemCategoryIn itemCategoryIn) {
        List<ItemOut> itemOuts = new ArrayList<>();

        for (ItemIn itemIn : itemCategoryIn.getItemsList()) {
            ItemOut itemOut = new ItemOut();

            itemOut.setItemBarcode(itemIn.getItemBarcode());
            itemOut.setItemCode(itemIn.getItemCode());
            itemOut.setItemDescription(itemIn.getItemDescription());
            itemOut.setItemGivenName(itemIn.getItemGivenName());
            itemOut.setItemPrice(itemIn.getItemPrice());

            itemOuts.add(itemOut);
        }
        return  itemOuts;
    }
}
