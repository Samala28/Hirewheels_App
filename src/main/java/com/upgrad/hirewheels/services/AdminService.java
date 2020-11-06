package com.upgrad.hirewheels.services;

import com.upgrad.hirewheels.entities.Vehicle;

public interface AdminService {

   public Vehicle registerVehicle(Vehicle vehicle);
    public boolean changeAvailability(int availabilityStaus);

}
