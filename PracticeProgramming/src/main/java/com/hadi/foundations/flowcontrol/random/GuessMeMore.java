package com.hadi.foundations.flowcontrol.random;

import java.util.Random;
import java.util.Scanner;

public class GuessMeMore {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        Random randomizer = new Random();

        int randomNum = randomizer.nextInt((100 - (-100)) + (-100));

        System.out.println("I've chosen a number between -100 and 100. Bet you can't guess it!");
        System.out.println("Your guess:: ");
        int guess = Integer.parseInt(scan.nextLine());

        if(guess == randomNum) {
            System.out.println("Wow, nice guess! That was it!");
        } else if (guess < randomNum){
            System.out.println("Ha, nice try - too low! Guess again::  ");
            guess = Integer.parseInt(scan.nextLine());
            if(guess == randomNum) {
                System.out.println("Wow, nice guess! That was it!");
            } else if (guess < randomNum) {
                System.out.println("Too bad, way too high. I chose " + randomNum);
            }else if (guess > randomNum) {
                System.out.println("Too bad, way too high. I chose " + randomNum);
            }
        } else if (guess > randomNum) {
            System.out.println("Too bad, way too high. Guess again::  ");
            guess = Integer.parseInt(scan.nextLine());
            if(guess == randomNum) {
                System.out.println("Wow, nice guess! That was it!");
            } else if (guess < randomNum) {
                System.out.println("Too bad, way too high. I chose " + randomNum);
            }else if (guess > randomNum) {
                System.out.println("Too bad, way too high. I chose " + randomNum);
            }
        }
    }
}
