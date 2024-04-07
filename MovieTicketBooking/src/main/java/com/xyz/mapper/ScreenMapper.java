package com.xyz.mapper;

import com.xyz.dto.ScreenDTO;
import com.xyz.dto.SeatDTO;
import com.xyz.entity.Screen;
import com.xyz.entity.Seat;

import java.util.List;

public class ScreenMapper {

    public static Screen mapToScreen(ScreenDTO screenDTO) {
        Screen screen = new Screen();
        screen.setName(screenDTO.getName());
        screen.setTheatre(TheatreMapper.mapToTheatre(screenDTO.getTheatre()));
        List<Seat> seatList = screenDTO.getListOfSeats().stream().map(SeatMapper::mapToSeat).toList();
        screen.setListOfSeats(seatList);
    }

    public static ScreenDTO mapToScreenDTO(Screen screen) {
        ScreenDTO screenDTO = new ScreenDTO();
        screenDTO.setName(screen.getName());
        screenDTO.setTheatre(TheatreMapper.mapToTheatreDTO(screen.getTheatre()));
        List<SeatDTO> seatDTOList = screen.getListOfSeats().stream().map(SeatMapper::mapToSeatDTO).toList();
        screenDTO.setListOfSeats(seatDTOList);
        return screenDTO;
    }
}
