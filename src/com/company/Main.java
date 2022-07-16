package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code her
        System.out.println(createObject("1st(basketbal)"));
        System.out.println("=======================================");
        System.out.println(createObject("2nd class(Voleybal)"));
        System.out.println("=======================================");
        System.out.println(createObject("3rd class(Football)"));

    }

    public static String createObject(String className) {
        if (className == "1st(basketbal)") {
            Basketball basketball = new Basketball(5, "NBA", 1, "Points", 200, TypeOfGoal.THREE_POINT);
            basketball.print();

        } else if (className == "2nd class(Voleybal)") {
            Voleyball voleyball = new Voleyball(6, "karasuno", 1, "points", 250);
            voleyball.print();
        } else if (className == "3rd class(Football)") {
            Football football = new Football(11, "Juventus", 5, "Goal", 2, TypeOfPlayground.FOOTSAL);
            football.print();
        }

        return className;
    }
}
