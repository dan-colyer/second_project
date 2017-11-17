package com.example.daniel.project2;

import java.util.ArrayList;

/**
 * Created by Daniel on 17/11/2017.
 */

public class Drink extends MenuItem {

    private String volumeMeasure;

    public Drink(ArrayList<Ingredient> ingredients, String foodName, double price, String volumeMeasure) {
        super(ingredients, foodName, price);

        this.volumeMeasure = volumeMeasure;
    }
}
