package com.example.daniel.project2;

import com.example.daniel.project2.behaviours.Orderable;

import java.util.ArrayList;

/**
 * Created by Daniel on 17/11/2017.
 */

public class Menu {

    private ArrayList<Orderable> items;

    public Menu(ArrayList<Orderable> items) {
        this.items = items;
    }

    public ArrayList<String> getItems() {
        ArrayList<String> itemNames = new ArrayList<>();
        for (Orderable item : items) {
            itemNames.add(item.getName());
        }
        return itemNames;
    }

    public void addItem(Drink item) {
        items.add(item);
    }
}
