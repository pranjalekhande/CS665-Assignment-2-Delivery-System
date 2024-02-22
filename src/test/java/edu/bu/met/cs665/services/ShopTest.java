/**
 * Name: Pranjal Prasanna Ekhande
 * Course: CS-665 Software Designs & Patterns
 * Date: 02/19/2023
 * File Name: ShopTest.java
 * Description: This is a test class for the Shop class.
 * This class is reponsible for:
 * - testing registering and unregistering observers
 * - testing creating a delivery request from Observable
 * - testing ability to notify all observers at once
 */

package edu.bu.met.cs665.services;

import static org.junit.Assert.*;

import edu.bu.met.cs665.models.*;
import org.junit.Before;
import org.junit.Test;

import edu.bu.met.cs665.models.Car;

public class ShopTest {

    private Shop shop;

    private Driver driver1;
    private Driver driver2;
    private Driver driver3;
    private Driver driver4;
    private Driver driver5;

    private Vehicle scooter;
    private Vehicle car;
    private Vehicle taxi;

    @Before
    public void setUp() throws Exception {
        shop = new Shop();

        scooter = new Scooter();
        car = new Car();
        taxi = new Taxi();

        driver1 = new Driver(scooter);
        driver2 = new Driver(car);
        driver3 = new Driver(taxi);
        driver4 = new Driver(scooter);
        driver5 = new Driver(car);
    }

    /**
     * Tests all methods from Observable at once.
     */
    @Test
    public void testAllMethods_Success() {
        // Test delivery request.
        DeliveryRequest expectedDeliveryRequest = new DeliveryRequest("Bicycle", "New Jersey");

        // Register 5 Driver objects to Observable .
        shop.registerObserver(driver1);
        shop.registerObserver(driver2);
        shop.registerObserver(driver3);
        shop.registerObserver(driver4);
        shop.registerObserver(driver5);

        // Create a new delivery request and notify all drivers.
        shop.createDeliveryRequest("Bicycle", "New Jersey");
        shop.notifyObservers();

        // Unregister 3 Driver objects.
        shop.unregisterObserver(driver1);
        shop.unregisterObserver(driver2);
        shop.unregisterObserver(driver5);

        // Create a new delivery request and notify remaining registered drivers.
        shop.createDeliveryRequest("Unicycle", "New York");
        shop.notifyObservers();

        // Drivers 1, 2, and 3 became unregistered from the Observable after
        // first delivery request so they were not notified of most recent delivery request.
        assertEquals(expectedDeliveryRequest.toString(), driver1.getDeliveryRequest());
        assertEquals(expectedDeliveryRequest.toString(), driver2.getDeliveryRequest());
        assertEquals(expectedDeliveryRequest.toString(), driver5.getDeliveryRequest());
        // Drivers 4, 5 remained registered, newest request does not match the expected request.
        assertNotEquals(expectedDeliveryRequest.toString(), driver3.getDeliveryRequest());
        assertNotEquals(expectedDeliveryRequest.toString(), driver4.getDeliveryRequest());
    }

}
