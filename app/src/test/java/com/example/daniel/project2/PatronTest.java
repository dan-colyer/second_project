package com.example.daniel.project2;

import com.example.daniel.project2.behaviours.Orderable;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static junit.framework.Assert.assertEquals;

/**
 * Created by Daniel on 20/11/2017.
 */

public class PatronTest {

    Patron patron1, patron2;
    Ingredient chickenThigh, potato, broccoli, gravy, herbs, vodka, lemon, pruneJuice;
    Food food1, food2;
    Drink drink1;
    Menu menu;
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

        ArrayList<Orderable> mainMenu = new ArrayList<>();
        mainMenu.add(food1);
        mainMenu.add(food2);
        mainMenu.add(drink1);
        menu = new Menu(mainMenu);

        ArrayList<Orderable> patron1Order = new ArrayList<>();
        patron1Order.add(food1);
        patron1Order.add(drink1);
        patron1 = new Patron(patron1Order, "patron1");

        ArrayList<Orderable> patron2Order = new ArrayList<>();
        patron2Order.add(food2);
        patron2 = new Patron(patron2Order, "patron2");
    }

    // Test 1
    @Test
    public void testGetBill() {
        assertEquals(0, patron1.getBill(), 0.01);
    }

    // Test 2
    @Test
    public void testGetOrders() {
        ArrayList<String> actual = patron1.getOrders();
        assertEquals("[fried chicken, prune cocktail]", actual.toString());
    }

    // Test 3
    @Test
    public void testCalculateOrderTotalCost() {
        double actual = patron1.calculateOrderTotalCost();
        assertEquals(17.50, actual, 0.01);
    }

    // Test 4
    @Test
    public void testAddToOrder() {
        patron1.addToOrder(food2);
        int actual = patron1.getOrders().size();
        assertEquals(3, actual);

        double actual2 = patron1.calculateOrderTotalCost();
        assertEquals(29.50, actual2, 0.01);
    }

    // Test 5
    @Test
    public void testRemoveFromOrder() {
        patron1.removeFromOrder(food1);
        int actual = patron1.getOrders().size();
        assertEquals(1, actual);
    }

    // Test 6
    @Test
    public void testClearBill() {
        patron1.clearBill();
        double actual = patron1.calculateOrderTotalCost();
        assertEquals(0, actual, 0.01);
    }

    // Test 7
    @Test
    public void testGetName() {
        assertEquals("patron2", patron2.getName());
    }

    // Test 8
    @Test
    public void testSetBill() {
        patron1.setBill(117.50);
        double actual = patron1.getBill();
        assertEquals(117.50, actual, 0.01);
    }


}
