package com.upgrad.hirewheels.aspects;

import com.upgrad.hirewheels.exceptions.VehicleSubcategoryDetailsNotFoundException;
import com.upgrad.hirewheels.responses.CustomResponse;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import java.time.LocalDateTime;

@ControllerAdvice
public class VehicleSubcategoryExceptionAspect {
    @ExceptionHandler(VehicleSubcategoryDetailsNotFoundException.class)
    public ResponseEntity<CustomResponse> handleVehicleSubcategoryDetailsNotFoundException(Exception e){
        CustomResponse response = new CustomResponse(LocalDateTime.MAX,e.getMessage(), HttpStatus.NOT_FOUND.value());
        return  new ResponseEntity<>(response, HttpStatus.NOT_FOUND);
    }
}
