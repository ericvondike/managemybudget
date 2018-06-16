package com.daklan.budget.control.rest.controllers;


import com.daklan.budget.control.rest.dto.input.CategoryIn;
import com.daklan.budget.control.rest.dto.input.ItemIn;
import com.daklan.budget.control.rest.dto.input.ShoppingListIn;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;

@Controller
public class FormBasketControler {
    private final Logger LOGGER = LoggerFactory.getLogger(FormBasketControler.class);

    @RequestMapping(value = "/basketform")
    public String showBasketForm(Model model) {

        ShoppingListIn shoppingListIn = new ShoppingListIn();
        model.addAttribute("basketForm", shoppingListIn);

        return "basketform";
    }

    @RequestMapping(value="/basketform", params={"addCategory"})
    public String addRow(final ShoppingListIn shoppingListIn, final BindingResult result, final Model model) {
        shoppingListIn.getCategoryInList().add(new CategoryIn());
        model.addAttribute("basketForm", shoppingListIn);

        return  "basketform";
    }

    @RequestMapping(value = "/basketform", params={"removeCategory"})
    public String removeRow(final ShoppingListIn shoppingListIn, final BindingResult bindingResult,
                            final HttpServletRequest req, final Model model){
        final Integer rowId = Integer.valueOf(req.getParameter("removeCategory"));
        shoppingListIn.getCategoryInList().remove(rowId.intValue());
        model.addAttribute("basketForm", shoppingListIn);

        return "basketform";
    }

    @RequestMapping(value = "/basketform", params={"addItem"})
    public String addItem(final ShoppingListIn shoppingListIn,
                          final BindingResult bindingResult,
                          final HttpServletRequest req, final Model model){
        final Integer rowId = Integer.valueOf(req.getParameter("addItem"));
        CategoryIn categoryIn = shoppingListIn.getCategoryInList().get(rowId.intValue());
        categoryIn.getItemsList().add(new ItemIn());
        model.addAttribute("basketForm", shoppingListIn);

        return "basketform";
    }
//    @PostMapping("/result")
//    public String buildBasket(ShoppingListIn shoppingListIn, Model model) {
//        ShoppingListOut output = service.BuildBasket(shoppingListIn, model);
//        model.addAttribute("result", output);
//
//        return "result";
//    }

}
