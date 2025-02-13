package com.codewithme.orderdetails.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class OrderDTO {

    private Integer orderId;
    private List<FoodItemDTO> foodItemList;
    private RestaurantDTO restaurant;
    private UserDetailDTO userDetailDTO;


}
