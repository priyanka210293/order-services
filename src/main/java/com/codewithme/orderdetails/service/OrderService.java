package com.codewithme.orderdetails.service;

import com.codewithme.orderdetails.dto.OrderDTO;
import com.codewithme.orderdetails.dto.OrderDTOFromFE;
import com.codewithme.orderdetails.entity.Order;
import com.codewithme.orderdetails.repo.OrderRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@Service
public class OrderService {

    @Autowired
    OrderRepo orderRepo;


    public OrderDTO saveOrderInDb(OrderDTOFromFE orderDetails) {

        Order order = new Order();


    }
}
}
