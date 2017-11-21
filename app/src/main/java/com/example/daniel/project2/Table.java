package com.example.daniel.project2;

import com.example.daniel.project2.behaviours.Orderable;

import java.util.ArrayList;

/**
 * Created by Daniel on 17/11/2017.
 */

class Table {

    private ArrayList<Patron> patrons;

    public Table(ArrayList<Patron> patrons) {
        this.patrons = patrons;
    }

        public ArrayList<String> getPatrons() {
            ArrayList<String> patronList = new ArrayList<>();
            for (Patron patron : patrons) {
                patronList.add(patron.getName());
            }
            return patronList;
        }

}
