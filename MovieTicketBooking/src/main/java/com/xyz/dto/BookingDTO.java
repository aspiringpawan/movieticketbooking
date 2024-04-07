package com.xyz.dto;


import lombok.Data;

import java.util.List;

@Data
public class BookingDTO {

    private UserDTO user;

    private ShowDTO show;

    private int amount;

    private List<SeatDTO> listOfSeats;

}
