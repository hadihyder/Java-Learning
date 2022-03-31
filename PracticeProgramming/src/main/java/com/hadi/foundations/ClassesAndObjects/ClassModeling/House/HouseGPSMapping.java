package com.hadi.foundations.ClassesAndObjects.ClassModeling.House;

public class HouseGPSMapping {
    //Declare Variables
    private int houseNum;
    private String houseName;
    private String address;
    private String street;
    private float latitude;
    private float longitude;

    //Constructor
    HouseGPSMapping(int houseNo){

        this.houseNum =  houseNo;
    }

    //Setters
    public void setHouseName(String houseName) {
        this.houseName = houseName;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setLatitude(float latitude) {
        this.latitude = latitude;
    }

    public void setLongitude(float longitude) {
        this.longitude = longitude;
    }

    //Getters
    public int getHouseNum() {
        return houseNum;
    }

    public String getHouseName() {
        return houseName;
    }

    public String getAddress() {
        return address;
    }

    public String getStreet() {
        return street;
    }

    public float getLatitude() {
        return latitude;
    }

    public float getLongitude() {
        return longitude;
    }

    //return information of the house
    public void getHouseData(){   }
    //return location of the house
    public void getLocation(){  }
}
