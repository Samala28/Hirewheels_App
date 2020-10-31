package com.upgrad.hirewheels.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class FuelType {
    @Id
    @GeneratedValue
    private int fuelTypeId;
    @Column(length = 50,nullable = false,unique = true)
    private String fuelType;

    public int getFuelTypeId() {
        return fuelTypeId;
    }

    public void setFuelTypeId(int fuelTypeId) {
        this.fuelTypeId = fuelTypeId;
    }

    public String getFuelType() {
        return fuelType;
    }

    public void setFuelType(String fuelType) {
        this.fuelType = fuelType;
    }
    @Override
    public String toString(){
        return "FuelType{"+
                ", fuelTypeId = "+fuelTypeId+
                ",fuelType = "+fuelType+
                '}';
    }
}
