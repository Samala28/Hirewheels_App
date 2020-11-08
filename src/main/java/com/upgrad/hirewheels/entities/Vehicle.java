package com.upgrad.hirewheels.entities;

import javax.persistence.*;

@Entity
public class Vehicle {
    @Id
    @GeneratedValue
    private int vehicleId;
    @Column(length = 50, nullable = false)
    private String vehicleModel;
    @Column(length = 10, nullable = false)
    private String vehicleNumber;
    @Column(length = 50, nullable = false)
    private String color;
    @Column(nullable = false)
    private int availabilityStaus;
    @Column(nullable = false, length = 500)
    private String vehicleImageUrl;

    @ManyToOne(fetch = FetchType.EAGER,cascade = CascadeType.ALL)
    @JoinColumn(name = "vehicle_subcategory_id",nullable = false)
    private VehicleSubcategory vehicleSubcategory;

    @ManyToOne(fetch = FetchType.EAGER,cascade = CascadeType.ALL)
    @JoinColumn(name="location_id",nullable = false)
    private Location location;

    @ManyToOne(fetch = FetchType.EAGER,cascade = CascadeType.ALL)
    @JoinColumn(name = "fuel_type_id",nullable = false)
    private FuelType fuelType;

    public Vehicle() {
    }

    public Vehicle(int vehicleId, String vehicleModel) {
        this.vehicleId = vehicleId;
        this.vehicleModel = vehicleModel;
    }

    public Vehicle(String vehicleModel) {
        this.vehicleModel = vehicleModel;
    }

    public int getVehicleId() {
        return vehicleId;
    }

    public void setVehicleId(int vehicleId) {
        this.vehicleId = vehicleId;
    }

    public String getVehicleModel() {
        return vehicleModel;
    }

    public void setVehicleModel(String vehicleModel) {
        this.vehicleModel = vehicleModel;
    }

    public String getVehicleNumber() {
        return vehicleNumber;
    }

    public void setVehicleNumber(String vehicleNumber) {
        this.vehicleNumber = vehicleNumber;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getAvailabilityStaus() {
        return availabilityStaus;
    }

    public void setAvailabilityStaus(int availabilityStaus) {
        this.availabilityStaus = availabilityStaus;
    }

    public String getVehicleImageUrl() {
        return vehicleImageUrl;
    }

    public void setVehicleImageUrl(String vehicleImageUrl) {
        this.vehicleImageUrl = vehicleImageUrl;
    }

    public VehicleSubcategory getVehicleSubcategory() {
        return vehicleSubcategory;
    }

    public void setVehicleSubcategory(VehicleSubcategory vehicleSubcategory) {
        this.vehicleSubcategory = vehicleSubcategory;
    }

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    public FuelType getFuelType() {
        return fuelType;
    }

    public void setFuelType(FuelType fuelType) {
        this.fuelType = fuelType;
    }

    @Override
    public String toString(){
        return "Vehicle{" +
                ", vehicleId = "+vehicleId+
                ", vehicleModel = "+vehicleModel+
                ", vehicleNumber = "+vehicleNumber+
                ", color = "+color+
                ", availabilityStaus = "+availabilityStaus+
                ", vehicleImageUrl = "+vehicleImageUrl+
                ", vehicleSubcategory = "+vehicleSubcategory+
                ", location = "+location+
                ", fuelType = "+fuelType+
                '}';
    }
}