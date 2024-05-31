package com.driver;

public class Boat implements WaterVehicle{
    private String name;
    private int capacity;

    // constructor
    public Boat(String name, int capacity) {
        this.name = name;
        this.capacity = capacity;
    }

    public Boat() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
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
