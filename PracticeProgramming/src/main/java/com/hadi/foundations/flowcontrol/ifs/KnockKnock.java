package com.hadi.foundations.flowcontrol.ifs;

import java.util.Scanner;

public class KnockKnock {
    public static void main(String[] args) {

        //.equals() checks the actual contents of the string,
        // while the '==' operator checks if the references are equal

        Scanner scan = new Scanner(System.in);

        System.out.println("Knock Knock! Guess Who!!");
        String nameGuess = scan.nextLine();

        if(nameGuess.equals("Marty McFly")) {
            System.out.println("Hey! That's right! I'm back!");
            System.out.println(".... from the Future.");
        } else {
            System.out.println("Dude, do I -look - like " + nameGuess);
        }
    }
}
