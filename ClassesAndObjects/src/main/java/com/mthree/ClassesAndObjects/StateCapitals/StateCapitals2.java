package com.mthree.ClassesAndObjects.StateCapitals;

import java.io.*;
import java.util.*;

public class StateCapitals2 {
    public static void main(String[] args) throws IOException {
//        PrintWriter out = new PrintWriter(new FileWriter("OutFile.txt"));
//        out.println("this is a line in my file...");
//        out.println("a second line in my file...");
//        out.println("a third line in my file...");
//        out.flush();
//        out.close();
        Scanner sc = new Scanner(
                new BufferedReader(
                        new FileReader("ClassesAndObjects/StateCapitals.txt")));
        Scanner inputReader = new Scanner(System.in);
        Random random = new Random();
        HashMap<String, String> stateCapitals = new HashMap<>();
        while(sc.hasNextLine()) {
            String curr = sc.nextLine();
            String state = curr.substring(0, curr.indexOf(":"));
            String capital = curr.substring(curr.indexOf(":") + 2);
            stateCapitals.put(state, capital);
        }
        int size = stateCapitals.size();
        System.out.println(size + " STATES & CAPITALS ARE LOADED. ");
        System.out.println("============");

        System.out.println("HERE ARE THE STATES : ");
        Set<String> keys = stateCapitals.keySet();
        for(String k: keys) {
            System.out.print(k + ", ");
        }

        int points = 0;
        System.out.println("\nREADY TO TEST YOUR KNOWLEDGE? ");
        System.out.println("How many rounds do you want to play? ");
        int noOfRounds = Integer.parseInt(inputReader.nextLine());

        ArrayList<String> keyArr = new ArrayList<>();
        keyArr.addAll(keys);

        for(int i = 0; i < noOfRounds; i++) {

            int randomNo = random.nextInt(keyArr.size());
            String randomState = keyArr.get(randomNo);

            System.out.println("WHAT IS THE CAPITAL OF '" + randomState + "' ?");

            String ans = inputReader.nextLine();

            if (stateCapitals.get(randomState).equals(ans)) {
                System.out.println("NICE WORK! " + ans + " IS CORRECT!");
                points++;
            } else {
                System.out.println("WRONG ANSWER!!!");
                points--;
            }
            keyArr.remove(randomState);
        }
        System.out.println("Total Score :: " +points);
    }
}
