package com.upgrad.hirewheels.validator;

import com.upgrad.hirewheels.dto.BookingDTO;

public interface BookingValidator {
   public void validateBooking(BookingDTO bookingDTO);

  public void validateBookingHistory(int userId);
}
