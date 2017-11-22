package com.example.daniel.project2;

import com.example.daniel.project2.behaviours.Orderable;

import java.util.ArrayList;
import java.util.HashMap;

/**
 * Created by Daniel on 22/11/2017.
 */

public class Kitchen {

    private ArrayList<Ingredient> pantry;

    public Kitchen(ArrayList<Ingredient> pantry) {
        this.pantry = pantry;
    }

    public ArrayList<String> getPantry() {
        ArrayList<String> ingredientNames = new ArrayList<>();
        for (Ingredient ingredient : pantry) {
            ingredientNames.add(ingredient.getName());
        }
        return ingredientNames;
    }

    public ArrayList<String> getPantryWithQuantities() {
        ArrayList<String> ingredientNames = new ArrayList<>();
        for (Ingredient ingredient : pantry) {
            ingredientNames.add(ingredient.getName() + ": " + ingredient.getQuantity());
        }
        return ingredientNames;
    }

    public int getIngredientQuantity(Ingredient ingredient) {
        for (Ingredient item : pantry) {
            if (item == ingredient) {
                return item.getQuantity();
            }
        }
        return 0;
    }
}
