package com.mthree.ClassesAndObjects.exercises;

import java.util.Scanner;

public class UserIOImpl implements UserIO {

    Scanner inputReader = new Scanner(System.in);

    @Override
    public void print(String message) {
        System.out.println(message);
    }

    @Override
    public String readString(String prompt) {
        System.out.println(prompt);
        String str = inputReader.nextLine();
        return str;
    }

    @Override
    public int readInt(String prompt) {
        System.out.println(prompt);
        int input = Integer.parseInt(inputReader.nextLine());
        return input;
    }

    @Override
    public int readInt(String prompt, double min, double max) {
        boolean isNotValid = true;

        System.out.println(prompt);

        int input = Integer.parseInt(inputReader.nextLine());
        while(isNotValid){

            if(input >= min && input <= max) {
                isNotValid = false;

            } else {
                System.out.println("Try Again! ");
                input = Integer.parseInt(inputReader.nextLine());
            }
        }
        return input;
    }

    @Override
    public double readDouble(String prompt) {
        System.out.println(prompt);
        double input = Double.parseDouble(inputReader.nextLine());
        return input;
    }

    @Override
    public double readDouble(String prompt, double min, double max) {
        boolean isNotValid = true;

        System.out.println(prompt);

        double input = Double.parseDouble(inputReader.nextLine());
        while(isNotValid){

            if(input >= min && input <= max) {
                isNotValid = false;

            } else {
                System.out.println("Try Again! ");
                input = Double.parseDouble(inputReader.nextLine());            }
        }
        return input;
    }

    @Override
    public float readFloat(String prompt) {
        System.out.println(prompt);
        float input = Float.parseFloat(inputReader.nextLine());
        return input;
    }

    @Override
    public float readFloat(String prompt, float min, float max) {
        boolean isNotValid = true;

        System.out.println(prompt);

        float input = Float.parseFloat(inputReader.nextLine());
        while(isNotValid){

            if(input >= min && input <= max) {
                isNotValid = false;

            } else {
                System.out.println("Try Again! ");
                input = Float.parseFloat(inputReader.nextLine());
            }
        }
        return input;
    }

    @Override
    public long readLong(String prompt) {
        System.out.println(prompt);
        long input = Long.parseLong(inputReader.nextLine());
        return input;
    }

    @Override
    public long readLong(String prompt, long min, long max) {
        boolean isNotValid = true;

        System.out.println(prompt);

        long input = Long.parseLong(inputReader.nextLine());
        while(isNotValid){

            if(input >= min && input <= max) {
                isNotValid = false;

            } else {
                System.out.println("Try Again! ");
                input = Long.parseLong(inputReader.nextLine());
            }
        }
        return input;
    }
}
