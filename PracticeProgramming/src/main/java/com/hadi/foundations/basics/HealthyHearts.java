package com.hadi.foundations.basics;

import java.util.Scanner;

public class HealthyHearts {
    public static void main(String[] args) {

        Scanner inputReader = new Scanner(System.in);

        int age, maxHR, targetHR1, targetHR2;

        System.out.print("What is your age? ");
        age = Integer.parseInt(inputReader.nextLine());

        maxHR = 220 - age;
        targetHR1 = (int) (maxHR / 100.0f * 50.0f);
        targetHR2 = (int) (maxHR / 100.0f * 85.0f);
        System.out.println("Your maximum heart rate should be " + maxHR + " beats per minute.");
        System.out.println("Your target HR Zone is " + targetHR1 + " - " + targetHR2 + " beats per minute.");

    }
}
