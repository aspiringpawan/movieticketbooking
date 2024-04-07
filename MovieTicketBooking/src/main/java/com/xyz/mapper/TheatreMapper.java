package com.xyz.mapper;

import com.xyz.dto.TheatreDTO;
import com.xyz.entity.Theatre;

public class TheatreMapper {

    public static Theatre mapToTheatre(TheatreDTO theatreDTO) {
        Theatre theatre = new Theatre();
        theatre.setAddress(theatreDTO.getAddress());
        theatre.setName(theatreDTO.getName());
        theatre.setTotalScreens(theatreDTO.getTotalScreens());
        theatre.setCity(CityMapper.mapToCity(theatreDTO.getCity()));
        return theatre;
    }

    public static TheatreDTO mapToTheatreDTO (Theatre theatre) {
        TheatreDTO theatreDTO = new TheatreDTO();
        theatreDTO.setAddress(theatre.getAddress());
        theatreDTO.setName(theatre.getName());
        theatreDTO.setTotalScreens(theatre.getTotalScreens());
        theatreDTO.setCity(CityMapper.mapToCityDTO(theatre.getCity()));
        return theatreDTO;
    }
}
