package com.example.order.controller;

import com.example.order.domain.dto.OrderCreateDto;
import com.example.order.domain.dto.OrderDto;
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
    public ResponseEntity<Long> create(@RequestBody OrderCreateDto dto){
        return new ResponseEntity<Long>(service.create(dto),HttpStatus.CREATED);
    }
}
