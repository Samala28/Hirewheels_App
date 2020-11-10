package com.upgrad.hirewheels.validator;

import com.upgrad.hirewheels.dto.VehicleDTO;

public class AdminRequestValidatorImpl implements AdminRequestValidator{

    @Override
    public void validateVehicle(VehicleDTO vehicleDTO) {

    }

    @Override
    public boolean validateChangeVehicleAvailablity(int availability_Status) {
        if(availability_Status==0) {
            return false;
        }else{
            return true;
        }
    }
}
