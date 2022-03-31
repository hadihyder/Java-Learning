package com.hadi.foundations.ClassesAndObjects.ClassModeling.Car;

public class CarGame {
    //Declare variables
    private String carName;
    private String carMake;
    private String carModel;
    private int carPrice;
    //Constructor
    CarGame(String make){
        this.carMake = make;
    }

    //Setters


    public void setCarName(String carName) {
        this.carName = carName;
    }

    public void setCarMake(String carMake) {
        this.carMake = carMake;
    }

    public void setCarModel(String carModel) {
        this.carModel = carModel;
    }

    public void setCarPrice(int carPrice) {
        this.carPrice = carPrice;
    }

    //Getters


    public String getCarName() {
        return carName;
    }

    public String getCarMake() {
        return carMake;
    }

    public String getCarModel() {
        return carModel;
    }

    public int getCarPrice() {
        return carPrice;
    }

    //Details to select Car
    public void selectCar(){    }
}
