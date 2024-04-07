package com.xyz.controller;

import com.xyz.dto.BookingDTO;
import com.xyz.service.BookingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


import java.util.List;

@RestController
@RequestMapping (path = "/bookings", produces = {MediaType.APPLICATION_JSON_VALUE})
public class BookingController {

    @Autowired
    private BookingService bookingService;

    @PostMapping(path = "/create")
    public ResponseEntity createBooking(@RequestBody BookingDTO bookingDTO) {
        bookingService.createBooking(bookingDTO);
        return ResponseEntity.status(HttpStatus.CREATED).build();
    }

    @GetMapping
    public List<BookingDTO> getAllBookings() {
        return bookingService.getAllBookings();
    }

    @GetMapping("/{id}")
    public BookingDTO getBookingById(@PathVariable Long id) {
        return bookingService.getBookingById(id);
    }
}
