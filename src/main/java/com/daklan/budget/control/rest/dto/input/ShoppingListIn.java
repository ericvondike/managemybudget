package com.daklan.budget.control.rest.dto.input;


import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.springframework.stereotype.Repository;

import javax.validation.constraints.NotNull;
import java.io.Serializable;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;


@Repository
public class ShoppingListIn implements Serializable {
    private static final Long serialVersionUID = 451L;

    /**
     * The free title given to a list by the customer
     */
    @NotNull
    private String listTitle;
    @NotNull
    private LocalDate dateShopped;

    /**
     * The list of the item classes in here
     */
    @NotNull
    private List<CategoryIn> categoryInList = new ArrayList<CategoryIn>();


    /**
     * The shopping center from which the list has been bought.
     */
    @NotNull
    private ShoppingCenterIn shoppingCenterIn;

    @NotNull
    private ShoppingCenter shoppingCenter = ShoppingCenter.AUCHAN;

    public ShoppingListIn() { super();
    }

    public LocalDate getDateShopped() {
        return dateShopped;
    }

    public void setDateShopped(LocalDate dateShopped) {
        this.dateShopped = dateShopped;
    }

    public String getListTitle() {
        return listTitle;
    }

    public void setListTitle(String listTitle) {
        this.listTitle = listTitle;
    }

    public List<CategoryIn> getCategoryInList() {
        return this.categoryInList;
    }

    public void setCategoryInList(List<CategoryIn> itemCategoryListIn) {
        this.categoryInList = itemCategoryListIn;
    }

    public ShoppingCenterIn getShoppingCenter() {
        return shoppingCenterIn;
    }

    public void setShoppingCenter(ShoppingCenterIn shoppingCenter) {
        this.shoppingCenterIn = shoppingCenter;
    }

    public void setShoppingCenter(ShoppingCenter shoppingCenter) {
        this.shoppingCenter = shoppingCenter;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;

        if (!(o instanceof ShoppingListIn)) return false;

        ShoppingListIn that = (ShoppingListIn) o;

        return new EqualsBuilder()
                .append(listTitle, that.listTitle)
                .append(categoryInList, that.categoryInList)
                .append(shoppingCenterIn, that.shoppingCenterIn)
                .append(dateShopped, that.dateShopped)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37)
                .append(listTitle)
                .append(categoryInList)
                .append(shoppingCenterIn)
                .append(dateShopped)
                .toHashCode();
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this)
                .append("listTitle", listTitle)
                .append("categoryInList", categoryInList)
                .append("shoppingCenterIn", shoppingCenterIn)
                .append("dateShopped", dateShopped)
                .toString();
    }
}
