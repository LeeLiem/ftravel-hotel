package com.hotel.f_travel_hotel.model;

<<<<<<< HEAD
public class BookingServiceDetail {
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
public class BookingServiceDetail {
    private int booking_service_id;
    private Bookings bookings;
    private Service service;
    @DateTimeFormat(pattern = "yyyy-MM-dd ' ' HH:mm:ss")
    private Date date_booking;
>>>>>>> 36b1705 (Code duy lam)
}
