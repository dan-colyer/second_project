package com.example.daniel.project2;

import com.example.daniel.project2.behaviours.Orderable;

import java.util.ArrayList;

/**
 * Created by Daniel on 17/11/2017.
 */

class Patron {

    private double bill;
    private ArrayList<Orderable> orders;

    public Patron(ArrayList<Orderable> order) {
        this.bill = 0;
        this.orders = order;
    }

    public double getBill() {
        return bill;
    }

    public ArrayList<String> getOrders() {
        ArrayList<String> orderNames = new ArrayList<>();
        for (Orderable order : orders) {
            orderNames.add(order.getName());
        }
        return orderNames;
    }

    public double calculateOrderTotalCost() {
        for (Orderable order : orders) {
            this.bill += order.getPrice();
        }
        return this.bill;
    }

    public void addToOrder(Orderable item) {
        orders.add(item);
    }

    public void removeFromOrder(Orderable item) {
        orders.remove(item);
    }
}
