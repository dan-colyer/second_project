package com.example.daniel.project2;

import com.example.daniel.project2.behaviours.Orderable;

import org.junit.Before;

import java.util.ArrayList;

/**
 * Created by Daniel on 17/11/2017.
 */

public class RestaurantTest {

    Restaurant restaurant;
    Table table;
    Patron patron;
    Ingredient ingredient;
    Food food;
    Drink drink;
    Menu menu;

    @Before
    public void before() {

        Ingredient chickenThigh = new Ingredient("chicken thigh") ;
        Ingredient potato = new Ingredient("potato");
        Ingredient broccoli = new Ingredient("broccoli");
        Ingredient gravy = new Ingredient("gravy");
        Ingredient herbs = new Ingredient("herbs");
        Ingredient vodka = new Ingredient("vodka");
        Ingredient lemon = new Ingredient("lemon");
        Ingredient pruneJuice = new Ingredient("prune juice");

        ArrayList<Ingredient> fryChicken = new ArrayList<>();
        fryChicken.add(chickenThigh);
        fryChicken.add(herbs);
        Food food1 = new Food("Main", fryChicken, "fried chicken", 10.00);

        ArrayList<Ingredient> roastChicken = new ArrayList<>();
        roastChicken.add(chickenThigh);
        roastChicken.add(potato);
        roastChicken.add(broccoli);
        roastChicken.add(gravy);
        Food food2 = new Food("Main", roastChicken, "roast chicken", 12.00);

        ArrayList<Ingredient> vodkaPrune = new ArrayList<>();
        vodkaPrune.add(vodka);
        vodkaPrune.add(lemon);
        vodkaPrune.add(pruneJuice);
        Drink drink1 = new Drink(vodkaPrune, "prune cocktail", 7.50, "pint");

        ArrayList<Orderable> mainMenu = new ArrayList<>();
        mainMenu.add(food1);
        mainMenu.add(food2);
        mainMenu.add(drink1);
        Menu menu = new Menu(mainMenu);

        ArrayList<Orderable> patron1Order = new ArrayList<>();
        Patron patron1 = new Patron(patron1Order);

        ArrayList<Orderable> patron2Order = new ArrayList<>();
        Patron patron2 = new Patron(patron2Order);

        ArrayList<Orderable> patron3Order = new ArrayList<>();
        Patron patron3 = new Patron(patron3Order);

        ArrayList<Patron> table1Patrons = new ArrayList<>();
        table1Patrons.add(patron1);
        table1Patrons.add(patron2);
        Table table1 = new Table(table1Patrons);

        ArrayList<Patron> table2Patrons = new ArrayList<>();
        table2Patrons.add(patron3);
        Table table2 = new Table(table2Patrons);

        ArrayList<Table> tables = new ArrayList<>();
        tables.add(table1);
        tables.add(table2);
        Restaurant restaurant = new Restaurant(tables, menu);
    }
}



