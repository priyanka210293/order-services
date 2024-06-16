package com.codewithme.orderdetails.entity;

import com.codewithme.orderdetails.dto.FoodItemDTO;
import com.codewithme.orderdetails.dto.RestaurantDTO;
import com.codewithme.orderdetails.dto.UserDetailDTO;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Document("order")
public class Order {

        private Integer orderId;
        private List<FoodItemDTO> foodItemList;
        private RestaurantDTO restaurant;
        private UserDetailDTO userDetailDTO;
}
