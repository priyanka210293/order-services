package com.codewithme.orderdetails.dto;


import lombok.*;

@Data
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class UserDetailDTO {

    private int userId;
    private String userName;
    private String password;
    private String address;
    private String  city;

}
