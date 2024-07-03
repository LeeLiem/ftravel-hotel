package com.hotel.f_travel_hotel.DTO;

import java.security.SecureRandom;
import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

import com.hotel.f_travel_hotel.model.Coupons;
import com.hotel.f_travel_hotel.model.User;

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
public class BookingDTO {
    private int booking_id;
    @DateTimeFormat(pattern = "yyyy-MM-dd ' ' HH:mm:ss")
    private Date create_date;
    @DateTimeFormat(pattern = "yyyy-MM-dd ' ' HH:mm:ss")
    private Date check_in_date;
    @DateTimeFormat(pattern = "yyyy-MM-dd ' ' HH:mm:ss")
    private Date check_out_date;
    private String confirmation_code;
    private int number_of_adults;
    private int number_of_children;
    private long  room_total_price;
    private long service_total_price;
    private int status_payment;
    private User user;
    private Coupons coupons;
    private static final String CHARACTERS = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";
    private static final SecureRandom RANDOM = new SecureRandom();
    public String generateConfirmationCode() {
        
        StringBuilder confirmationCode = new StringBuilder(10);
        for (int i = 0; i < 10; i++) {
            int index = RANDOM.nextInt(CHARACTERS.length());
            confirmationCode.append(CHARACTERS.charAt(index));
        }
        return confirmationCode.toString();
    }
}
