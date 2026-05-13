package com.example.order.controller;

import com.example.order.domain.model.dto.OrderCreateDto;
import com.example.order.domain.model.dto.OrderCreateResponseDto;
import com.example.order.domain.model.dto.OrderDto;
import com.example.order.domain.model.entities.Order;
import com.example.order.service.OrderService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/orders")
public class OrderController {


    private OrderService service;

    public OrderController(OrderService service){
            this.service = service;
    }

    @GetMapping()
    public ResponseEntity<List<OrderDto>> listAll(){
        return new ResponseEntity<>(service.listAll(),HttpStatus.OK);
    }

    @PostMapping()
    public ResponseEntity<OrderCreateResponseDto> create(@RequestBody OrderCreateDto dto){
        return new ResponseEntity<OrderCreateResponseDto>(service.create(dto),HttpStatus.CREATED);
    }

    @PostMapping("/{id}/checkout")
    public ResponseEntity<String> create(@RequestBody OrderCreateDto dto,@PathVariable Long id){
        Order o = new Order(id,dto.getCustomer(), dto.getPrice());
        service.checkout(o);
        return new ResponseEntity<>("successful",HttpStatus.OK);
    }


}
