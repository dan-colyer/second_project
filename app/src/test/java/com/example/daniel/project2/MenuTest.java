package com.example.daniel.project2;

import com.example.daniel.project2.behaviours.Orderable;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static junit.framework.Assert.assertEquals;

/**
 * Created by Daniel on 20/11/2017.
 */

public class MenuTest {

    Ingredient chickenThigh, potato, broccoli, gravy, herbs, vodka, lemon, pruneJuice;
    Food food1, food2;
    Drink drink1, drink2;
    Menu menu;

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
    }

    // Test 1
    @Test
    public void testGetItems() {
        ArrayList<String> actual = menu.getItems();
        assertEquals("[fried chicken, roast chicken, prune cocktail]", actual.toString());
    }

    // Test 2
    @Test
    public void testAddItem() {
        ArrayList<Ingredient> vodkaGravy = new ArrayList<>();
        vodkaGravy.add(vodka);
        vodkaGravy.add(gravy);
        drink2 = new Drink(vodkaGravy, "gravy cocktail", 7.50, "half pint");

        menu.addItem(drink2);
        ArrayList<String> actual = menu.getItems();
        assertEquals("[fried chicken, roast chicken, prune cocktail, gravy cocktail]", actual.toString());
    }

    // Test 3
    @Test
    public void testRemoveItem() {
        menu.removeItem(drink1);
        ArrayList<String> actual = menu.getItems();
        assertEquals("[fried chicken, roast chicken]", actual.toString());
    }

}
