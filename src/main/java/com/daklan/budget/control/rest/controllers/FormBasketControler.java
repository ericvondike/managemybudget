package com.daklan.budget.control.rest.controllers;


import com.daklan.budget.control.rest.dto.input.ShoppingListIn;
import com.daklan.budget.control.rest.dto.output.ShoppingListOut;
import com.daklan.budget.control.rest.service.BasketService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

@Controller
public class FormBasketControler {

    private BasketService service;

    @Autowired
    public FormBasketControler(BasketService service) {
        this.service = service;
    }

    @RequestMapping("/basketform")
    public String showBasketForm(Model model) {

        model.addAttribute("basketForm", new ShoppingListIn());

        return "basketform";
    }

    @RequestMapping("/yourbasket")
    public String submitBasket(@ModelAttribute ShoppingListOut shoppingListOut) {

        return "result";
    }

//    @RequestMapping(value="/result", method = RequestMethod.GET)
//    @ResponseBody
//    public ResponseEntity<ShoppingListOut> buildBasket(@RequestBody Map<ShoppingListIn, Model>) {
//        ShoppingListOut output = service.BuildBasket(shoppingListIn);
//        model.addAttribute("output", output);
//        return ResponseEntity.ok(output);
//    }

    @RequestMapping(value="/result", method = RequestMethod.GET)
    @ResponseBody
    public String buildBasket(ShoppingListIn shoppingListIn, Model model) {
        ShoppingListOut output = service.BuildBasket(shoppingListIn, model);
        model.addAttribute("result", output);

        return "result";
    }
}
