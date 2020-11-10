package com.upgrad.hirewheels.dto;

import java.time.LocalDateTime;

public class BookingDTO {

    private int bookingId;
    private LocalDateTime pickupDate;
    private LocalDateTime dropoffDate;
    private LocalDateTime bookingDate;
    private float amount;
    private int locationId;
    private int vehicleId;
    private int userId;

    public int getBookingId() {
        return bookingId;
    }

    public void setBookingId(int bookingId) {
        this.bookingId = bookingId;
    }

    public LocalDateTime getPickupDate() {
        return pickupDate;
    }

    public void setPickupDate(LocalDateTime pickupDate) {
        this.pickupDate = pickupDate;
    }

    public LocalDateTime getDropoffDate() {
        return dropoffDate;
    }

    public void setDropoffDate(LocalDateTime dropoffDate) {
        this.dropoffDate = dropoffDate;
    }

    public LocalDateTime getBookingDate() {
        return bookingDate;
    }

    public void setBookingDate(LocalDateTime bookingDate) {
        this.bookingDate = bookingDate;
    }

    public float getAmount() {
        return amount;
    }

    public void setAmount(float amount) {
        this.amount = amount;
    }

    public int getLocationId() {
        return locationId;
    }

    public void setLocationId(int locationId) {
        this.locationId = locationId;
    }

    public int getVehicleId() {
        return vehicleId;
    }

    public void setVehicleId(int vehicleId) {
        this.vehicleId = vehicleId;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }
}
