package com.hadi.foundations.ClassesAndObjects.ClassModeling.Airplane;

public class AirplaneTrafficControl {

    int aircraftNum;
    String aircraftLoc;
    String airData;
    boolean canLand;
    boolean canFly;

    //Constructor
    AirplaneTrafficControl(int flightNo) {
        this.aircraftNum = flightNo;
    }

    //Setters
    public void setAircraftLoc(String aircraftLoc) {
        this.aircraftLoc = aircraftLoc;
    }

    public void setAirData(String airData) {
        this.airData = airData;
    }

    public void setCanFly(boolean canFly) {
        this.canFly = canFly;
    }

    public void setCanLand(boolean canLand) {
        this.canLand = canLand;
    }

    //Getters
    public int getAircraftNum() {
        return aircraftNum;
    }

    public String getAircraftLoc() {
        return aircraftLoc;
    }

    public String getAirData() {
        return airData;
    }

    //return permission if the aircraft can land
    public boolean permissionForLanding() {
        return canLand;
    }
    //return permission if the aircraft can fly
    public boolean permissionForFlying() {
        return canFly;
    }
}
