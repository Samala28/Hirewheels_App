package com.upgrad.hirewheels.validator;

import com.upgrad.hirewheels.dto.VehicleDTO;

public interface AdminRequestValidator {

   public void validateVehicle(VehicleDTO vehicleDTO);
public boolean validateChangeVehicleAvailablity(int availability_status);
}
