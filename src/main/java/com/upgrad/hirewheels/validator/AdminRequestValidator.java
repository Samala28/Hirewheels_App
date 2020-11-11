package com.upgrad.hirewheels.validator;

import com.upgrad.hirewheels.dto.VehicleDTO;
import com.upgrad.hirewheels.exceptions.APIException;

public interface AdminRequestValidator {

   public void validateVehicle(VehicleDTO vehicleDTO)throws APIException;
   public boolean validateChangeVehicleAvailablity(int availability_status);
   public boolean validateVehicleDeletion(int vehicleId)throws APIException;
}
