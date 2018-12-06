package org.launchcode.java.exercises;
import java.util.Scanner;

public class Rectangle {
    public static void main(String[] args) {
        Scanner inFirst = new Scanner(System.in);
        System.out.println("Enter the width of the rectangle: ");
        int width = inFirst.nextInt();

        Scanner inSecond = new Scanner(System.in);
        System.out.println("Enter the length of the rectangle: ");
        int length = inSecond.nextInt();

        int area = width * length;
        System.out.println("The area of your rectangle is: " + area);

    }
}
