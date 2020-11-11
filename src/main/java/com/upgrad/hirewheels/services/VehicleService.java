package com.upgrad.hirewheels.services;

import com.upgrad.hirewheels.entities.Vehicle;
import com.upgrad.hirewheels.exceptions.VehicleNotFoundException;

import java.util.List;

public interface VehicleService {

    public List<Vehicle> getAllVehicles(List<Vehicle> vehicleList);
    public Vehicle getVehicleByUserID(Vehicle vehicle);
    public List<Vehicle> getAvailableVehicles(List<Vehicle> vehicle);
   public Vehicle updateVehicleDetails(int vehicleId);
public boolean deleteVehicleDetails(int vehicleId) throws VehicleNotFoundException;

    public List<Vehicle> fetchAllVehicles();
}
