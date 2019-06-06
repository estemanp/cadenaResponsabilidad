package co.com.ceiba.chainofresponsabilityapp.dtos;

import co.com.ceiba.chainofresponsabilityapp.enumerations.VehicleType;

public class Vehicle {

    private String title;
    private String description;
    private VehicleType type;

    public  Vehicle(String title, String description, VehicleType type) {

        this.title = title;
        this.description = description;
        this.type = type;
    }

    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }

    public VehicleType getType() {
        return type;
    }
}
