package com.hadi.foundations.exercises;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Scanner;

public class InterestCalculator {
    public static void main(String[] args) {

        final BigDecimal ONE_HUNDRED = new BigDecimal(100);
        final BigDecimal FOUR = new BigDecimal(4);
        final BigDecimal ONE = new BigDecimal(1);
        final BigDecimal TWELVE = new BigDecimal(12);
        final BigDecimal THREE_SIXTY_FIVE = new BigDecimal(365);

        Scanner scan = new Scanner(System.in);

        System.out.println("How much do you want to invest? ");
//        double principal = Double.parseDouble(scan.nextLine());
        BigDecimal principal = scan.nextBigDecimal();
//        BigDecimal principal = new BigDecimal(50000);

        System.out.println("How many years are investing? ");
        int years = scan.nextInt();


        System.out.println("What is the annual interest rate % growth? ");
//        double interestRate = Double.parseDouble(scan.nextLine());
        BigDecimal interestRate = scan.nextBigDecimal();

        System.out.println("What interest compound period would you like to choose? ");
        System.out.println("\n 1. Quarterly \n 2. Monthly \n 3. Daily");
        int choice = scan.nextInt();

        System.out.println("Calculating...");

        BigDecimal earned = new BigDecimal(0);
        byte a  =42;

        for(int i = 1; i <= years; i++) {

            BigDecimal currentBalance = principal;
            System.out.println("\nYear " + i);
            System.out.println("Began with $" + (currentBalance.multiply(ONE_HUNDRED).divide(ONE_HUNDRED)).setScale(2, RoundingMode.CEILING));
            BigDecimal IR;
            if(choice == 1){
                IR = interestRate.divide(FOUR);
                for(int j = 0; j < 4; j++) {
//                    currentBalance = currentBalance * (1 + (IR / 100));
                    currentBalance = currentBalance.multiply(ONE.add(IR.divide(ONE_HUNDRED)));
                    earned = currentBalance.subtract(principal);

                }
            } else if (choice == 2) {
                IR = interestRate.subtract(TWELVE);
                for(int j = 0; j < 12; j++) {

                    currentBalance = currentBalance.multiply(ONE.add(IR.divide(ONE_HUNDRED)));
                    earned = currentBalance.subtract(principal);

                }
            } else if(choice == 3) {
                IR = interestRate.divide(THREE_SIXTY_FIVE);
                for(int j = 0; j < 365; j++) {

                    currentBalance = currentBalance.multiply(ONE.add(IR.divide(ONE_HUNDRED)));
                    earned = currentBalance.subtract(principal);

                }
            } else {
                IR = interestRate.divide(FOUR);
                for(int j = 0; j < 4; j++) {

                    currentBalance = currentBalance.multiply(ONE.add(IR.divide(ONE_HUNDRED)));
                    earned = currentBalance.subtract(principal);

                }
            }


//            System.out.println("Earned $" + (Math.round(earned * 100.0)/100.0));
            System.out.println("Earned $" + earned.multiply(ONE_HUNDRED).divide(ONE_HUNDRED).setScale(2, RoundingMode.CEILING));
//            System.out.println("Ended with $" + (Math.round(currentBalance * 100.0)/100.0));
            System.out.println("Ended with $" + currentBalance.multiply(ONE_HUNDRED).divide(ONE_HUNDRED).setScale(2, RoundingMode.CEILING));
            principal = currentBalance;
        }
    }

}
