package com.hadi.foundations.exercises;

public class fizzBuzz {
    public static String[] fizzbuzz(int x, int y) {

        String[] res = new String[y - x + 1];
        int c = 0;

        for(int i = x; i <= y; i++) {
            if(i % 3 == 0 && i % 5 == 0) {
                res[c] = "fizzbuzz";
                c++;
            } else if(i % 3 == 0) {
                res[c] = "fizz";
                c++;
            } else if(i % 5 == 0) {
                res[c] = "buzz";
                c++;
            } else {
                res[c] = String.valueOf(i);
                c++;
            }
        }
        return  res;
    }

    public static void main(String[] args) {
        String[] fizzbuzz = fizzbuzz(1, 15);
        for(int i = 0; i < fizzbuzz.length; i++) {
            System.out.println(fizzbuzz[i]);
        }
    }
}
