package com.upgrad.hirewheels.services;

import com.upgrad.hirewheels.dao.UsersDao;
import com.upgrad.hirewheels.dao.VehicleDao;
import com.upgrad.hirewheels.entities.Vehicle;
import com.upgrad.hirewheels.exceptions.VehicleNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class VehicleServiceImpl implements VehicleService{

    @Autowired
    Vehicle vehicle;

    @Autowired
    public VehicleDao vehicleDao;

    @Autowired
    public UsersDao usersDao;

    @Override
    public List<Vehicle> getAllVehicles(List<Vehicle> vehicleList) {
        return vehicleDao.findAll();
    }

    @Override
    public Vehicle getVehicleByUserID(Vehicle vehicle) {
        return (Vehicle) vehicleDao.findAll();
    }

    @Override
    public List<Vehicle> getAvailableVehicles(List<Vehicle> vehicle) {
        return vehicleDao.findAll();
    }

    @Override
    public Vehicle updateVehicleDetails(int vehicleId) {
        List<Vehicle> vehicleList = null;
        Vehicle savedVehicle = (Vehicle) getAvailableVehicles(vehicleList);
        return vehicleDao.save(savedVehicle);
    }

    @Override
    public boolean deleteVehicleDetails(int vehicleId) throws VehicleNotFoundException {
        vehicleDao.deleteById(vehicleId);
        return true;
    }

    @Override
    public List<Vehicle> fetchAllVehicles() {
        return null;
    }

}
