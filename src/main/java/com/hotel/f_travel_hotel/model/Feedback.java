package com.hotel.f_travel_hotel.model;

<<<<<<< HEAD
public class Feedback {
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
public class Feedback {
    private int feedback_id;
    private String content;
    private long rating_point;
    @DateTimeFormat(pattern = "yyyy-MM-dd ' ' HH:mm:ss")
    private Date date_post;
    private boolean status;
    private Room room;
    private User user;
>>>>>>> 36b1705 (Code duy lam)
}
