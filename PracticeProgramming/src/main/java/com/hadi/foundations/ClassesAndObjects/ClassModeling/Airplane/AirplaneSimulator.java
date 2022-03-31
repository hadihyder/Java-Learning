package com.hadi.foundations.ClassesAndObjects.ClassModeling.Airplane;

public class AirplaneSimulator{
    //Declare Variables
    private String pilotName;
    private String flightNum;
    boolean taxi;
    double speed;
    double coordinates;



    //Constructor
    AirplaneSimulator(String flight) {

        this.flightNum = flight;
    }

    //Setters

    public void setPilotName(String pilotName) {
        this.pilotName = pilotName;
    }

    public void setTaxi(boolean taxi) {
        this.taxi = taxi;
    }

    public void setSpeed(double speed) {
        this.speed = speed;
    }

    public void setCoordinates(double coordinates) {
        this.coordinates = coordinates;
    }

    //Getters



    public String getPilotName() {
        return pilotName;
    }

    public String getFlightNum() {
        return flightNum;
    }

    public double getSpeed() {
        return speed;
    }

    public double getCoordinates() {
        return coordinates;
    }

    //takeoff flight
    public void takeOff(){  }
    //land flight
    public void land(){ }
}
