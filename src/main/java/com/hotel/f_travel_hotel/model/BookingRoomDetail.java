package com.hotel.f_travel_hotel.model;

<<<<<<< HEAD
public class BookingRoomDetail {
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
public class BookingRoomDetail {
    private int booking_room_id;
    private Bookings bookings;
    private Room room;
    @DateTimeFormat(pattern = "yyyy-MM-dd ' ' HH:mm:ss")
    private Date date_booking;
>>>>>>> 36b1705 (Code duy lam)
}
