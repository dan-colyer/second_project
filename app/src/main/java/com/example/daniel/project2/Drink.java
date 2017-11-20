package com.example.daniel.project2;

import java.util.ArrayList;

/**
 * Created by Daniel on 17/11/2017.
 */

public class Drink extends MenuItem {

    private String volumeMeasure;

    public Drink(ArrayList<Ingredient> ingredients, String name, double price, String volumeMeasure) {
        super(ingredients, name, price);

        this.volumeMeasure = volumeMeasure;
    }

    public String getVolumeMeasure() {
        return volumeMeasure;
    }
}
