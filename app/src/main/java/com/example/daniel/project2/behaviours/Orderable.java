package com.example.daniel.project2.behaviours;

import com.example.daniel.project2.Ingredient;

import java.util.ArrayList;

/**
 * Created by Daniel on 17/11/2017.
 */

public interface Orderable {

    String getName();
    double getPrice();
    ArrayList<String> getIngredients();
}
