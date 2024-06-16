package com.codewithme.orderdetails.dto;

import lombok.*;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class OrderDTOFromFE {

private List<FoodItemDTO> foodItems;
private Integer userId;
private RestaurantDTO restaurant;
}
