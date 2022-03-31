package com.mthree.BirthdayCalculator;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

public class BirthdayCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Welcome to the Magical Birthday Calculator");
        System.out.println("What's your birthday?");
        String input  = sc.nextLine();


        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MM/dd/yyyy");

        LocalDate birthDate = LocalDate.parse(input, formatter);


        String day = birthDate.format(DateTimeFormatter.ofPattern("EEEE"));
        LocalDate currYearDate = birthDate.plusYears(23);

        String dayThisYear = currYearDate.format(DateTimeFormatter.ofPattern("EEEE"));

        LocalDate today = LocalDate.now();
        String dateToday = today.format(formatter);
        long noOfDays = ChronoUnit.DAYS.between(today, currYearDate);
        Period diff = birthDate.until(today);

        System.out.println("That means you were born on a " +day.toUpperCase() + "!");
        System.out.println("This year it falls on a " +dayThisYear.toUpperCase() + "...");
        System.out.println("And since today is " + dateToday + ", there's " + noOfDays + " more days until the next one!");
        System.out.println("Excited to be turning " + diff.getYears());

    }
}
