package com.xyz.service;

import com.xyz.dto.BookingDTO;

import java.util.List;

public interface BookingService {
    void createBooking(BookingDTO bookingDTO);

    List<BookingDTO> getAllBookings();

    BookingDTO getBookingById(Long id);
}
