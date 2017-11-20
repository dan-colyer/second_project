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

        chickenThigh = new Ingredient("chicken thigh");
        potato = new Ingredient("potato");
    }


    // Test 1
    @Test
    public void testGetName() {
        assertEquals("chicken thigh", chickenThigh.getName());
    }
}
