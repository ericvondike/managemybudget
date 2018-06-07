package com.daklan.budget.control.rest.controllers;


import com.daklan.budget.control.rest.dto.input.ShoppingListIn;
import com.daklan.budget.control.rest.dto.output.ShoppingListOut;
import com.daklan.budget.control.rest.service.BasketService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class FormBasketControler {

    private BasketService service;

    @Autowired
    public FormBasketControler(BasketService service) {
        this.service = service;
    }

    @RequestMapping("/basketform")
    public String showBasketForm(Model model) {

        ShoppingListIn shoppingListIn = new ShoppingListIn();
        model.addAttribute("basketForm", shoppingListIn);

        return "basketform";
    }

    @PostMapping("/result")
    public String buildBasket(ShoppingListIn shoppingListIn, Model model) {
        ShoppingListOut output = service.BuildBasket(shoppingListIn, model);
        model.addAttribute("result", output);

        return "result";
    }
}
