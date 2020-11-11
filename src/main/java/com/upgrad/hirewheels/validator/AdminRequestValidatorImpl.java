package com.upgrad.hirewheels.validator;

import com.upgrad.hirewheels.dto.VehicleDTO;
import com.upgrad.hirewheels.entities.Vehicle;
import com.upgrad.hirewheels.exceptions.APIException;
import com.upgrad.hirewheels.services.VehicleService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class AdminRequestValidatorImpl implements AdminRequestValidator {


    @Autowired
    VehicleService vehicleService;

    @Override
    public void validateVehicle(VehicleDTO vehicleDTO)throws APIException {

    }

    @Override
    public boolean validateChangeVehicleAvailablity(int availability_Status) {
        if(availability_Status==0) {
            return false;
        }else{
            return true;
        }
    }

    @Override
    public boolean validateVehicleDeletion(int vehicleId)throws APIException{
        List<Vehicle> vehicleList = vehicleService.fetchAllVehicles();
        for(Vehicle vehicle: vehicleList) {
            if (vehicle.getVehicleId() == vehicleId) {
                return true;
            }

        } return true;
    }
}
