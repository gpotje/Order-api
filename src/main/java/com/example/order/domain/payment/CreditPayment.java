package com.example.order.domain.payment;

import org.springframework.stereotype.Service;

@Service
public class CreditPayment implements Payment{
    @Override
    public void pay() {
        System.out.println("Payment by credit");
    }
}
