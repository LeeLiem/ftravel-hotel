package com.hotel.f_travel_hotel.model;

<<<<<<< HEAD
public class Coupons {
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
public class Coupons {
    private int coupon_id;
    private String coupon_code;
    private long price_discount;
    @DateTimeFormat(pattern = "yyyy-MM-dd ' ' HH:mm:ss")
    private Date end_date;
    private int status;
>>>>>>> 36b1705 (Code duy lam)
}
