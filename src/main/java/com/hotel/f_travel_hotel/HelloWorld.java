package com.hotel.f_travel_hotel;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorld {
    @GetMapping("/hello")
    public String Hello() {
        return "Hello The Gioi ";
    }
}
