package com.example.daniel.project2;

import com.example.daniel.project2.behaviours.Orderable;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static junit.framework.Assert.assertEquals;

/**
 * Created by Daniel on 22/11/2017.
 */

public class KitchenTest {

    Ingredient chickenThigh, potato, broccoli, gravy, herbs, vodka, lemon, pruneJuice;
    Food food1, food2;
    Drink drink1;
    Kitchen kitchen;

    @Before
    public void before() {

        chickenThigh = new Ingredient("chicken thigh", 5) ;
        potato = new Ingredient("potato", 5);
        broccoli = new Ingredient("broccoli", 5);
        gravy = new Ingredient("gravy", 5);
        herbs = new Ingredient("herbs", 5);
        vodka = new Ingredient("vodka", 5);
        lemon = new Ingredient("lemon", 5);
        pruneJuice = new Ingredient("prune juice", 5);

        ArrayList<Ingredient> ingredients = new ArrayList<>();
        ingredients.add(chickenThigh);
        ingredients.add(potato);
        ingredients.add(broccoli);
        ingredients.add(gravy);
        ingredients.add(herbs);
        ingredients.add(vodka);
        ingredients.add(lemon);
        ingredients.add(pruneJuice);
        kitchen = new Kitchen(ingredients);

        ArrayList<Ingredient> fryChicken = new ArrayList<>();
        fryChicken.add(chickenThigh);
        fryChicken.add(herbs);
        food1 = new Food("Main", fryChicken, "fried chicken", 10.00);

        ArrayList<Ingredient> roastChicken = new ArrayList<>();
        roastChicken.add(chickenThigh);
        roastChicken.add(potato);
        roastChicken.add(broccoli);
        roastChicken.add(gravy);
        food2 = new Food("Main", roastChicken, "roast chicken", 12.00);

        ArrayList<Ingredient> vodkaPrune = new ArrayList<>();
        vodkaPrune.add(vodka);
        vodkaPrune.add(lemon);
        vodkaPrune.add(pruneJuice);
        drink1 = new Drink(vodkaPrune, "prune cocktail", 7.50, "pint");
    }

    // Test 1
    @Test
    public void testGetPantry() {
        ArrayList<String> actual = kitchen.getPantry();
        assertEquals("[chicken thigh, potato, broccoli, gravy, herbs, vodka, lemon, prune juice]", actual.toString());
    }

    // Test 2
    @Test
    public void testGetPantryWithQuantities() {
        ArrayList<String> actual = kitchen.getPantryWithQuantities();
        assertEquals("[chicken thigh: 5, potato: 5, broccoli: 5, gravy: 5, herbs: 5, vodka: 5, lemon: 5, prune juice: 5]", actual.toString());
    }

    // Test 3
    @Test
    public void testGetIngredientQuantity() {
        int actual = kitchen.getIngredientQuantity(chickenThigh);
        assertEquals(5, actual);
    }

    // Test 4
    @Test
    public void testAddIngredientToPantry() {
        Ingredient testIngredient = new Ingredient("test", 1);
        kitchen.addIngredientToPantry(testIngredient);
        assertEquals(9, kitchen.getPantry().size());
    }

    // Test 5
    @Test
    public void testRemoveIngredientFromPantry() {
        kitchen.removeIngredientFromPantry(chickenThigh);
        assertEquals(7, kitchen.getPantry().size());
    }
}
