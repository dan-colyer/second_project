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

    public com.example.daniel.project2.Menu getMenu() {
        return menu;
    }

    public void tablePays(Table table) {
        double tableBill = table.calculateTableBill();
        this.budget += tableBill;
        table.clearTable();
    }

    public void patronPaysForTable(Table table, Patron patron) {
        double patronTableBill = table.calculateTableBillOnePersonPaying(patron);
        this.budget += patronTableBill;
        table.clearTable();
    }
}
