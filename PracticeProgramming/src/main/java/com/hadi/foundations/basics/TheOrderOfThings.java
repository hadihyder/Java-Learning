package com.hadi.foundations.basics;

public class TheOrderOfThings {
    public static void main(String[] args) {

        double number;
        String opinion, size, age, shape, color, origin, material, purpose;
        String noun;

        number = 5.0;
        opinion = "AWESOME";
        size = "teensy-weensy";
        age = "new";
        shape = "oblong";
        color = "yellow";
        origin = "Martian";
        material = "platinum";
        purpose = "good";

        noun = "dragons";

        System.out.println(number + " " + opinion + " " + size + " " + age + " " + shape +
                " " + color + " " + origin + " " + material + " " + purpose + " " + noun);

        System.out.println(number + " " + opinion + " " + age + " " + size + " " + purpose + " " + noun + " "
                + shape + " " + color + " " + origin + " " + material);

        System.out.println(number + " " + material + " " + opinion + " " + size + " " + purpose + " " + noun + " "
                + shape + " " + color + " " + origin + " " + age);

    }
}
