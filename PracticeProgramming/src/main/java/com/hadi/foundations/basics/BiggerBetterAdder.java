package com.hadi.foundations.basics;

import java.util.Scanner;

public class BiggerBetterAdder {
    public static void main(String[] args) {

        int num1, num2, num3, sum;

        Scanner inputReader = new Scanner(System.in);

        System.out.print("Enter 1st Number: ");
        num1 = Integer.parseInt(inputReader.nextLine());

        System.out.print("Enter 2nd Number: ");
        num2 = Integer.parseInt(inputReader.nextLine());

        System.out.print("Enter 3rd Number: ");
        num3 = Integer.parseInt(inputReader.nextLine());

        sum = num1 + num2 + num3;

        System.out.println(num1 + " + " + num2 + " + " + num3 + " = " + sum);
    }
}
