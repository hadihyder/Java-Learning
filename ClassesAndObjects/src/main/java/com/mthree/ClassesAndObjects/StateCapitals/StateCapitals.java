package com.mthree.ClassesAndObjects.StateCapitals;

import java.util.Collection;
import java.util.HashMap;
import java.util.Set;

public class StateCapitals {
    public static void main(String[] args) {

        HashMap<String, String> stateCapitals = new HashMap<String, String>();

        stateCapitals.put("Alabama", "Montgomery");
        stateCapitals.put("Alaska", "Juneau");
        stateCapitals.put("Arizona", "Phoenix");
        stateCapitals.put("Arkansas", "Little Rock");

        Set<String> keys = stateCapitals.keySet();
        Collection<String> values = stateCapitals.values();

        System.out.println("STATES:: ");
        System.out.println("========");
        for(String k: keys) {
            System.out.println(k);
        }

        System.out.println("...");
        System.out.println("...");

        System.out.println("CAPITALS::");
        System.out.println("==========");
        for(String v: values){
            System.out.println(v);
        }
        System.out.println("...");
        System.out.println("...");

        System.out.println("STATE/CAPITAL PAIRS::");
        System.out.println("=====================");

        for (String state: keys){
            String capital = stateCapitals.get(state);
            System.out.println(state + " - " + capital);
        }




    }
}
