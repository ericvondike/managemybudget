package com.daklan.budget.control.rest.dto.input;

import java.io.*;

public enum ShoppingCenter {
    AUCHAN("Auchan"),
    CARREFOUR("Carrefour"),
    CORA("Cora"),
    ELECLERC("E.Leclerc"),
    GEANT("Géant"),
    HYPERU("Hyper U"),
    INTERMARCHE("Intermarché Hyper"),
    LIDL("Lidle");

    public static final ShoppingCenter[] ALL = {AUCHAN, CARREFOUR, CORA, ELECLERC, GEANT, HYPERU, INTERMARCHE, LIDL};
    private String name;

    public static ShoppingCenter forName(final String name) {
        if(name == null) {
            throw new IllegalArgumentException("Name cannot be null for shoppingCenter");
        }
        String upperName = name.toUpperCase();
        switch (upperName) {
            case "AUCHAN":
                return AUCHAN;
            case "CARREFOUR":
                return CARREFOUR;
            case "CORA":
                return CORA;
            case "ELECLERC":
                return ELECLERC;
            case "GEANT":
                return GEANT;
            case "HYPERU":
                return HYPERU;
            case "INTERMARCHE":
                return INTERMARCHE;
            case "LIDL":
                return LIDL;
                default:
                    throw new IllegalArgumentException("ShoppingCenter \"" + name +"\"does not correspond to any existing shoppingCenter");
        }

    }



    ShoppingCenter(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
