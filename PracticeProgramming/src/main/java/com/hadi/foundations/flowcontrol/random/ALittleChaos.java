package com.hadi.foundations.flowcontrol.random;

import java.util.Random;

public class ALittleChaos {
    public static void main(String[] args) {

        Random randomizer = new Random();

        System.out.println("Random can make integers: " + randomizer.nextInt());
        System.out.println("Or a double: " + randomizer.nextDouble());
        System.out.println("Or even a boolean: " + randomizer.nextBoolean());

        int num = randomizer.nextInt(100);

        System.out.println("You can store a randomized result: " + num);
        System.out.println("And use it over and over again: " + num + ", " + num);

        System.out.println("Or just keep generating new values");
        System.out.println("Here's a bunch of numbers from 0 - 100: ");

        System.out.print(randomizer.nextFloat() + ", ");
        System.out.print(randomizer.nextInt() + ", ");
        System.out.print(randomizer.nextInt(101) + ", ");
        System.out.print(randomizer.nextInt(101) + ", ");
        System.out.print(randomizer.nextInt(101) + ", ");
        System.out.println(randomizer.nextInt(101));



        //randomizer.nextInt(51) + 50 will result in adding 50 to
        // a random number between 0 and 50

        //Yes, we can use random numbers in a math statement!

        //When a random is used with nextFloat() it doesn't take in arguments resulting in a ny random float value

        //Similarly, when no arguments is passed to a nextInt() it returns any random integer.

    }
}
