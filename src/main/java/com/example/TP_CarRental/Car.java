package com.example.TP_CarRental;

/*
The purpose of this class is to
initialize the attributes and methods
related to a car. These will be used
in other classes of this application
 */

public class Car {
    //initialization of the car's attributes
    private String plateNumber;
    private String brand;
    private int price;
    private Object rented;

    public Car(String s, String peugeot, int i) {
        super();
    }

    public Car(String plateNumber, String brand, int price, boolean rented) {
        super();
        this.plateNumber = plateNumber;
        this.brand = brand;
        this.price = price;
        this.rented=rented;
    }

    public String getPlateNumber() {
        return plateNumber;
    }

    public void setPlateNumber(String plateNumber) {
        this.plateNumber = plateNumber;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void getRented(boolean b) {
        this.rented = rented;
    }

    public boolean isRented() {
        this.rented = rented;
        return false;
    }

    @Override
    public String toString() {
        //method to display the caracteristics of a car
        return "Car [plateNumber=" + plateNumber + ", brand=" + brand + ", price=" + price + "]";
    }


}
