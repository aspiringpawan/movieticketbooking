package com.xyz.dto;


import lombok.Data;

@Data
public class TheatreDTO {

    private int theatreId;

    private String name;

    private CityDTO city;

    private String address;

    private int totalScreens;
}
