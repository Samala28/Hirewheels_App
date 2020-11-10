package com.upgrad.hirewheels.utils;

import com.upgrad.hirewheels.services.AdminService;
import com.upgrad.hirewheels.services.VehicleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class EntityDTOConverter {

@Autowired
    VehicleService vehicleService;

@Autowired
    AdminService adminService;
}
