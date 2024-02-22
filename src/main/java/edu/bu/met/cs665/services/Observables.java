/**
 * Name: Pranjal Prasanna Ekhande
 * Course: CS-665 Software Designs & Patterns
 * Date: 02/19/2023
 * File Name: Observables.java
 * Description: Observables is an Interface class.
 */


package edu.bu.met.cs665.services;

import edu.bu.met.cs665.models.Observer;
public interface Observables {
    public void registerObserver(Observer observer);
    public void unregisterObserver(Observer observer);
    //	public void notifyObservers(DeliveryRequest deliveryRequest);
    void notifyObservers();
}
