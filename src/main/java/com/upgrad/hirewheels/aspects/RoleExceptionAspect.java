package com.upgrad.hirewheels.aspects;

import com.upgrad.hirewheels.responses.CustomResponse;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import javax.management.relation.RoleNotFoundException;
import java.time.LocalDateTime;

@ControllerAdvice
public class RoleExceptionAspect {
    @ExceptionHandler(RoleNotFoundException.class)
    public ResponseEntity<CustomResponse> handleRoleNotFoundException(Exception e){
        CustomResponse response = new CustomResponse(LocalDateTime.MAX,e.getMessage(), HttpStatus.NOT_FOUND.value());
        return  new ResponseEntity<>(response, HttpStatus.NOT_FOUND);
    }
}
