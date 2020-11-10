package com.upgrad.hirewheels.utils;

import com.upgrad.hirewheels.services.BookingService;
import com.upgrad.hirewheels.services.VehicleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class DTOEntityConverter {
    @Autowired
    VehicleService vehicleService;

    @Autowired
    BookingService bookingService;
}
