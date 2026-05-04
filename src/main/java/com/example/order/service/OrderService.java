package com.example.order.service;

import com.example.order.domain.dto.OrderCreateDto;
import com.example.order.domain.dto.OrderDto;
import com.example.order.domain.entities.Order;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Service
public class OrderService {

    private List<Order> orderList;
    private Long idCounter = 1L;

    public OrderService(){
        orderList = new ArrayList<>();
        orderList.add(new Order(idCounter,
                "Gabriel"
                ,100.0));
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

}
