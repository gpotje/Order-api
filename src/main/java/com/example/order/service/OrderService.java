package com.example.order.service;

import com.example.order.domain.discount.DefaultDiscount;
import com.example.order.domain.discount.Discount;
import com.example.order.domain.model.dto.OrderCreateDto;
import com.example.order.domain.model.dto.OrderDto;
import com.example.order.domain.model.entities.Order;
import com.example.order.domain.payment.CreditPayment;
import com.example.order.domain.payment.Payment;
import com.example.order.repository.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class OrderService {

    private CheckoutTemplate checkoutTemplate;

    @Autowired
    private OrderRepository repository;

    public OrderService(CheckoutTemplate checkoutTemplate){
        this.checkoutTemplate = checkoutTemplate;

    }

    public Long create(OrderCreateDto dto){
         Order order = repository.save(new Order(dto.getCustomer(),dto.getPrice()));
        return order.getId();
    }

    private List<OrderDto> convertOrderInOrderDto(List<Order> orderList){
        List<OrderDto> dto =  new ArrayList<>();
        for(Order order : orderList){
            dto.add(new OrderDto(order.getId(),order.getCustomer(),order.getPrice()));
        }
        return dto;
    }

    public List<OrderDto> listAll(){
        return convertOrderInOrderDto(repository.findAll());
    }

    public void checkout(Order order){
        checkoutTemplate.process(order);
    }

}
