package com.hotel.f_travel_hotel.model;

<<<<<<< HEAD
public class Room {
=======
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Room {
    private int room_id;
    private long price;
    private String description;
    private int capacity;
    private int size;
    private int available;
    private String room_type;
    private Hotel hotel;
>>>>>>> 36b1705 (Code duy lam)
}
