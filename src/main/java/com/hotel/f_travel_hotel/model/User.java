package com.hotel.f_travel_hotel.model;

import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

import com.hotel.f_travel_hotel.Enum.CustomerRank;
import com.hotel.f_travel_hotel.Enum.Gender;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class User {
    private int user_id;
    private String full_name;
    private String phone_number;
    private String email;
    private Gender gender;
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date birthday;
    private int point;
    private CustomerRank customer_rank;
}
