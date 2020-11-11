package com.upgrad.hirewheels.controllers;

import com.sun.org.apache.bcel.internal.generic.ARETURN;
import com.upgrad.hirewheels.dto.BookingDTO;
import com.upgrad.hirewheels.entities.Booking;
import com.upgrad.hirewheels.exceptions.APIException;
import com.upgrad.hirewheels.exceptions.BookingFailedException;
import com.upgrad.hirewheels.exceptions.UnauthorizedUserException;
import com.upgrad.hirewheels.exceptions.VehicleNotFoundException;
import com.upgrad.hirewheels.responses.BookingHistoryResponse;
import com.upgrad.hirewheels.services.BookingService;
import com.upgrad.hirewheels.validator.BookingValidator;
import org.hibernate.transform.CacheableResultTransformer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.annotation.ExceptionHandler;

import java.text.ParseException;
import java.util.List;

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


    @PostMapping(value="/bookings",consumes= MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity addBooking(@RequestBody BookingDTO bookingDTO)throws APIException,UnauthorizedUserException, VehicleNotFoundException, BookingFailedException {
        ResponseEntity responseEntity = null;
        try{
            bookingValidator.validateBooking(bookingDTO);
            Booking responseBooking = bookingService.addBooking(bookingDTO);
            responseEntity = ResponseEntity.ok(responseBooking);
        }catch (ParseException | APIException e){
            logger.error(e.getMessage());
        }
        return responseEntity;
    }
@GetMapping("/users/{userId}/bookings")
    public ResponseEntity bookingHistroy(@PathVariable("userId")int userId) throws APIException {
        ResponseEntity responseEntity = null;
    bookingValidator.validateBookingHistory(userId);
    List<BookingHistoryResponse> bookingList = bookingService.bookingaHistory(userId);
    responseEntity = ResponseEntity.ok(bookingList);
    return responseEntity;
    }

}
