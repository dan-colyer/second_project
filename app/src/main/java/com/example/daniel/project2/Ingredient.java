package com.example.daniel.project2;

/**
 * Created by Daniel on 17/11/2017.
 */

public class Ingredient {

    private String name;
    private int quantity;

    public Ingredient(String name, int quantity) {
        this.name = name;
        this.quantity = quantity;

    }

    public String getName() {
        return name;
    }

    public int getQuantity() {
        return quantity;
    }
}
