package com.xyz.mapper;

import com.xyz.dto.SeatDTO;
import com.xyz.entity.Seat;

public class SeatMapper {
    public static Seat mapToSeat(SeatDTO seatDTO) {
        Seat seat = new Seat();
        seat.setSeatNumber(seatDTO.getSeatNumber());
        seat.setBooked(seatDTO.isBooked());
        seat.setScreen(ScreenMapper.mapToScreen(seatDTO.getScreen()));
        return seat;
    }

    public static SeatDTO mapToSeatDTO(Seat seat) {
        SeatDTO seatDTO = new SeatDTO();
        seatDTO.setBooked(seat.isBooked());
        seatDTO.setSeatNumber(seat.getSeatNumber());
        seatDTO.setScreen(ScreenMapper.mapToScreenDTO(seat.getScreen()));
        return seatDTO;
    }
}
