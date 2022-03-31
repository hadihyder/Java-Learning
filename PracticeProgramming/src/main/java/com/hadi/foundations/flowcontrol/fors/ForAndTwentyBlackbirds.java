package com.hadi.foundations.flowcontrol.fors;

public class ForAndTwentyBlackbirds {
    public static void main(String[] args) {

        int birdsInPie = 0;
        for(int  i = 1; i < 25 ; i++) {
            System.out.println("Blackbird #" + i + " goes into the pie!");
            birdsInPie++;
        }
        System.out.println("There are " + birdsInPie + " birds in there!");
        System.out.println("Quite the pie full!");

        //Changed the loop condition from 20 to 25, now the loops until 24 birds.
        //Changed i to 1 so the printouts start from 1 and not 0.

    }
}
