package com.example.daniel.project2;

import android.view.Menu;

import java.util.ArrayList;

/**
 * Created by Daniel on 17/11/2017.
 */

public class Restaurant {

    private double budget;
    ArrayList<Table> tables;
    com.example.daniel.project2.Menu menu;

    public Restaurant(ArrayList<Table> tables, com.example.daniel.project2.Menu menu) {
        this.budget = 0;
        this.tables = tables;
        this.menu = menu;
    }

    public double getBudget() {
        return budget;
    }


    public int countTables() {
        return tables.size();
    }
}
