package com.example.daniel.project2;

import java.util.ArrayList;

/**
 * Created by Daniel on 17/11/2017.
 */

public class Food extends MenuItem {
    private String course;

    public Food(String course, ArrayList<Ingredient> ingredients, String foodName, double price) {
        super(ingredients, foodName, price);
        this.course = course;
    }

    public String getCourse() {
        return course;
    }
}
