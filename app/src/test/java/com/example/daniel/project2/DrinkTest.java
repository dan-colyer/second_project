package com.example.daniel.project2;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static junit.framework.Assert.assertEquals;

/**
 * Created by Daniel on 20/11/2017.
 */

public class DrinkTest {

    Drink drink1;
    Ingredient vodka, lemon, pruneJuice;

    @Before
    public void before() {

        vodka = new Ingredient("vodka");
        lemon = new Ingredient("lemon");
        pruneJuice = new Ingredient("prune juice");

        ArrayList<Ingredient> vodkaPrune = new ArrayList<>();
        vodkaPrune.add(vodka);
        vodkaPrune.add(lemon);
        vodkaPrune.add(pruneJuice);
        drink1 = new Drink(vodkaPrune, "prune cocktail", 7.50, "pint");
    }

    // Test 1
    @Test
    public void testGetVolumeMeasure() {
        assertEquals("pint", drink1.getVolumeMeasure());
    }
}
