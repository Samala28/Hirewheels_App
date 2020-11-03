package com.upgrad.hirewheels.entities;

import javax.persistence.*;

@Entity
public class Location {
@Id
    @GeneratedValue
    private int locationId;
@Column(length = 50,nullable = false)
    private String locationName;
@Column(length = 100,nullable = false)
    private String address;
@Column(length = 6,nullable = false)
    private String pincode;

@ManyToOne(fetch = FetchType.EAGER,cascade = CascadeType.ALL)
@JoinColumn(name="city_id",nullable = false)
    private City city;

    public int getLocationId() {
        return locationId;
    }

    public void setLocationId(int locationId) {
        this.locationId = locationId;
    }

    public String getLocationNmae() {
        return locationName;
    }

    public void setLocationNmae(String locationNmae) {
        this.locationName = locationName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPincode() {
        return pincode;
    }

    public void setPincode(String pincode) {
        this.pincode = pincode;
    }

    public City getCity() {
        return city;
    }

    public void setCity(City city) {
        this.city = city;
    }

    @Override
    public String toString(){
        return "Location{"+
                ", lcoationId = "+locationId+
                ", locatioName = "+locationName+
                ", address = "+address+
                ", pincode = "+pincode+
                ", city = "+city+
                '}';
    }
}
