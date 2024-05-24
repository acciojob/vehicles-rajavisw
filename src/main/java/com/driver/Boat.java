package com.driver;

public class Boat implements WaterVehicle{
    private String name;
    private int capacity;

    // constructor
    public Boat(String name, int capacity) {
        this.name = name;
        this.capacity = capacity;
    }

    // implement the methods from the interface
    public String getVehicleName() {
        return this.name;
    }

    public int getVehicleCapacity() {
        return this.capacity;
    }
}
