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



        Food dish1 = new Food("Main", fryChicken, "fried chicken", 10.00);

        Restaurant restaurant = new Restaurant();

        Table table1 = new Table();

        Patron patron1 = new Patron();
    }
}



