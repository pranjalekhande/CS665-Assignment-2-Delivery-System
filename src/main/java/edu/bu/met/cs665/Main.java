/**
 * Name: Pranjal Prasanna Ekhande
 * Course: CS-665 Software Designs & Patterns
 * Date: 02/19/2023
 * File Name: Main.java
 * Description: Main class for running application.
 */

package edu.bu.met.cs665;

import edu.bu.met.cs665.example1.Person;
import edu.bu.met.cs665.models.Scooter;
import edu.bu.met.cs665.models.Taxi;
import edu.bu.met.cs665.models.Vehicle;
import edu.bu.met.cs665.models.Car;
import edu.bu.met.cs665.models.Driver;
import edu.bu.met.cs665.services.Shop;


/**
 * This is the Main class.
 */
public class Main {

  /**
   * A main method to run examples.
   * You may use this method for development purposes as you start building your
   * assignments/final project.  This could prove convenient to test as you are developing.
   * However, please note that every assignment/final projects requires JUnit tests.
   */
  public static void main(String[] args) {
    System.out.println("This is a test message from the Main class (Main.java file)");
    String product = "Grocery";
    String location = "Boston";

    Vehicle scooter = new Scooter();
    Vehicle van = new Car();
    Vehicle taxi = new Taxi();

    Driver driverMike = new Driver(scooter);
    Driver driverSteve = new Driver(van);
    Driver driverJoe = new Driver(taxi);
    Shop marketPlace = new Shop();

    // Testing main methods created for this project.
    marketPlace.createDeliveryRequest(product, location);
    marketPlace.registerObserver(driverJoe);
    marketPlace.registerObserver(driverSteve);
    marketPlace.registerObserver(driverMike);

    marketPlace.notifyObservers();

    System.out.println("Driver Mike: ");
    System.out.println(driverMike.toString());
    System.out.println(driverMike.getDeliveryRequest());
    System.out.println("Driver Steve: ");
    System.out.println(driverSteve.toString());
    System.out.println(driverSteve.getDeliveryRequest());
    System.out.println("Driver Joe: ");
    System.out.println(driverJoe.toString());
    System.out.println(driverJoe.getDeliveryRequest());
  }


}
