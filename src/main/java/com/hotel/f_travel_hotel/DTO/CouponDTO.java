package com.hotel.f_travel_hotel.DTO;

import java.security.SecureRandom;
import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

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
public class CouponDTO {
    private int coupon_id;
    private String coupon_code;
    private long price_discount;
    @DateTimeFormat(pattern = "yyyy-MM-dd ' ' HH:mm:ss")
    private Date end_date;
    private int status;
    private static final String CHARACTERS = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";
    private static final SecureRandom RANDOM = new SecureRandom();
    public String generateCouponCode() {
        
        StringBuilder confirmationCode = new StringBuilder(6);
        for (int i = 0; i < 6; i++) {
            int index = RANDOM.nextInt(CHARACTERS.length());
            confirmationCode.append(CHARACTERS.charAt(index));
        }
        return confirmationCode.toString();
    }
}
