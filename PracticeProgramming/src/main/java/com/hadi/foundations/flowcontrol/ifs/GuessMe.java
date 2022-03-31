package com.hadi.foundations.flowcontrol.ifs;

import java.util.Scanner;

public class GuessMe {
    public static void main(String[] args) {

        int a = 8,
                b;

        Scanner scan = new Scanner(System.in);

        System.out.println("I've chosen a number, guess it!");
        System.out.println("Your guess:: ");
        b = Integer.parseInt(scan.nextLine());

        if(b == a) {
            System.out.println("Wow, nice guess! That was it!");
        } else if (b < a){
            System.out.println("Ha, nice try - too low! I chose " + a);
        } else if (b > a) {
            System.out.println("Too bad, way too high. I chose " + a);
        }
    }
}
