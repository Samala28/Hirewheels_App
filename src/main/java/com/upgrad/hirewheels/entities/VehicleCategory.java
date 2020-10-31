package com.upgrad.hirewheels.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class VehicleCategory {
    @Id
    @GeneratedValue
    private int vehicleCategoryId;

    @Column(nullable = false,unique = true,length = 50)
    private String vehicleCategoryName;

    public int getVehicleCategoryId() {
        return vehicleCategoryId;
    }

    public void setVehicleCategoryId(int vehicleCategoryId) {
        this.vehicleCategoryId = vehicleCategoryId;
    }

    public String getVehicleCategoryName() {
        return vehicleCategoryName;
    }

    public void setVehicleCategoryName(String vehicleCategoryName) {
        this.vehicleCategoryName = vehicleCategoryName;
    }

    @Override
    public String toString(){
        return "VehicleCategory{"+
                ", vehicleCategoryId = "+vehicleCategoryId+
                ", vehicleCategoryName = "+vehicleCategoryName+
                '}';
    }
}
