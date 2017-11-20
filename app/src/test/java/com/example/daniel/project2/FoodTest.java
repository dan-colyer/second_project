package com.example.daniel.project2;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static junit.framework.Assert.assertEquals;

/**
 * Created by Daniel on 20/11/2017.
 */

public class FoodTest {

    Ingredient chickenThigh, potato, broccoli, gravy, herbs, vodka, lemon, pruneJuice;
    Food food1, food2;

    @Before
    public void before() {

        chickenThigh = new Ingredient("chicken thigh");
        potato = new Ingredient("potato");
        broccoli = new Ingredient("broccoli");
        gravy = new Ingredient("gravy");
        herbs = new Ingredient("herbs");
        vodka = new Ingredient("vodka");
        lemon = new Ingredient("lemon");
        pruneJuice = new Ingredient("prune juice");

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
    }

    // Test 1
    @Test
    public void testGetCourse() {
        assertEquals("Main", food1.getCourse());
    }

    // Test 2
    @Test
    public void testGetIngredients() {
        ArrayList<String> actual = food1.getIngredients();
        assertEquals("[chicken thigh, herbs]", actual.toString());
    }

    // Test 3
    @Test
    public void testAddIngredient() {
        Ingredient garlic = new Ingredient("garlic");
        food1.addIngredient(garlic);
        String actual = food1.getIngredients().toString();
        assertEquals("[chicken thigh, herbs, garlic]", actual);
    }

    // Test 4
    @Test
    public void testRemoveIngredient() {
        food1.removeIngredient(herbs);
        String actual = food1.getIngredients().toString();
        assertEquals("[chicken thigh]", actual);
    }

    // Test 5
    @Test
    public void testGetName() {
        assertEquals("roast chicken", food2.getName());
    }
}
