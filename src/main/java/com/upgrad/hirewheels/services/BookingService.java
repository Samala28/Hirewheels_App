package com.upgrad.hirewheels.services;

import com.upgrad.hirewheels.entities.Booking;
import com.upgrad.hirewheels.responses.BookingHistoryResponse;

import java.util.List;

public interface BookingService {

    public Booking addBooking(Booking booking);

   public List<BookingHistoryResponse> bookingaHistory(int userId);

}
