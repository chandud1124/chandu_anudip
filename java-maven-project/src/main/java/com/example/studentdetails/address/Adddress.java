package com.example.studentdetails.address;

import jakarta.persistence.Embeddable;

@Embeddable
public class Adddress {
    private int doorNumber;
    private String street;
    private String city;
    private int pincode;

    public Adddress(int doorNumber, String street, String city, int pincode) {
        super();
        this.doorNumber = doorNumber;
        this.street = street;
        this.city = city;
        this.pincode = pincode;
    }

    public Adddress() {
        super();
    }

    public int getDoorNumber() {
        return doorNumber;
    }

    public String getStreet() {
        return street;
    }

    public String getCity() {
        return city;
    }

    public int getPincode() {
        return pincode;
    }
}
