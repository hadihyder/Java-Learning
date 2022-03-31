package com.hadi.foundations.ClassesAndObjects.ClassModeling.IceCream;

public class IceCreamStock {
    //Declare variables
    private String SKU;
    private String iceCreamName;
    private int iceCreamPrice;
    private String iceCreamFlavor;
    private String iceCreamMake;

    //Constructor
    IceCreamStock(String sku){
        this.SKU = sku;
    }
    //Setters

    public void setIceCreamName(String iceCreamName) {
        this.iceCreamName = iceCreamName;
    }

    public void setIceCreamPrice(int iceCreamPrice) {
        this.iceCreamPrice = iceCreamPrice;
    }

    public void setIceCreamFlavor(String iceCreamFlavor) {
        this.iceCreamFlavor = iceCreamFlavor;
    }

    public void setIceCreamMake(String iceCreamMake) {
        this.iceCreamMake = iceCreamMake;
    }

    //Getters

    public String getSKU() {
        return SKU;
    }

    public String getIceCreamName() {
        return iceCreamName;
    }

    public String getIceCreamFlavor() {
        return iceCreamFlavor;
    }

    public int getIceCreamPrice() {
        return iceCreamPrice;
    }

    public String getIceCreamMake() {
        return iceCreamMake;
    }

    //add new stock
    public void newStock(){}
    //edit stock
    public void editStock(){}
    //remove stock
    public void removeStock(){}
}
