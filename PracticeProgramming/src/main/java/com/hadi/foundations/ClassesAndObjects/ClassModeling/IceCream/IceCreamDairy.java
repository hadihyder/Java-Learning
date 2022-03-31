package com.hadi.foundations.ClassesAndObjects.ClassModeling.IceCream;

public class IceCreamDairy {
    //Declare variables
    private String iceCreamName;
    private String iceCreamFlavor;
    private int iceCreamPrice;
    private String recipe;

    //Constructor
    IceCreamDairy(String name) {
        this.iceCreamName = name;
    }

    //Setters

    public void setIceCreamFlavor(String iceCreamFlavor) {
        this.iceCreamFlavor = iceCreamFlavor;
    }

    public void setIceCreamPrice(int iceCreamPrice) {
        this.iceCreamPrice = iceCreamPrice;
    }

    public void setRecipe(String recipe) {
        this.recipe = recipe;
    }

    //Getters

    public String getIceCreamName() {
        return iceCreamName;
    }

    public String getIceCreamFlavor() {
        return iceCreamFlavor;
    }

    public int getIceCreamPrice() {
        return iceCreamPrice;
    }

    public String getRecipe() {
        return recipe;
    }

    //track of ice creams sold
    public void iceCreamsSold(){}
    //Add new recipe
    public void newRecipe(){}
}
