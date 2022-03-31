package com.mthree.Enums.Days;

import java.util.Scanner;

enum Weekdays{
    MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY
}
public class App {

    Weekdays weekdays;

    public App(Weekdays weekdays){
        this.weekdays = weekdays;
    }

    public void daysToFriday(){
        switch (weekdays) {
            case MONDAY -> System.out.println("4 days to Friday");
            case TUESDAY -> System.out.println("3 days to Friday");
            case WEDNESDAY -> System.out.println("2 days to Friday");
            case THURSDAY -> System.out.println("1 day to Friday");
            case FRIDAY -> System.out.println("It's Friday");
            case SATURDAY -> System.out.println("6 days to Friday");
            case SUNDAY -> System.out.println("5 days to Friday");
            default -> System.out.println("Invalid Input");
        }
    }
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a day in the week: ");
        String day = sc.nextLine();

        App obj = new App(Weekdays.valueOf(day));
        obj.daysToFriday();
    }

}
