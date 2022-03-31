package com.hadi.foundations.basics;

import java.util.Scanner;

public class DoItBetter {
    public static void main(String[] args) {

        int miles, hotDogQuantity, languages;

        Scanner  inputReader = new Scanner(System .in);

        System.out.println("Hey, how many miles can you run? ");
        miles = Integer.parseInt(inputReader.nextLine());
        System.out.println("Easy, I can run " + (miles * 2 + 1) + " miles!!");

        System.out.println("And how many hot dogs can you eat? ");
        hotDogQuantity = Integer.parseInt(inputReader.nextLine());
        System.out.println("Woah! I can eat " + (hotDogQuantity * 2 + 1) + " hot dogs!");

        System.out.println("Ok Ok! SO how many languages do you know? ");
        languages = Integer.parseInt(inputReader.nextLine());
        System.out.println("I know " + (languages * 2 + 1) + " languages!!");

    }
}
