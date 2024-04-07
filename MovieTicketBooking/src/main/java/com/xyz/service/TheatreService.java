package com.xyz.service;

import com.xyz.dto.MovieDTO;
import com.xyz.dto.TheatreDTO;

import java.util.List;

public interface TheatreService {
    void add(TheatreDTO theatreDTO);

    List<TheatreDTO> getAllTheatres();

    TheatreDTO getTheatreByName(String name);
}
