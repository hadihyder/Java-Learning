package com.hadi.foundations.basics;

import java.util.Scanner;

public class AllTheTrivia {
    public static void main(String[] args) {

        String unit, rotatesClockWise, largestVolcano, element;

        Scanner inputReader = new Scanner(System.in);

        System.out.print("What unit is equivalent to 1,024 Gigabytes? ");
        unit = inputReader.nextLine();
        System.out.print("Which planet is the only one that rotates clockwise in our Solar System? ");
        rotatesClockWise =  inputReader.nextLine();
        System.out.print("The largest volcano ever discovered in our Solar System is located on which planet? ");
        largestVolcano = inputReader.nextLine();
        System.out.print("What is the most abundant element in the earth's atmosphere? ");
        element =  inputReader.nextLine();

        System.out.println("Wow, 1,024 Gigabytes is a " + largestVolcano + "!");
        System.out.println("I didn't know that the largest ever volcano was discovered on " + unit + "!");
        System.out.println("That's amazing that " + rotatesClockWise + " is the most abundant element in the atmosphere...");
        System.out.println(element + " is the only planet that rotates clockwise, neat!");
    }
}
