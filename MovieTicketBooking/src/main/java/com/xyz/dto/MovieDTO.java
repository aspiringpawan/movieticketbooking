package com.xyz.dto;

import jakarta.persistence.Entity;
import lombok.*;

import java.time.LocalDate;
import java.time.LocalDateTime;

@Data
public class MovieDTO {

    private String title;

    private String description;

    private String audio;

    private int duration;

    private LocalDate releaseDate;

    private String genre;
}
