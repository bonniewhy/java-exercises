package org.launchcode.java.exercises;
import java.util.Scanner;

public class PersonalGreeting {
    public static void main(String[] args) {
        String name;
        Scanner in;

        in = new Scanner(System.in);
        System.out.println("What's your name?");
        name = in.next();

        System.out.println("Hello, " + name + "!");
    }
}
