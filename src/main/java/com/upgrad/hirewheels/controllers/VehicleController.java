package com.upgrad.hirewheels.controllers;

import com.upgrad.hirewheels.entities.FuelType;
import com.upgrad.hirewheels.entities.Users;
import com.upgrad.hirewheels.entities.Vehicle;
import com.upgrad.hirewheels.exceptions.APIException;
import com.upgrad.hirewheels.exceptions.VehicleCategoryDetailsNotFoundException;
import com.upgrad.hirewheels.exceptions.VehicleNotFoundException;
import com.upgrad.hirewheels.exceptions.VehicleSubcategoryDetailsNotFoundException;
import com.upgrad.hirewheels.services.VehicleService;
import com.upgrad.hirewheels.utils.DTOEntityConverter;
import com.upgrad.hirewheels.utils.EntityDTOConverter;
import com.upgrad.hirewheels.validator.VehicleValidator;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
    @RequestMapping(value="/hirewheels/v1")
public class VehicleController {

@Autowired
    VehicleService vehicleService;


@Autowired
    FuelType fuelType;

@Autowired
Users users;

@Autowired
ModelMapper modelmapper;

    @Autowired
    Vehicle vehicle;

    @Autowired
    EntityDTOConverter entityDTOConverter;

    @Autowired
    DTOEntityConverter dtoEntityConverter;

    @Autowired
    VehicleValidator vehicleValidator;

    @GetMapping(value = "/vehicles",produces= MediaType.APPLICATION_JSON_VALUE,headers="Accept=application/json")
        public ResponseEntity getVehicles ()throws APIException, VehicleNotFoundException, VehicleCategoryDetailsNotFoundException, VehicleSubcategoryDetailsNotFoundException {
        List<Vehicle> vehicleId = null;
        List<Vehicle> vehicleList = vehicleService.getAllVehicles(vehicleId);
            return new ResponseEntity<>(vehicleList, HttpStatus.OK);
        }

    @GetMapping(value = "/hirewheels/v1/vehicles",produces= MediaType.APPLICATION_JSON_VALUE,headers="Accept=application/json")
    public ResponseEntity findAllAvailablevehicles() {
        List<Vehicle> vehicleList = vehicleService.getAvailableVehicles((List<Vehicle>) findAllAvailablevehicles());
        return new ResponseEntity<>(vehicleList, HttpStatus.OK);
    }

    }


