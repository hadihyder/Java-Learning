package com.hadi.foundations.flowcontrol.whiles;

import java.util.Random;

public class LazyTeenager {
    public static void main(String[] args) {

        Random randomizer = new Random();
        int counter = 0;
        int chance = randomizer.nextInt(101);
        do {
            System.out.println("Clean your room!!");
            chance += (int)(chance / 100.0f * 10.0f);
            counter++;
            if(counter > 7) {
                System.out.println("That's it,  YOU'RE GROUNDED AND I'M TAKING YOUR XBOX!");
                break;
            }
        } while (chance <=100);
        if(chance >= 100) {
            System.out.println("FINE! I'LL CLEAN MY ROOM. BUT I REFUSE TO EAT MY PEAS.");
        }
    }
}
