/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.knotspot.model;

/**
 *
 * @author eerii
 */
public class VenueManagement {
    
    private int venueId;
    private String venueName;
    private String address;
    private int contactNumber;
    private int capacity;
    private String city;
    private String venueType;
    private String operatingHour;
    private String venueDescription;
    private String facility;
    private int rentFee;
    private String paymentOption;
    
    public VenueManagement(){}

    public VenueManagement(int venueId, String venueName, String address, int contactNumber, int capacity, String city, String venueType, String operatingHour, String venueDescription, String facility, int rentFee, String paymentOption) {
        this.venueId = venueId;
        this.venueName = venueName;
        this.address = address;
        this.contactNumber = contactNumber;
        this.capacity = capacity;
        this.city = city;
        this.venueType = venueType;
        this.operatingHour = operatingHour;
        this.venueDescription = venueDescription;
        this.facility = facility;
        this.rentFee = rentFee;
        this.paymentOption = paymentOption;
    }

    public int getVenueId() {
        return venueId;
    }

    public void setVenueId(int venueId) {
        this.venueId = venueId;
    }

    public String getVenueName() {
        return venueName;
    }

    public void setVenueName(String venueName) {
        this.venueName = venueName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getContactNumber() {
        return contactNumber;
    }

    public void setContactNumber(int contactNumber) {
        this.contactNumber = contactNumber;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getVenueType() {
        return venueType;
    }

    public void setVenueType(String venueType) {
        this.venueType = venueType;
    }

    public String getOperatingHour() {
        return operatingHour;
    }

    public void setOperatingHour(String operatingHour) {
        this.operatingHour = operatingHour;
    }

    public String getVenueDescription() {
        return venueDescription;
    }

    public void setVenueDescription(String venueDescription) {
        this.venueDescription = venueDescription;
    }

    public String getFacility() {
        return facility;
    }

    public void setFacility(String facility) {
        this.facility = facility;
    }

    public int getRentFee() {
        return rentFee;
    }

    public void setRentFee(int rentFee) {
        this.rentFee = rentFee;
    }

    public String getPaymentOption() {
        return paymentOption;
    }

    public void setPaymentOption(String paymentOption) {
        this.paymentOption = paymentOption;
    }
    
    
}
