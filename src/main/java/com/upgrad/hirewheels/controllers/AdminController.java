package com.upgrad.hirewheels.controllers;

import com.upgrad.hirewheels.dto.VehicleDTO;
import com.upgrad.hirewheels.entities.Vehicle;
import com.upgrad.hirewheels.exceptions.APIException;
import com.upgrad.hirewheels.services.AdminService;
import com.upgrad.hirewheels.services.VehicleService;
import com.upgrad.hirewheels.utils.DTOEntityConverter;
import com.upgrad.hirewheels.utils.EntityDTOConverter;
import com.upgrad.hirewheels.validator.AdminRequestValidator;
import org.modelmapper.ModelMapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.text.ParseException;

@RestController
@RequestMapping(value="/hirewheels/v1")
public class AdminController {

    @Autowired
    VehicleService vehicleService;

    @Autowired
    VehicleDTO vehicleDTO;

    @Autowired
    AdminService adminService;

    @Autowired
    AdminRequestValidator adminRequestValidator;

    @Autowired
    ModelMapper modelmapper;

    @Autowired
    EntityDTOConverter entityDTOConverter;

    @Autowired
    DTOEntityConverter dtoEntityConverter;

    private static final Logger logger = LoggerFactory.getLogger(AdminController.class);


    @PostMapping(value="/vehicles",consumes= MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity addVehicle (@RequestBody VehicleDTO vehicleDTO) throws APIException{
        ResponseEntity responseEntity = null;
        try {
            adminRequestValidator.validateVehicle(vehicleDTO);
            Vehicle newVehicle = modelmapper.map(vehicleDTO, Vehicle.class);
            Vehicle savedVehicle = vehicleService.getAllVehicles(newVehicle);
            VehicleDTO savedVehicleDto = modelmapper.map(savedVehicle, VehicleDTO.class);
            responseEntity = new ResponseEntity<>(savedVehicleDto, HttpStatus.CREATED);
            logger.debug("Add a New Vehicle",responseEntity);
        }catch (ParseException e){
            e.printStackTrace();
            logger.error("Exception:" , e);
        }
        return responseEntity;
    }

        @PutMapping(value = "/vehicles/{vehicleid}",consumes= MediaType.APPLICATION_JSON_VALUE,produces = MediaType.APPLICATION_JSON_VALUE)
        public ResponseEntity changeVehicleAvailability(@RequestBody VehicleDTO vehicleDTO ,@PathVariable int vehicleid)throws APIException {
            logger.debug("Chage vehicle availability Status: Vehicle Id :" + vehicleid, vehicleDTO);
        ResponseEntity responseEntity = null;
        int availability_status = vehicleDTO.getAvailabilityStaus();
            adminRequestValidator.validateChangeVehicleAvailablity( availability_status);
            Vehicle newVehicle = modelmapper.map(vehicleDTO,Vehicle.class);
            Vehicle updatedVehicle =  vehicleService.updateVehicleDetails(vehicleid);
            VehicleDTO updatedVehicleDTO = modelmapper.map(updatedVehicle, VehicleDTO.class);
            return new ResponseEntity<>(updatedVehicleDTO, HttpStatus.OK);
        }




}

