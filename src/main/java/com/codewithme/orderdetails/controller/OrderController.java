package com.codewithme.orderdetails.controller;

import com.codewithme.orderdetails.dto.OrderDTO;
import com.codewithme.orderdetails.dto.OrderDTOFromFE;
import com.codewithme.orderdetails.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/order")
public class OrderController {

    @Autowired
    OrderService orderService;

    @PostMapping("/saveOrders")
    public ResponseEntity<OrderDTO> saveOrder(@RequestBody OrderDTOFromFE orderDetails) {
       OrderDTO orderDto = orderService.saveOrderInDb(orderDetails);
        return new ResponseEntity<>(orderDto, HttpStatus.CREATED);
    }
}
