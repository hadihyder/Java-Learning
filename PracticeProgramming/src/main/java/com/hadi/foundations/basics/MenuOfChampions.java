package com.hadi.foundations.basics;

public class MenuOfChampions {
    public static void main(String[] args) {

        float pizzaPrice, piePrice, eggPrice;
        String pizzaName, pieName, eggName;

        pizzaName = "Rocco Pizza";
        pizzaPrice = 30.50f;
        pieName = "Apple Pie";
        piePrice = 3.00f;
        eggName = "Texas Omelet";
        eggPrice = 1.50f;

        System.out.println("   _   _   _   _   _   _   _   _   _   _   _   _   _   _   _   _\n" +
                ",-(_)-(_)-(_)-(_)-(_)-(_)-(_)-(_)-(_)-(_)-(_)-(_)-(_)-(_)-(_)-(_)\n" +
                "`-' `-' `-' `-' `-' `-' `-' `-' `-' `-' `-' `-' `-' `-' `-' `-'\n" +
                "\n");
        System.out.println("\t\t WELCOME TO CAFE JAVA!");
        System.out.println("\t\t Today's Menu Is...");
        System.out.println("   _   _   _   _   _   _   _   _   _   _   _   _   _   _   _   _\n" +
                ",-(_)-(_)-(_)-(_)-(_)-(_)-(_)-(_)-(_)-(_)-(_)-(_)-(_)-(_)-(_)-(_)\n" +
                "`-' `-' `-' `-' `-' `-' `-' `-' `-' `-' `-' `-' `-' `-' `-' `-'\n" +
                "\n");

        System.out.println("\t\t$ " + pizzaPrice + " ***** " + pizzaName);
        System.out.println("\t\t$ " + piePrice + " ***** " + pieName);
        System.out.println("\t\t$ " + eggPrice + " ***** " + eggName);

        System.out.println("   _   _   _   _   _   _   _   _   _   _   _   _   _   _   _   _\n" +
                ",-(_)-(_)-(_)-(_)-(_)-(_)-(_)-(_)-(_)-(_)-(_)-(_)-(_)-(_)-(_)-(_)\n" +
                "`-' `-' `-' `-' `-' `-' `-' `-' `-' `-' `-' `-' `-' `-' `-' `-'\n" +
                "\n");
    }
}
