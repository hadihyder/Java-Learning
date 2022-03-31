package com.hadi.foundations.ClassesAndObjects.ClassModeling.Car;

public class CarInventory {
    //Declare variables
    private String carName;
    private String carModel;
    private String carType;
    private String carMake;
    private int carYear;

    //Constructor
    CarInventory(String type) {
        this.carType = type;
    }

    //Setters


    public void setCarName(String carName) {
        this.carName = carName;
    }

    public void setCarModel(String carModel) {
        this.carModel = carModel;
    }

    public void setCarMake(String carMake) {
        this.carMake = carMake;
    }

    public void setCarYear(int carYear) {
        this.carYear = carYear;
    }

    //Getters


    public String getCarName() {
        return carName;
    }

    public String getCarModel() {
        return carModel;
    }

    public String getCarMake() {
        return carMake;
    }

    public String getCarType() {
        return carType;
    }

    public int getCarYear() {
        return carYear;
    }

    //return car information
    public void carInformation(){   }

    //calculate car price
    public void priceCalculator(){  }
}
