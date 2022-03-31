package com.hadi.foundations.basics;

import java.util.Scanner;

public class PassingTheTuringTest {
    public static void main(String[] args) {

        String name, color, fruit;
        int num;

        Scanner inputReader = new Scanner(System.in);

        System.out.println("Hello there!");
        System.out.print("What's your name? ");
        name  = inputReader.nextLine();

        System.out.println("Hi, " + name + "! I'm Zed.");
        System.out.print("What's your favorite color? ");
        color = inputReader.nextLine();

        System.out.println("Huh, " + color + "? Mine's Electric Lime.");
        System.out.println("I really like limes. They're my favorite fruit, too.");
        System.out.print("What's YOUR favorite fruit, " + name + "? ");
        fruit = inputReader.nextLine();

        System.out.println("Really? " + fruit + "? That's wild!");
        System.out.print("Speaking of favorites, what's your favorite number? ");
        num = Integer.parseInt(inputReader.nextLine());

        System.out.println(num + " is a cool number. Mine's 5.");
        System.out.println("Did you know " + num + "* 5 is" + num * 5 + "? That's a cool number too!" );

        System.out.println("Well, thanks for talking to me, " + name);
    }
}
