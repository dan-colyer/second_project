package com.example.daniel.project2;

import java.util.ArrayList;

/**
 * Created by Daniel on 17/11/2017.
 */

class Table {

    private String tableName;
    private ArrayList<Patron> patrons;

    public Table(String tableName, ArrayList<Patron> patrons) {
        this.tableName = tableName;
        this.patrons = new ArrayList();
    }

}
