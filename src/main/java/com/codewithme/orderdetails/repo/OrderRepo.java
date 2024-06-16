package com.codewithme.orderdetails.repo;

import com.codewithme.orderdetails.entity.Order;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrderRepo extends MongoRepository<Order,Integer> {
}
