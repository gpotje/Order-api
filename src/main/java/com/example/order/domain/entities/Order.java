package com.example.order.domain.entities;

public class Order {
    private Long id;
    private double price;
    private String customer;

    public Order(Long id, String customer, double price) {
        this.id = id;
        this.customer = customer;
        this.price = price;
    }

    public Long getId() {
        return id;
    }

    public String getCustomer() {
        return customer;
    }

    public double getPrice() {
        return price;
    }
}
