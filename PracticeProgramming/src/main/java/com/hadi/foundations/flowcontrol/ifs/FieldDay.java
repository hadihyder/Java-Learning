package com.hadi.foundations.flowcontrol.ifs;

import java.util.Scanner;

public class FieldDay {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("What's your last name? ");
        String lastName = scan.nextLine();

        if(lastName.compareTo("Baggins") < 0) {
            System.out.println("Aha! You're on the team 'Red Dragons'!");
        } else if (lastName.compareTo("Baggins") >= 0 && lastName.compareTo("Dresden") < 0) {
            System.out.println("Aha! You're on the team 'Dark Wizards'!");
        } else if (lastName.compareTo("Dresden") >= 0 && lastName.compareTo("Howl") < 0) {
            System.out.println("Aha! You're on the team 'Moving Castles'!");
        } else if (lastName.compareTo("Howl") >= 0 && lastName.compareTo("Potter") < 0) {
            System.out.println("Aha! You're on the team 'Golden Snitches'!");
        } else if (lastName.compareTo("Potter") >= 0 && lastName.compareTo("Vimes") < 0) {
            System.out.println("Aha! You're on the team 'Night Guards'!");
        } else if (lastName.compareTo("Vimes") >= 0 ) {
            System.out.println("Aha! You're on the team 'Black Holes'!");
        }
    }
}
