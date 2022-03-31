package com.hadi.foundations.ClassesAndObjects.ClassModeling.RefactoringExercise;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("What would you like to do? ");
        System.out.println("\n1. Factorization \n2. Calculate Interest \n3. Play Lucky Sevens \n4. Play Rock Paper Scissors ");
        int choice = Integer.parseInt(scan.nextLine());

        switch (choice) {
            case 1-> {
                Factorizer factors = new Factorizer();
                factors.calculateFactorization();
            }
            case 2-> {
                InterestCalculator interest = new InterestCalculator();
                interest.calculateInterest();
            }
            case 3-> {
                LuckySevens gameLuckSevens = new LuckySevens();
                gameLuckSevens.playLuckySevens();
            }
            case 4-> {
                RockPaperScissors gameRockPaperScissors = new RockPaperScissors();
                gameRockPaperScissors.playRockPaperScissors();
            }
            default -> {
                System.out.println("Sorry Wrong Choice!!!");
            }
        }
    }
}
