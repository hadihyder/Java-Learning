package com.mthree.ClassesAndObjects.StateCapitals.StateCapitals3;

public class Capital {
    private String name;
    private String population;
    private String squareMiles;

    Capital(String name, String population, String squareMiles){
        this.name = name;
        this.population = population;
        this.squareMiles = squareMiles;
    }

    @Override
    public String toString() {
        String capital = name + " | Pop: " + population + " | Area: " + squareMiles + " sq mi";
        return capital;
    }

    public boolean minPopulation(int pop) {
        int intPop = Integer.parseInt(population);
        if (intPop >= pop) {
            return true;
        } else {
            return false;
        }
    }

    public boolean maxSquareMiles(int miles){
        double intSquareMiles = Double.parseDouble(squareMiles);
        if(intSquareMiles <= miles) {
            return true;
        } else {
            return false;
        }
    }
}
