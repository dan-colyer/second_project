package com.example.daniel.project2;

import com.example.daniel.project2.behaviours.Orderable;

import java.util.ArrayList;

/**
 * Created by Daniel on 17/11/2017.
 */

public abstract class MenuItem implements Orderable {

    private ArrayList<Ingredient> ingredients;
    private String foodName;
    private double price;

    public MenuItem(ArrayList<Ingredient> ingredients, String foodName, double price) {
        this.ingredients = new ArrayList();
        this.foodName = foodName;
        this.price = price;
    }
}
