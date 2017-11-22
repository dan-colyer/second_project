package com.example.daniel.project2;

import org.junit.Before;
import org.junit.Test;

import static junit.framework.Assert.assertEquals;

/**
 * Created by Daniel on 20/11/2017.
 */

public class IngedientTest {

    Ingredient chickenThigh, potato;

    @Before
    public void before() {

        chickenThigh = new Ingredient("chicken thigh", 5);
        potato = new Ingredient("potato", 5);
    }


    // Test 1
    @Test
    public void testGetName() {
        assertEquals("chicken thigh", chickenThigh.getName());
    }

    // Test 2
    @Test
    public void testGetQuantity() {
        assertEquals(5, chickenThigh.getQuantity());
    }
}
