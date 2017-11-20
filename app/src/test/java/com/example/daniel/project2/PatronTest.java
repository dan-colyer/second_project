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

    Patron patron1, patron2, patron3;
    Ingredient chickenThigh, potato, broccoli, gravy, herbs, vodka, lemon, pruneJuice;
    Food food1, food2;
    Drink drink1;
    Menu menu;

    @Before
    public void before() {

        chickenThigh = new Ingredient("chicken thigh") ;
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
        patron1 = new Patron(patron1Order);

        ArrayList<Orderable> patron2Order = new ArrayList<>();
        patron2 = new Patron(patron2Order);

        ArrayList<Orderable> patron3Order = new ArrayList<>();
        patron3 = new Patron(patron3Order);

    }

    // Test 1
    @Test
    public void testGetBill() {
        assertEquals(0, patron1.getBill(), 0.01);
    }
}
