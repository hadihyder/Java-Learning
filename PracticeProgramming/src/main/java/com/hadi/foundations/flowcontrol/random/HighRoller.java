package com.hadi.foundations.flowcontrol.random;

import java.util.Random;
import java.util.Scanner;

public class HighRoller {
    public static void main(String[] args) {

        Random diceRoller = new Random();
        Scanner scan = new Scanner(System.in);

        System.out.println("How many sides does your dice has? ");
        int sides = Integer.parseInt(scan.nextLine());

        int rollResult = diceRoller.nextInt(sides) + 1;

        System.out.println("TIME TO ROLL THE DICE!");
        System.out.println("I rolled a " + rollResult);

        if (rollResult == 1) {
            System.out.println("You rolled a critical failure! Ouch");
        }
        if(rollResult == sides) {
            System.out.println("You rolled a critical! Nice Job!");
        }
    }
}
