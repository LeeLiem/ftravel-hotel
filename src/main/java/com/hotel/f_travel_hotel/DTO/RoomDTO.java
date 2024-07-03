package com.hotel.f_travel_hotel.DTO;

import com.hotel.f_travel_hotel.model.Hotel;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
@Data
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class RoomDTO {
    private int rooms_DTO_id;
    private long price;
    private String []description;
    private int capacity;
    private int size;
    private int available;
    private String room_type;
    private Hotel hotel_DTO;
}
