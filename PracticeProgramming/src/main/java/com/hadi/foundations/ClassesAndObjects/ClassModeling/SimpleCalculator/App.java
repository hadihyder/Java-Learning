package com.hadi.foundations.ClassesAndObjects.ClassModeling.SimpleCalculator;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        UserIO userIO = new UserIOImpl();
        userIO.print("What operation would you like to do? ");
        int choice = userIO.readInt(("\n1. Addition \n2. Subtraction \n3. Multiplication \n4. Division"));

        int num1 = userIO.readInt("Enter First Number:: ");

        int num2 = userIO.readInt("Enter Second Number:: ");


        SimpleCalculator operation = new SimpleCalculator();


        switch (choice) {
            case 1-> {
               int result = operation.addition(num1, num2);
                userIO.print(String.valueOf(result));
            }
            case 2-> {
                int result = operation.subtraction(num1, num2);
                userIO.print(String.valueOf(result));
            }
            case 3-> {
                int result = operation.multiplication(num1, num2);
                userIO.print(String.valueOf(result));
            }
            case 4-> {
                int result = operation.division(num1, num2) ;
                userIO.print(String.valueOf(result));
            }
            default -> {
                userIO.print("Wrong Choice!!");
            }
        }
    }
}
