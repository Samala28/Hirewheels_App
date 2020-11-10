package com.upgrad.hirewheels.controllers;

import com.upgrad.hirewheels.dto.BookingDTO;
import com.upgrad.hirewheels.entities.Booking;
import com.upgrad.hirewheels.services.BookingService;
import com.upgrad.hirewheels.validator.BookingValidator;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.text.ParseException;

@RestController
@RequestMapping(value="/hirewheels/v1")
public class BookingController {

    @Autowired
    BookingService bookingService;

    @Autowired
    BookingValidator bookingValidator;

    @Autowired
    BookingDTO bookingDTO;

    private static final Logger logger = LoggerFactory.getLogger(BookingController.class);


    @PostMapping("/bookings")
    public ResponseEntity addBooking(@RequestBody BookingDTO bookingDTO){
        ResponseEntity responseEntity = null;
        try{
            bookingValidator.validateBooking(bookingDTO);
            Booking responseBooking = bookingService.addBooking(bookingDTO);
            responseEntity = ResponseEntity.ok(responseBooking);
        }catch (ParseException | GlobalExceptionhandler e){
            logger.error(e.getMessage());
        }
        return responseEntity;
    }


}
