/*********************************
* The Software Guild
* Copyright (C) 2020 Wiley edu LLC - All Rights Reserved
*********************************/
package com.tsg.unittesting.arrays;

import java.util.Locale;

/**
 *
 * @author ahill
 */
public class ArrayExerciseE {
    
    /**
     * Given an array of words turn it into a single camelCased phrase.
     * Lower case the first word, capitalize the first letter (but only the first) of the rest.
     *
     * camelCaseIt( {"llama", "llama", "duck"}  ) ->  "llamaLlamaDuck"
     * camelCaseIt( {"lambs", "eat", "oats", "and", "does", "eat", "oats"}  ) ->  "lambsEatOatsAndDoesEatOats"
     * camelCaseIt( {"DO", "OR", "DO", "NOT", "THERE", "IS", "NO", "TRY"}  ) ->  "doOrDoNotThereIsNoTry"
     * @param words
     * @return String camelCased phrase
     */

    public static String camelCaseIt(String[] words){
        String phrase = "";

        for(int i = 0; i < words.length; i++) {
            String currWord = words[i];
            if(i == 0) {
                phrase += currWord;
            }
           String firstLetter = currWord.substring(0,0).toUpperCase();
           String remainingLetters = currWord.substring(1, currWord.length() - 1);

           phrase += firstLetter + remainingLetters;

        }
        return phrase;
    }
    
}
