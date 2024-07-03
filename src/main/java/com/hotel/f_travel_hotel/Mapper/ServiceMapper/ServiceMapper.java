package com.hotel.f_travel_hotel.Mapper.ServiceMapper;


import com.hotel.f_travel_hotel.DTO.ServiceDTO;

import com.hotel.f_travel_hotel.model.Service;

public class ServiceMapper {
    public ServiceDTO transferFromService(Service service) {
        
        String [] description = service.getDescription().split(",");
        ServiceDTO ServiceDTO = new ServiceDTO(service.getService_id(),
                service.getService_name(),
                description,
                service.getPrice(),
                
                service.getService_type());
        return ServiceDTO;
    }
    public Service transferFromSerivceDTO(ServiceDTO ServiceDTO) {
        String description = String.join(",", ServiceDTO.getDescription());
        Service service = new Service(ServiceDTO.getService_id(),
        ServiceDTO.getService_name(),
                description,
                ServiceDTO.getPrice(),
                ServiceDTO.getService_type());
        return service;
    }
}

