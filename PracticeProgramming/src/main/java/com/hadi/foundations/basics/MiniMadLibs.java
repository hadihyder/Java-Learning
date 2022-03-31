package com.hadi.foundations.basics;

import java.util.Scanner;

public class MiniMadLibs {
    public static void main(String[] args) {

        Scanner inputReader = new Scanner(System.in);

        String noun1, noun2, adjective1, adjective2, pluralNoun1, pluralNoun2, pluralNoun3,
                verbPresent, verbPast;
        int num;

        System.out.print("Let's play MAD LIBS!\n");

        System.out.print("I need a noun: ");
        noun1 = inputReader.nextLine();
        System.out.print("Now an adjective: ");
        adjective1 = inputReader.nextLine();
        System.out.print("Another noun: ");
        noun2 = inputReader.nextLine();
        System.out.print("And a number: ");
        num = Integer.parseInt(inputReader.nextLine());
        System.out.print("Another adjective: ");
        adjective2 = inputReader.nextLine();
        System.out.print("A plural noun: ");
        pluralNoun1 = inputReader.nextLine();
        System.out.print("Another one: ");
        pluralNoun2 = inputReader.nextLine();
        System.out.print("One more: ");
        pluralNoun3 = inputReader.nextLine();
        System.out.print("A verb (infinitive form): ");
        verbPresent = inputReader.nextLine();
        System.out.print("Same verb (past participle): ");
        verbPast = inputReader.nextLine();

        System.out.println("*** NOW LETS GET MAD (libs) ***");
        System.out.println(noun1 + ": the " + adjective1 + " frontier. These are the voyages of the starship " + noun2+ ".");
        System.out.println("Its " + num + "-year mission: to explore strange " + adjective2 + " " + pluralNoun1 + ", to seek out " +
                adjective2 + " " + pluralNoun2 + " and " + adjective2
                + " " + pluralNoun3 + ", to boldly " + verbPresent + " where no one has " + verbPast + " before.");

    }
}
