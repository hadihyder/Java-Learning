package com.hadi.foundations.flowcontrol.ifs;

import java.util.Scanner;

public class MiniZork {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("You are standing in an open field west of a white house, near the pond");
        System.out.println("With a boarded front door.");
        System.out.println("There is a small mailbox here.");
        System.out.print("Go to the house, or open the mailbox, go to the pond? ");

        String action = scan.nextLine();

        if (action.equals("open the mailbox")) {
            System.out.println("You open the mailbox.");
            System.out.println("It's really dark in there.");
            System.out.print("Look inside or stick your hand in? ");
            action = scan.nextLine();

            if (action.equals("look inside")) {
                System.out.println("You peer inside the mailbox.");
                System.out.println("It's really very dark. So ... so very dark.");
                System.out.print("Run away or keep looking? ");
                action = scan.nextLine();

                if (action.equals("keep looking")) {
                    System.out.println("Turns out, hanging out around dark places isn't a good idea.");
                    System.out.println("You've been eaten by a grue.");
                } else if (action.equals("run away")) {
                    System.out.println("You run away screaming across the fields - looking very foolish.");
                    System.out.println("But you alive. Possibly a wise choice.");
                }
            } else if (action.equals("stick your hand in")) {
                System.out.println("Ouch! You got bitten by a poisonous snake which was inside the mail box! DEAD!!");
            }
        } else if (action.equals("go to the house")) {
            System.out.println("You go to the door of the house...");
            System.out.println("Break in or knock? ");
            action = scan.nextLine();

            if(action.equals("Break in")) {
                System.out.println("You get inside the house...");
                System.out.println("There's a dog waiting for you...");
                System.out.println("And you get attacked by the dog!!");
            } else if(action.equals("knock")) {
                System.out.println("An old man opens the door, ");
                System.out.println(" and welcomes you kindly!");
            }

        } else if (action.equals("go to the pond")) {
            System.out.println("You walk to the pond excitingly");
            System.out.println("the weather is nice, you're enjoying the view...");
            System.out.println("You see an alligator resting in there...");
            System.out.println("stay or run away? ");
            action = scan.nextLine();

            if(action.equals("stay")){
                System.out.println("You stay there calmly without being spotted by the alligator!");
                System.out.println("And the alligator sees you and approaches you without your knowledge...");
                System.out.println("DEAD!!");
            } else if( action.equals("run away")) {
                System.out.println("You run away - saving your life!!");
            }
        }
    }
}
