package com.upgrad.hirewheels.entities;

import javax.persistence.*;

@Entity
public class VehicleSubcategory {
@Id
@GeneratedValue
    private int vehicleSubcategoryId;
@Column(length = 50,nullable = false,unique = true)
    private String vehicleSubcategoryName;
@Column(nullable = false)
    private float pricePerDay;

@ManyToOne(fetch = FetchType.EAGER,cascade = CascadeType.ALL)
@JoinColumn(name = "vehicle_category_id",nullable = false)
    private VehicleCategory vehicleCategory;

    public String getVehicleSubcategoryName() {
        return vehicleSubcategoryName;
    }

    public void setVehicleSubcategoryName(String vehicleSubcategoryName) {
        this.vehicleSubcategoryName = vehicleSubcategoryName;
    }

    public float getPricePerDay() {
        return pricePerDay;
    }

    public void setPricePerDay(float pricePerDay) {
        this.pricePerDay = pricePerDay;
    }

    public VehicleCategory getVehicleCategory() {
        return vehicleCategory;
    }

    public void setVehicleCategory(VehicleCategory vehicleCategory) {
        this.vehicleCategory = vehicleCategory;
    }

    public int getVehicleSubcategoryId() {
        return vehicleSubcategoryId;
    }

    public void setVehicleSubcategoryId(int vehicleSubcategoryId) {
        this.vehicleSubcategoryId = vehicleSubcategoryId;
    }

    @Override
    public String toString(){
        return "VehicleSubcategory{"+
                ", vehicleSubcategoryId = "+vehicleSubcategoryId+
                ", vehicleSubcategoryName = "+vehicleSubcategoryName+
                ", pricePerDay = "+pricePerDay+
                ", vehicleCategory = "+vehicleCategory+
                '}';
    }

}
