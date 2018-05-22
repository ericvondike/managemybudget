package com.daklan.budget.control.rest.service;

import com.daklan.budget.control.rest.dto.input.ShoppingListIn;
import com.daklan.budget.control.rest.dto.output.ItemCategoryOut;
import com.daklan.budget.control.rest.dto.output.ShoppingListOut;


public interface BasketService {
    ShoppingListOut BuildBasket(ShoppingListIn shoppingListIn);
}
