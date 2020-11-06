package com.upgrad.hirewheels.services;

import com.upgrad.hirewheels.entities.Users;
import com.upgrad.hirewheels.entities.Vehicle;

import java.util.List;

public interface VehicleService {

    public List<Vehicle> getAllVehicles();
    public List<Vehicle> getVehicleByUserID();
    public List<Vehicle> getAvailableVehicles();


}
