package com.example.order.domain.model.dto;

public class OrderCreateDto {
    private double price;
    private String customer;

    public double getPrice() {
        return price;
    }

    public String getCustomer() {
        return customer;
    }
}
