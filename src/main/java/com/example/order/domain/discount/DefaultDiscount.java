package com.example.order.domain.discount;

import com.example.order.domain.model.entities.Order;

public class DefaultDiscount implements Discount{
    @Override
    public double apply(double price) {
        return price *0.10;
    }

    protected void validate(Order o){
        if(o == null){
            System.out.println("The object doesn't have null ");
            return;
        }
    }
    protected void log(Order o){
        System.out.println("The Order Price: "+o.getPrice());
    }
}
