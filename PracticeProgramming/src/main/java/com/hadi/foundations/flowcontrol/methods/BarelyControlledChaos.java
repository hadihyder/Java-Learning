package com.hadi.foundations.flowcontrol.methods;

import java.util.Random;

public class BarelyControlledChaos {
    static Random randomize = new Random();

    public static void main(String[] args) {

        String color = randomColor();
        String animal = randomAnimal();
        String colorAgain = randomColor();
        int weight = randomInteger(5, 200);
        int distance = randomInteger(10, 20);
        int number = randomInteger(10000, 20000);
        int time = randomInteger(2, 6);

        System.out.println("Once, when I was very small...");

        System.out.println("I was chased by a " + color + ", "
                + weight + "lb " + " miniature " + animal
                + " for over " + distance + " miles!!");

        System.out.println("I had to hide in a field of over "
                + number + " " + colorAgain + " poppies for nearly "
                + time + " hours until it left me alone!");

        System.out.println("\nIt was QUITE the experience, "
                + "let me tell you!");
    }

    public static String randomColor() {
        String[] colors = {
                "Red", "Green", "Blue", "Yellow", "White"
        };
        int colorIdx = randomize.nextInt(colors.length);
        return colors[colorIdx];
    }

    public static String randomAnimal() {
        String[] animals = {
                "Cat", "Dog", "Lion", "Tiger", "Wolf"
        };
        int animalIdx = randomize.nextInt(animals.length);
        return animals[animalIdx];
    }

    public static int randomInteger(int min, int max) {
        int num = randomize.nextInt((max- min)) + min;
        return num;
    }
}
