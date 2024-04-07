package com.xyz.dto;

import jakarta.persistence.Entity;
import lombok.*;

import java.time.LocalDateTime;
import java.time.LocalTime;
@Data
public class ShowDTO {

    private int showId;

    private MovieDTO movie;

    private ScreenDTO screen;

    private LocalDateTime showDate;

    private LocalTime startTime;

    private LocalTime endTime;

}
