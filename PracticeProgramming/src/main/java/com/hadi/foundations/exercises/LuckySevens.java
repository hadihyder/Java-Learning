package com.hadi.foundations.exercises;

import java.util.Random;
import java.util.Scanner;

public class LuckySevens {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        Random randomizer = new Random();

        int max = 100;
        int rolls = 0;
        int rollWithMaxMoney = 0;

        System.out.println("How many dollars do you have? ");
        int money = Integer.parseInt(scan.nextLine());

        while(money > 0) {
            int dice1 = randomizer.nextInt(6) + 1;
            int dice2 = randomizer.nextInt(6) + 1;
            int luckyNo = dice1 + dice2;

            if(luckyNo == 7){
                money += 4;
                if(money > max) {
                    rollWithMaxMoney = rolls;
                }
                max = Math.max(max, money);

                rolls++;
            } else {
                money -= 1;
                rolls++;
            }
        }
        System.out.println("You are broke after " + rolls + " rolls.");
        System.out.println("You should have quit after " + rollWithMaxMoney + " when you had $" +max);
    }
}
