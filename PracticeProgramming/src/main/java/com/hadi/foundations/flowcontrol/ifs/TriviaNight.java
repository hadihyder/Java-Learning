package com.hadi.foundations.flowcontrol.ifs;

import java.util.Scanner;

public class TriviaNight {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int points = 0;
        int ans1, ans2, ans3;
        int rightAns1 = 4;
        int rightAns2 = 2;
        int rightAns3 = 3;
        System.out.println("It's TRIVIA NIGHT! Are you ready?!");

        System.out.println("\n FIRST QUESTION!");
        System.out.println("What is the Lowest level Programming Language?");
        System.out.println("1) Source Code \t\t\t 2) Assembly Language" +
                "\n3) C# \t\t\t\t\t 4) Machine Code");
        System.out.println("\n YOUR ANSWER::  ");
        ans1 = Integer.parseInt(scan.nextLine());

        System.out.println("\n SECOND QUESTION!");
        System.out.println("Website Security CAPTCHA Forms Are Descended From the Work of?");
        System.out.println("1) Grace Hopper \t\t\t 2) Alan Turing" +
                "\n3) Charles Babbage \t\t\t\t\t 4) Larry Page");
        System.out.println("\n YOUR ANSWER::  ");
        ans2 = Integer.parseInt(scan.nextLine());

        System.out.println("\n LAST QUESTION!");
        System.out.println("Which of These Sci-Fi Ships Was Once Slated for a Full-Size Replica in Las Vegas?");
        System.out.println("1) Serenity \t\t\t 2) The Battlestar Galactica" +
                "\n3) The USS Enterprise \t\t\t\t\t 4) The Millenium Falcon");
        System.out.println("\n YOUR ANSWER::  ");
        ans3 = Integer.parseInt(scan.nextLine());

        if(ans1 == rightAns1) {
            points++;
        } else {
            System.out.println("Correct Answer for FIRST QUESTION is:: " + rightAns1);
        }
        if(ans2 == rightAns2) {
            points++;
        } else {
            System.out.println("Correct Answer for SECOND QUESTION is:: " + rightAns2);
        }
        if(ans3 == rightAns3) {
            points++;
        } else {
            System.out.println("Correct Answer for LAST QUESTION is:: " + rightAns3);
        }

        if(points == 0) {
            System.out.println("Better Luck Next Time! You got  " + points + " correct answers!");
        } else if (points < 3) {
            System.out.println("Good! You got " + points + " correct answers!");
        } else {
            System.out.println("Amazing! You got " + points + " correct answers!");
        }

    }
}
