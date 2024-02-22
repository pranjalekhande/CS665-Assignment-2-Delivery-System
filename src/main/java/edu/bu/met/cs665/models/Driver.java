
/**
 * Name: Pranjal Prasanna Ekhande
 * Course: CS-665 Software Designs & Patterns
 * Date: 02/19/2023
 * File Name: Driver.java
 * Description: Driver class acts as concrete Observer. Driver consists of a single vehicle.
 */
package edu.bu.met.cs665.models;

import java.util.Objects;

public class Driver implements Observer {

    private Vehicle vehicle;
    private DeliveryRequest deliveryRequest;

    public Driver(Vehicle vehicle) {
        this.setVehicle(vehicle);
    }

    /**
     * Updates driver with delivery request.
     * @param deliveryRequest sets delivery request to driver.
     */
    @Override
    public void update(DeliveryRequest deliveryRequest) {
        this.deliveryRequest = deliveryRequest;
    }

    public String getDeliveryRequest() {
        return deliveryRequest.toString();
    }

    public Vehicle getVehicle() {
        return vehicle;
    }

    public void setVehicle(Vehicle vehicle) {
        this.vehicle = vehicle;
    }

    @Override
    public int hashCode() {
        return Objects.hash(vehicle);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Driver other = (Driver) obj;
        return Objects.equals(vehicle, other.vehicle);
    }

    @Override
    public String toString() {
        return "Driver [vehicle=" + vehicle + "]";
    }

}
