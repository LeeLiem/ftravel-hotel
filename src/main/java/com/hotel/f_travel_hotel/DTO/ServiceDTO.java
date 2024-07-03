package com.hotel.f_travel_hotel.DTO;

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
public class ServiceDTO {
    private int service_id;
    private String service_name;
    private String [] description;
    private long price;
    private String service_type;
}
