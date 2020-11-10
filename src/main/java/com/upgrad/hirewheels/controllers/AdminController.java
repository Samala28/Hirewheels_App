package com.upgrad.hirewheels.controllers;

import com.upgrad.hirewheels.dto.VehicleDTO;
import com.upgrad.hirewheels.entities.Vehicle;
import com.upgrad.hirewheels.services.AdminService;
import com.upgrad.hirewheels.services.VehicleService;
import com.upgrad.hirewheels.utils.DTOEntityConverter;
import com.upgrad.hirewheels.utils.EntityDTOConverter;
import com.upgrad.hirewheels.validator.AdminRequestValidator;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

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

    @PostMapping(value="/vehicles")
    public ResponseEntity addVehicle (@RequestBody VehicleDTO vehicleDTO) {
        ResponseEntity responseEntity = null;
        adminRequestValidator.validateVehicle(vehicleDTO);
        Vehicle newVehicle = modelmapper.map(vehicleDTO, Vehicle.class);
        Vehicle savedVehicle = vehicleService.getAllVehicles(newVehicle);
        VehicleDTO savedVehicleDto = modelmapper.map(savedVehicle, VehicleDTO.class);
        responseEntity = new ResponseEntity<>(savedVehicleDto, HttpStatus.CREATED);

        return responseEntity;
    }

        @PutMapping("/vehicles/{vehicleid}")
        public ResponseEntity changeVehicleAvailability(@RequestBody VehicleDTO vehicleDTO ,@PathVariable int vehicleid){
        ResponseEntity responseEntity = null;
        int availability_status = vehicleDTO.getAvailabilityStaus();
            adminRequestValidator.validateChangeVehicleAvailablity( availability_status);
            Vehicle newVehicle = modelmapper.map(vehicleDTO,Vehicle.class);
            Vehicle updatedVehicle =  vehicleService.updateVehicleDetails(vehicleid);
            VehicleDTO updatedVehicleDTO = modelmapper.map(updatedVehicle, VehicleDTO.class);
            return new ResponseEntity<>(updatedVehicleDTO, HttpStatus.OK);
        }


}

