package com.upgrad.hirewheels.services;

import com.upgrad.hirewheels.dao.VehicleDao;
import com.upgrad.hirewheels.entities.Users;
import com.upgrad.hirewheels.entities.Vehicle;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.springframework.boot.test.context.SpringBootTest;

import java.security.PublicKey;
import java.util.Collections;
import java.util.List;
import java.util.Optional;

@SpringBootTest
public class VehicleServiceTest {

    @Mock
    private VehicleDao vehicleDao;

    @InjectMocks
    private VehicleService vehicleService;

    @BeforeEach
    public void setupMockito() {
        Mockito.when(vehicleDao.save(new Vehicle("save_test"))).thenReturn(new Vehicle(1, "save test"));

        Mockito.when(vehicleDao.findById(1)).thenReturn(Optional.of(new Vehicle(1, "save test")));
        Mockito.when(vehicleDao.save(new Vehicle(1, "update test"))).thenReturn(new Vehicle(1, "update test"));

        Mockito.when(vehicleDao.save(new Vehicle("get test"))).thenReturn(new Vehicle(1, "get test"));
        Mockito.when(vehicleDao.findByVehicleModel("get test")).thenReturn(new Vehicle(1, "get test"));
    }

    @Test
    public void testGetVehicleByUserID(){
        Vehicle vehicle = new Vehicle();
        vehicle.setVehicleModel("save test");
        Vehicle getVehicle = vehicleService.getVehicleByUserID(vehicle);
        Assertions.assertNotNull(getVehicle);
        Assertions.assertTrue(getVehicle.getVehicleId() != 0);
        Assertions.assertEquals("save test", getVehicle.getVehicleModel());
    }


    @Test
    public void testGetAllVehicles(){
        Vehicle vehicle = new Vehicle();
        vehicle.setVehicleId(1);
        Vehicle getAllVehicles =  vehicleService.getAllVehicles(vehicle);
        Assertions.assertNotNull(getAllVehicles);
        Assertions.assertTrue(getAllVehicles.getVehicleId() != 0);
        Assertions.assertEquals(1, getAllVehicles.getVehicleId());
    }

    @Test
    public void testGetAvailableVehicles(){
        Vehicle vehicle = new Vehicle();
        vehicle.setVehicleModel("save test");
        Vehicle getAvailableVehicle =  vehicleService.getAvailableVehicles(vehicle);
        Assertions.assertNotNull(getAvailableVehicle);
        Assertions.assertTrue(getAvailableVehicle.getVehicleId() != 0);
        Assertions.assertEquals("save test", getAvailableVehicle.getVehicleModel());
    }
}
