package com.mthree.ClassesAndObjects.StateCapitals.StateCapitals3;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Collection;
import java.util.HashMap;
import java.util.Scanner;
import java.util.Set;

public class StateCapitalsApp {
    public static void main(String[] args) throws FileNotFoundException {

        Scanner sc = new Scanner(
                new BufferedReader(
                        new FileReader("ClassesAndObjects/MoreStateCapitals.txt")));
        Scanner inputReader = new Scanner(System.in);

        HashMap<String, Capital> stateCapitalsMap = new HashMap<>();


        while (sc.hasNextLine()){
            String curr = sc.nextLine();
            String[] currSplit= curr.split("::");
            String state = currSplit[0];
            String capitalName = currSplit[1];
            String capitalPopulation = currSplit[2];
            String capitalArea = currSplit[3];
            Capital capital = new Capital(capitalName, capitalPopulation, capitalArea);
            stateCapitalsMap.put(state, capital);
        }

        int size = stateCapitalsMap.size();

        System.out.println(size + " STATE / CAPITAL PAIRS LOADED. ");
        System.out.println("================================");

        Set<String> states = stateCapitalsMap.keySet();
        Collection<Capital> capitals = stateCapitalsMap.values();

        for(String k: states){
            Capital capitalData = stateCapitalsMap.get(k);
            System.out.println(k + " - " + capitalData.toString());
        }

        System.out.println("\nPlease enter the lower limit for capital city population::  ");
        int pop = Integer.parseInt(inputReader.nextLine());

        for(String k: states) {
            Capital capitalData = stateCapitalsMap.get(k);
            boolean hasPop = capitalData.minPopulation(pop);

            if(hasPop) {
                System.out.println(k + " - " + capitalData.toString());
            }
        }

        System.out.println("\nPlease enter the upper limit for capital city sq mileage: ");
        int miles = Integer.parseInt(inputReader.nextLine());

        for(String k: states) {
            Capital capitalData = stateCapitalsMap.get(k);
            boolean hasMaxMiles = capitalData.maxSquareMiles(miles);

            if(hasMaxMiles) {
                System.out.println(k + " - " + capitalData.toString());
            }
        }


    }
}
