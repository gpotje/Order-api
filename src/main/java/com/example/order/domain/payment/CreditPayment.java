package com.example.order.domain.payment;

public class CreditPayment implements Payment{
    @Override
    public void pay() {
        System.out.println("Payment by credit");
    }
}
