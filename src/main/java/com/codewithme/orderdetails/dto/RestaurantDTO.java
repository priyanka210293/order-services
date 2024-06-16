package com.codewithme.orderdetails.dto;

import lombok.*;

@Data
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class RestaurantDTO {

    private int id;
    private String name;
    private String address;
    private String city;
    private String restaurantDescription;
}
