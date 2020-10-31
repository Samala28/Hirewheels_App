package com.upgrad.hirewheels.entities;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
public class Booking {
    @Id
    @GeneratedValue
    private int bookingId;
    @Column(nullable = false)
    private LocalDateTime pickupDate;
    @Column(nullable = false)
    private LocalDateTime dropoffDate;
    @Column(nullable = false)
    private LocalDateTime bookingDate;
    @Column(nullable = false)
    private float amount;


    @JoinColumn(name = "location_id", nullable = false)
    private Location location;


    @JoinColumn(name = "vehicle_id", nullable = false)
    private Vehicle vehicle;


    @JoinColumn(name = "user_id", nullable = false)
    private Users users;

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

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    public Vehicle getVehicle() {
        return vehicle;
    }

    public void setVehicle(Vehicle vehicle) {
        this.vehicle = vehicle;
    }

    public Users getUsers() {
        return users;
    }

    public void setUsers(Users users) {
        this.users = users;
    }

    @Override
    public String toString() {
        return "Booking{" +
                "bookingId = " + bookingId +
                ", pickupDate = " + pickupDate +
                ", dropoffDate = " + dropoffDate +
                ", bookingDate = " + bookingDate +
                ", amount = " + amount +
                ", location = " + location +
                ". vehicle = " + vehicle +
                ", users = " + users +
                '}';

    }
}