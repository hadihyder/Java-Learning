package com.hadi.foundations.flowcontrol.ifs;

public class SpaceRustlers {
    public static void main(String[] args) {

        int spaceships = 10;
        int aliens = 25;
        int cows = 100;


        if(aliens > spaceships) {
            System.out.println("Vrroom, vroom! Let's get going!");
        } else {
            System.out.println("There aren't enough green guys to drive these ships!");
        }

        if( cows == spaceships) {
            System.out.println("Wow, way to plan ahead! JUST enough room for all these walking hamburgers!");
        } else if (cows > spaceships) {
            System.out.println("Dangit! I don't know how we are going to fit all these cows in here!");
        } else {
            System.out.println("Too many ships! not enough cows.");
        }

        //If-else checks if the condition in if is true  block of 'if' is executed,
        //and if the condition is false block of 'else' is executed.

        //If else removed from the 'else if', that block won't be a continuation of the
        // previous if block, meaning it will not be executed if the previous 'if' statement
        // goes false, rather it will execute as standalone 'if' block.

        if(aliens > cows) {
            System.out.println("Hurrah, we've got the grub! Hamburger party on Alpha Centauri!");
        } else if(cows >= aliens) {
            System.out.println("Oh no! The herds got restless and took over! Looks like we're hamburger now!!");
        }
    }
}
