package com.example.order.domain.entities;

public class Order {
    private String id;
    private double price;
    private String customer;

    public Order(String id, String customer, double price) {
        this.id = id;
        this.customer = customer;
        this.price = price;
    }

    public String getId() {
        return id;
    }

    public String getCustomer() {
        return customer;
    }

    public double getPrice() {
        return price;
    }
}
