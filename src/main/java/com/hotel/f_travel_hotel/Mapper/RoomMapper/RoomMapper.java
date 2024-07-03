package com.hotel.f_travel_hotel.Mapper.RoomMapper;

import com.hotel.f_travel_hotel.DTO.RoomDTO;
import com.hotel.f_travel_hotel.model.Room;

public class RoomMapper {
    public Room transferFromRoomDTO(RoomDTO roomDTO) {
        String description = String.join(",", roomDTO.getDescription());
        Room room = new Room(roomDTO.getRooms_DTO_id(),
                roomDTO.getPrice(),
                description,
                roomDTO.getCapacity(),
                roomDTO.getSize(),
                roomDTO.getAvailable(),
                description,
                roomDTO.getHotel_DTO());
        return room;
    }
    public RoomDTO transferFromRoom(Room room) {
        String [] description = room.getDescription().split(",");
        
        RoomDTO roomDTO = new RoomDTO(room.getRoom_id(),
        room.getPrice(),
                description,
                room.getCapacity(),
                room.getSize(),
                room.getAvailable(),
                room.getRoom_type(),
                room.getHotel());
                return roomDTO;
    }
}
