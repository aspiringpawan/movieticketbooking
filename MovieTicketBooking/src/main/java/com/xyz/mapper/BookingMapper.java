package com.xyz.mapper;

import com.xyz.dto.BookingDTO;
import com.xyz.entity.Booking;

public class BookingMapper {

    public static Booking mapToBooking(BookingDTO bookingDTO) {
        Booking booking = new Booking();
        booking.setShow(ShowMapper.mapToShow(bookingDTO.getShow()));
        return booking;

    }

    public static BookingDTO mapToBookingDTO(Booking booking) {
        BookingDTO bookingDTO = new BookingDTO();
        bookingDTO.setShow(ShowMapper.mapToShowDTO(booking.getShow()));
        bookingDTO.setAmount(booking.getAmount());
        bookingDTO.setUser(UserMapper.mapToUserDTO(booking.getUser()));
        return bookingDTO;
    }
}
