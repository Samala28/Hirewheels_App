package com.upgrad.hirewheels.services;

import com.upgrad.hirewheels.dao.BookingDao;
import com.upgrad.hirewheels.entities.Booking;
import com.upgrad.hirewheels.responses.BookingHistoryResponse;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class BookingServiceImpl implements BookingService{

@Autowired
public BookingDao bookingDao;

@Autowired
public Booking booking;

    @Override
    public Booking addBooking(Booking booking) {
        return bookingDao.save(booking);
    }

    @Override
    public List<BookingHistoryResponse> bookingaHistory(int userId) {
        return null;
    }


}
