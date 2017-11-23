package com.example.daniel.project2;

import com.example.daniel.project2.behaviours.Orderable;

import java.util.ArrayList;

/**
 * Created by Daniel on 17/11/2017.
 */

public abstract class MenuItem implements Orderable {

    private ArrayList<Ingredient> ingredients;
    private String name;
    private double price;

    public MenuItem(ArrayList<Ingredient> ingredients, String name, double price) {
        this.ingredients = ingredients;
        this.name = name;
        this.price = price;
    }


    public ArrayList<String> getIngredientsNames() {
        ArrayList<String> ingredientNames = new ArrayList<>();
        for (Ingredient ingredient : ingredients) {
            ingredientNames.add(ingredient.getName());
        }
        return ingredientNames;
    }

    public ArrayList<Ingredient> getIngredients() {
        return new ArrayList<Ingredient>(ingredients);
    }

    public void addIngredient(Ingredient item) {
        ingredients.add(item);
    }

    public void removeIngredient(Ingredient item) {
        ingredients.remove(item);
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }
}

