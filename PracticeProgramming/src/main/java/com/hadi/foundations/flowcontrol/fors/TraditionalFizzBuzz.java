package com.hadi.foundations.flowcontrol.fors;

import java.util.Scanner;

public class TraditionalFizzBuzz {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("How many units of fizzing and buzzing do you need? ");
        int units = Integer.parseInt(scan.nextLine());

        for(int  i = 0; i <= units; i++) {
            if (i == 0) {
                System.out.println(i);
            } else if(i % 3 == 0 && i % 5 == 0){
                    System.out.println("fizzbuzz");
            } else if(i % 3 == 0) {
                System.out.println("fizz");
            } else if(i % 5 == 0) {
                System.out.println("buzz");
            } else {
                System.out.println(i);
            }
        }

        System.out.println("TRADITION!!!!");
    }
}
