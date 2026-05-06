package com.example.order.service;

import com.example.order.domain.discount.Discount;
import com.example.order.domain.model.entities.Order;
import com.example.order.domain.payment.Payment;
import org.springframework.stereotype.Service;

@Service
public class DefaultCheckout extends CheckoutTemplate{

    private Discount discount;
    private Payment payment;

    public DefaultCheckout(Discount discount, Payment payment) {
        this.discount = discount;
        this.payment = payment;
    }

    @Override
    protected void validate(Order order) {
        if(order == null){
            System.out.println("The object can't null");
            return;
        }
    }

    @Override
    protected void log(Order o){
        System.out.println("The price of Order is: "+o.getPrice());
    }

    @Override
    protected double applyDiscount(double price) {
            return price * 0.10;
    }

    @Override
    protected void pay(Order order) {

    }


}
