/**
 * Name: Pranjal Prasanna Ekhande
 * Course: CS-665 Software Designs & Patterns
 * Date: 02/19/2023
 * File Name: Vehicle.java
 * Description: Vehicle is an abstract class. Used as base for different Vehicle objects.
 */
package edu.bu.met.cs665.models;

public abstract class Vehicle {

    private String vehicleType;

    public Vehicle(String vehicleType) {
        this.vehicleType = vehicleType;
    }

    public String getVehicleType() {
        return vehicleType;
    }

    @Override
    public String toString() {
        return "Vehicle [vehicleType=" + vehicleType + "]";
    }

}
