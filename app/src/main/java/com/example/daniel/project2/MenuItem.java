package com.example.daniel.project2;

import com.example.daniel.project2.behaviours.Orderable;

import java.util.ArrayList;

/**
 * Created by Daniel on 17/11/2017.
 */

public abstract class MenuItem implements Orderable {

    private ArrayList<Ingredient> ingredients;
    private String itemName;
    private double price;

    public MenuItem(ArrayList<Ingredient> ingredients, String itemName, double price) {
        this.ingredients = ingredients;
        this.itemName = itemName;
        this.price = price;
    }
}
