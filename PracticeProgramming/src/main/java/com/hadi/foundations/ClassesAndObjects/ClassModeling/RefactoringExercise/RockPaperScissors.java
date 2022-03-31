package com.hadi.foundations.ClassesAndObjects.ClassModeling.RefactoringExercise;

import java.util.Random;
import java.util.Scanner;

public class RockPaperScissors {

    static Scanner scan = new Scanner(System.in);
    static Random randomizer = new Random();

    public void playRockPaperScissors(){
        //Declare variables
        int userWins = 0;
        int compWins = 0;
        boolean isPlaying = false;

        //Get number of rounds
        System.out.println("How many rounds do you want to play? ");
        int noOfRounds = Integer.parseInt(scan.nextLine());

        //Terminate if number of rounds is not valid.
        if(noOfRounds > 0 && noOfRounds < 11) {
            isPlaying = true;
        } else {
            System.out.println("Error! Incorrect number of rounds!");
        }

        //Loop
        while(isPlaying) {
            for(int i = 0; i < noOfRounds; i++) {
                System.out.println("What do you choose, \n 1. Rock \n 2. Paper \n 3. Scissors? ");
                int userChoice = Integer.parseInt(scan.nextLine());
                int compChoice = randomizer.nextInt(3); //Random choice for computer

                //Win conditions
                if (userChoice == 1 && compChoice == 0 ||
                        userChoice == 2 && compChoice == 1 ||
                        userChoice == 0 && compChoice == 2) {

                    userWins++;
                } else {
                    compWins++;
                }
            }

            if (userWins > compWins) {
                System.out.println("User wins!!");
            } else if (compWins > userWins) {
                System.out.println( "Computer wins!!");
            } else if(compWins == userWins) {
                System.out.println("Tied!!");
            }

            //If user wants to play another game
            System.out.println("Do you want to play again? (y/n)");
            String playAgain = scan.nextLine();

            if(playAgain.equals("y")) {
                System.out.println("How many rounds do you want to play? ");
                noOfRounds = Integer.parseInt(scan.nextLine());
                if(noOfRounds > 0 && noOfRounds < 11) {
                    isPlaying = true;
                } else {
                    System.out.println("Error! Incorrect number of rounds!");
                    isPlaying = false;
                }
            } else {
                System.out.println("Thanks for playing!");
                isPlaying = false;
            }

        }

    }

}
