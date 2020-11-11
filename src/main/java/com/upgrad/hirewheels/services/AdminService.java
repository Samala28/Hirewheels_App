package com.upgrad.hirewheels.services;

import com.upgrad.hirewheels.entities.Vehicle;
import com.upgrad.hirewheels.exceptions.VehicleNotFoundException;

public interface AdminService {

   public Vehicle registerVehicle(Vehicle vehicle) throws VehicleNotFoundException;
    public boolean changeAvailability(int availabilityStaus);

}
