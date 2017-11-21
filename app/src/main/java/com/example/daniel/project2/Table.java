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

    public void addPatronToTable(Patron patron) {
        patrons.add(patron);
    }

    public void removePatronFromTable(Patron patron) {
        patrons.remove(patron);
    }

    public double calculateTableBill() {
        double tableBill = 0;
        for (Patron bill : patrons) {
            tableBill += bill.calculateOrderTotalCost();
        }
        return tableBill;
    }

    public void clearTable() {
        patrons.clear();
    }

    public double calculateTableBillOnePersonPaying(Patron patron) {

        double onePayer = calculateTableBill();

        for (Patron eachPatron : patrons) {
            eachPatron.clearBill();
        }
        patron.setBill(onePayer);
        return patron.getBill();
    }
}
