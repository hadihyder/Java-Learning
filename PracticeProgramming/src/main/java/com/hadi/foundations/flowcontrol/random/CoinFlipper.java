package com.hadi.foundations.flowcontrol.random;

import java.util.Random;

public class CoinFlipper {
    public static void main(String[] args) {
        Random randomizer = new Random();

        boolean toss = randomizer.nextBoolean();

        System.out.println("Ready, Set, FLip.....!");
        if(toss) {
            System.out.println("You got HEADS");
        } else {
            System.out.println("You got TAILS");
        }


    }
}
