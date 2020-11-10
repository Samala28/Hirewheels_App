package com.upgrad.hirewheels.services;

import com.upgrad.hirewheels.dao.UsersDao;
import com.upgrad.hirewheels.dao.VehicleDao;
import com.upgrad.hirewheels.entities.Vehicle;
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
    public List<Vehicle> getAllVehicles() {
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
        List<Vehicle> id ;
        Vehicle savedVehicle = getAvailableVehicles(id);
        return vehicleDao.save(savedVehicle);
    }

}
