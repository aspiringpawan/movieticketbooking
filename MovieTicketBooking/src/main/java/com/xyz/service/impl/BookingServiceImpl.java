package com.xyz.service.impl;

import com.xyz.dto.BookingDTO;
import com.xyz.entity.Booking;
import com.xyz.exception.ResourceNotFoundException;
import com.xyz.mapper.BookingMapper;
import com.xyz.repository.BookingRepository;
import com.xyz.service.BookingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookingServiceImpl implements BookingService {


    @Autowired
    private BookingRepository bookingRepository;

    /**
     * @param bookingDTO
     */
    @Override
    public void createBooking(BookingDTO bookingDTO) {

        Booking booking = BookingMapper.mapToBooking(bookingDTO);
        bookingRepository.save(booking);

    }

    /**
     * @return
     */
    @Override
    public List<BookingDTO> getAllBookings() {
        List<BookingDTO> bookingDTOList = bookingRepository.findAll().stream().map(BookingMapper::mapToBookingDTO).toList();
        return bookingDTOList;
    }

    /**
     * @param id
     * @return
     */
    @Override
    public BookingDTO getBookingById(Long id) {
        return BookingMapper.mapToBookingDTO(bookingRepository.findById(id).get());
    }
}
