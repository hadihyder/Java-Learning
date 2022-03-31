package com.hadi.foundations.ClassesAndObjects.ClassModeling.RefactoringExercise;

import java.util.Scanner;

public class InterestCalculator {

    Scanner scan = new Scanner(System.in);
    public void calculateInterest(){

        System.out.println("How much do you want to invest? ");
        double principal = Double.parseDouble(scan.nextLine());

        System.out.println("How many years are investing? ");
        int years = Integer.parseInt(scan.nextLine());

        System.out.println("What is the annual interest rate % growth? ");
        double interestRate = Double.parseDouble(scan.nextLine());

        System.out.println("What interest compound period would you like to choose? ");
        System.out.println("\n 1. Quarterly \n 2. Monthly \n 3. Daily");
        int choice = Integer.parseInt(scan.nextLine());

        System.out.println("Calculating...");

        double earned = 0.0;


        for(int i = 1; i <= years; i++) {

            double currentBalance = Double.valueOf(principal);
            System.out.println("\nYear " + i);
            System.out.println("Began with $" + (Math.round(currentBalance * 100.0)/100.0));
            double IR;
            if(choice == 1){
                IR = interestRate / 4;
                for(int j = 0; j < 4; j++) {
                    currentBalance = currentBalance * (1 + (IR / 100));
                    earned = currentBalance - principal;

                }
            } else if (choice == 2) {
                IR = interestRate / 12;
                for(int j = 0; j < 12; j++) {
                    currentBalance = currentBalance * (1 + (IR / 100));
                    earned = currentBalance - principal;

                }
            } else if(choice == 3) {
                IR = interestRate / 365;
                for(int j = 0; j < 365; j++) {
                    currentBalance = currentBalance * (1 + (IR / 100));
                    earned = currentBalance - principal;

                }
            } else {
                IR = interestRate / 4;
                for(int j = 0; j < 4; j++) {
                    currentBalance = currentBalance * (1 + (IR / 100));
                    earned = currentBalance - principal;

                }
            }


            System.out.println("Earned $" + (Math.round(earned * 100.0)/100.0));
            System.out.println("Ended with $" + (Math.round(currentBalance * 100.0)/100.0));
            principal = currentBalance;
        }
    }
}
