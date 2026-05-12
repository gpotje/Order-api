package com.example.order.domain.model.entities;

import jakarta.persistence.*;

@Entity
@Table(name = "tb_order")
public class Order {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private double price;
    private String customer;

    public Order() {
    }

    public Order(Long id, String customer, double price) {
        this.id = id;
        this.customer = customer;
        this.price = price;
    }

    public Order( String customer,double price) {
        this.price = price;
        this.customer = customer;
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

    public void setPrice(double price) {
        this.price = price;
    }
}
