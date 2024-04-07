package com.xyz.dto;

import lombok.Data;

@Data
public class SeatDTO {

    private int seatId;
    private String seatNumber;
    private boolean isBooked;

    private ScreenDTO screen;
}
