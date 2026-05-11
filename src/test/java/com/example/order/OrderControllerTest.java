package com.example.order;



import com.example.order.controller.OrderController;
import com.example.order.domain.model.dto.OrderDto;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.resttestclient.TestRestTemplate;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.ResponseEntity;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.List;


@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class OrderControllerTest {

    @Autowired
    private TestRestTemplate restTemplate;

    @Test
    void should_return_orders(){
        //ResponseEntity<OrderDto[]> response = restTemplate.getForEntity("/orders", OrderDto[].class);
        //OrderDto[] orders = response.getBody();
        System.out.println("================");
       // assertEquals("Gabriel",orders[0].getCustomer());
    }


}
