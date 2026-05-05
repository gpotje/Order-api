package com.example.order.service;

import com.example.order.domain.discount.Discount;
import com.example.order.domain.model.entities.Order;
import com.example.order.domain.payment.Payment;

abstract class CheckoutTemplate {

    public void process(Order order) {
        validate(order);
        order.setPrice(order.getId() - applyDiscount(order.getPrice()));
        pay(order);
        log(order);
    }

    protected void validate(Order o){}
    protected void log(Order o){}
    protected abstract double applyDiscount(double price);
    protected abstract void pay(Order order);

}
