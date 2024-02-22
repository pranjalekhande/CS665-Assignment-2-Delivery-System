/**
 * Name: Pranjal Prasanna Ekhande
 * Course: CS-665 Software Designs & Patterns
 * Date: 02/19/2023
 * File Name: DeliveryRequest.java
 * Description: Delivery Request class.
 * A delivery requests is consisting of a product and location.
 */

package edu.bu.met.cs665.models;

import java.util.Objects;

public class DeliveryRequest {

    private String product;
    private String location;

    public DeliveryRequest(String product, String location) {
        super();
        this.product = product;
        this.location = location;
    }

    public String getProduct() {
        return product;
    }

    public void setProduct(String product) {
        this.product = product;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    @Override
    public int hashCode() {
        return Objects.hash(location, product);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        DeliveryRequest other = (DeliveryRequest) obj;
        return Objects.equals(location, other.location) && Objects.equals(product, other.product);
    }

    @Override
    public String toString() {
        return "DeliveryRequest [product=" + product + ", location=" + location + "]";
    }


}
