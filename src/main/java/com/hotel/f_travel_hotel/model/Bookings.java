package com.hotel.f_travel_hotel.model;

<<<<<<< HEAD
public class Bookings {
=======
import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Bookings {
    private int booking_id;
    @DateTimeFormat(pattern = "yyyy-MM-dd ' ' HH:mm:ss")
    private Date create_date;
    @DateTimeFormat(pattern = "yyyy-MM-dd ' ' HH:mm:ss")
    private Date check_in_date;
    @DateTimeFormat(pattern = "yyyy-MM-dd ' ' HH:mm:ss")
    private Date check_out_date;
    private int number_of_adults;
    private int number_of_children;
    private long  room_total_price;
    private long service_total_price;
    private int status_payment;
    private User user;
    private Coupons coupons;

>>>>>>> 36b1705 (Code duy lam)
}
