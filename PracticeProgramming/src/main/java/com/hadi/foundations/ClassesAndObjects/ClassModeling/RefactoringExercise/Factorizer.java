package com.hadi.foundations.ClassesAndObjects.ClassModeling.RefactoringExercise;

import java.util.ArrayList;
import java.util.Scanner;

public class Factorizer {


        Scanner scan = new Scanner(System.in);

        ArrayList<Integer> factors = new ArrayList<Integer>();
        int sumOfFactors = 0;

        public void calculateFactorization() {
            System.out.println("What number would you like to factor? ");
            int num = Integer.parseInt(scan.nextLine());


            System.out.println("The factors of " + num + " are:: ");
            for (int i = 1; i <= num; i++) {
                if (num % i == 0) {
                    factors.add(i);
                    System.out.print(i + " ");
                }
            }
            System.out.println("\n" + num + " has " + factors.size() + " factors.");

            for (int i = 0; i < factors.size() - 1; i++) {
                sumOfFactors += factors.get(i);
            }
            if (sumOfFactors == num) {
                System.out.println(num + " is a perfect number.");
            }

            if (factors.size() == 2) {
                System.out.println(num + " is a prime number");
            } else {
                System.out.println(num + " is not a prime number");
            }
        }

}
