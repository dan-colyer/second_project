package com.example.daniel.project2;

import com.example.daniel.project2.behaviours.Orderable;

import java.util.ArrayList;

/**
 * Created by Daniel on 17/11/2017.
 */

class Patron {

    private double bill;
    private ArrayList<Orderable> order;

    public Patron(ArrayList<Orderable> order) {
        this.bill = 0;
        this.order = order;
    }
}
