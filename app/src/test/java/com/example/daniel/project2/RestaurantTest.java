package com.example.daniel.project2;

import com.example.daniel.project2.behaviours.Orderable;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;


/**
 * Created by Daniel on 17/11/2017.
 */

public class RestaurantTest {

    Restaurant mariosRestaurant;
    Table table1, table2;
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
        patron1Order.add(food1);
        patron1Order.add(drink1);
        patron1 = new Patron(patron1Order, "patron1");

        ArrayList<Orderable> patron2Order = new ArrayList<>();
        patron2Order.add(food2);
        patron2 = new Patron(patron2Order, "patron2");

        ArrayList<Orderable> patron3Order = new ArrayList<>();
        patron3 = new Patron(patron3Order, "patron3");

        ArrayList<Patron> table1Patrons = new ArrayList<>();
        table1Patrons.add(patron1);
        table1Patrons.add(patron2);
        table1 = new Table(table1Patrons);

        ArrayList<Patron> table2Patrons = new ArrayList<>();
        table2Patrons.add(patron3);
        table2 = new Table(table2Patrons);

        ArrayList<Table> tables = new ArrayList<>();
        tables.add(table1);
        tables.add(table2);
        mariosRestaurant = new Restaurant(tables, menu);
    }

    // Test 1
    @Test
    public void testGetBudget() {
        assertEquals(0, mariosRestaurant.getBudget(), 0.01);
    }

    // Test 2
    @Test
    public void testCountTables() {
        int actual = mariosRestaurant.countTables();
        assertEquals(2, actual);
    }

    // Test 3
    @Test
    public void testGetMenu() {
        assertEquals(menu, mariosRestaurant.getMenu());
    }

    // Test 4
    @Test
    public void testAddTables() {
        ArrayList<Orderable> patron4Order = new ArrayList<>();
        Patron patron4 = new Patron(patron4Order, "patron4");
        ArrayList<Patron> table3Patrons = new ArrayList<>();
        table3Patrons.add(patron4);

        Table table3 = new Table(table3Patrons);

        mariosRestaurant.tables.add(table3);

        assertEquals(3, mariosRestaurant.countTables());
    }

    // Test 5
    @Test
    public void testTablePays() {
        mariosRestaurant.tablePays(table1);
        double actual = mariosRestaurant.getBudget();
        assertEquals(29.50, actual, 0.01);
    }

    // Test 6
    @Test
    public void testTableEmptyAfterTablePays() {
        mariosRestaurant.tablePays(table1);
        assertEquals(0, table1.getPatrons().size(), 0.01);
    }

    // Test 7
    @Test
    public void testPatronPaysForTable() {
        mariosRestaurant.patronPaysForTable(table1, patron1);
        double actual = mariosRestaurant.getBudget();
        assertEquals(29.50, actual, 0.01);
        assertEquals(0, table1.getPatrons().size());
    }
}



