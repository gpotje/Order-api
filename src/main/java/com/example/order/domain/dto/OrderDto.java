package com.example.order.domain.dto;

public class OrderDto {
    private String id;
    private double price;
    private String customer;

    public OrderDto(String id, String customer, double price) {
        this.id = id;
        this.customer = customer;
        this.price = price;
    }

    public String getId() {
        return id;
    }


    public double getPrice() {
        return price;
    }

    public String getCustomer() {
        return customer;
    }
}
