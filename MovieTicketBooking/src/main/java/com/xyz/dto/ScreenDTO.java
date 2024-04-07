package com.xyz.dto;

import lombok.Data;

import java.util.List;
@Data
public class ScreenDTO {

    private int screenId;

    private String name;

    private TheatreDTO theatre;

    private List<SeatDTO> listOfSeats;

}
