package com.upgrad.hirewheels.services;

import com.upgrad.hirewheels.dao.UsersDao;
import com.upgrad.hirewheels.dao.VehicleDao;
import com.upgrad.hirewheels.entities.Users;
import com.upgrad.hirewheels.entities.Vehicle;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class VehicleServiceImpl implements VehicleService{

    @Autowired
    public VehicleDao vehicleDao;

    @Autowired
    public UsersDao usersDao;

    @Override
    public List<Vehicle> getAllVehicles() {
        return vehicleDao.findAll();
    }

    @Override
    public List<Vehicle> getVehicleByUserID() {
        return vehicleDao.findAll();
    }

    @Override
    public List<Vehicle> getAvailableVehicles() {
        return vehicleDao.findAll();
    }

}
