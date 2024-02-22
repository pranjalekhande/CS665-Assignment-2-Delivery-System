/**
 * Name: Pranjal Prasanna Ekhande
 * Course: CS-665 Software Designs & Patterns
 * Date: 02/19/2023
 * File Name: Shop.java
 * Description: Shop acts a concrete Observable. Consists of list of observers (drivers).
 */
package edu.bu.met.cs665.services;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import edu.bu.met.cs665.models.DeliveryRequest;
import edu.bu.met.cs665.models.Observer;

public class Shop implements Observables {

    private List<Observer> drivers;
    private DeliveryRequest deliveryRequest;

    /**
     * Instantiates empty list of drivers upon creation.
     */
    public Shop() {
        super();
        this.drivers = new ArrayList<Observer>();
    }

    public DeliveryRequest getDeliveryRequest() {
        return deliveryRequest;
    }

    /**
     * Registers an observer by adding driver to list of observers.
     * @param driver for shop will observe new delivery requests.
     */
    @Override
    public void registerObserver(Observer driver) {
        drivers.add(driver);
    }

    /**
     * Unregisters an observer by removing driver from list of observers.
     * @param driver for shop will no longer observe new delivery requests.
     */
    @Override
    public void unregisterObserver(Observer driver) {
        drivers.remove(driver);
    }

    /**
     * Notifies all drivers by iterating through list of observers and updating each with new delivery request.
     */
    @Override
    public void notifyObservers() {
        for (Iterator<Observer> observer = drivers.iterator(); observer.hasNext();) {
            Observer driver = observer.next();
            driver.update(this.deliveryRequest);
        }
    }

    /**
     * Creates a new delivery request that assigned to shop.
     * @param product for delivery request.
     * @param location for delivery request.
     */
    public void createDeliveryRequest(String product, String location) {
        this.deliveryRequest = new DeliveryRequest(product, location);
    }

}
