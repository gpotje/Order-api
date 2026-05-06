package com.example.order.service;

import com.example.order.domain.discount.DefaultDiscount;
import com.example.order.domain.discount.Discount;
import com.example.order.domain.model.dto.OrderCreateDto;
import com.example.order.domain.model.dto.OrderDto;
import com.example.order.domain.model.entities.Order;
import com.example.order.domain.payment.CreditPayment;
import com.example.order.domain.payment.Payment;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class OrderService {

    private List<Order> orderList;
    private Long idCounter = 1L;
    private CheckoutTemplate checkoutTemplate;

    public OrderService(CheckoutTemplate checkoutTemplate){
        orderList = new ArrayList<>();
        this.checkoutTemplate = checkoutTemplate;

    }

    public Long create(OrderCreateDto dto){
        orderList.add(new Order(idCounter,
                    dto.getCustomer()
                    ,dto.getPrice()));
        return idCounter;
    }

    private List<OrderDto> convertOrderInOrderDto(){
        List<OrderDto> dto = new ArrayList<>();
        for(Order o :orderList){
            dto.add(new OrderDto(o.getId() + 1,o.getCustomer(),o.getPrice()));
        }
        return dto;
    }

    public List<OrderDto> listAll(){
        return convertOrderInOrderDto();
    }

    public void checkout(Order order){
        checkoutTemplate.process(order);
    }

}
