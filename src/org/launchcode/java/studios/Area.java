package org.launchcode.java.studios;

import java.util.Scanner;

public class Area {
    public static void main(String[] args) {
        // A = pi * r * r where pi is 3.14 and r is the radius
    int validRadius = 0;

    do {
            // Prompt user for a radius. Store as double.
            Scanner areaIn = new Scanner(System.in);
            System.out.println("Enter a radius: ");
            double radius = areaIn.nextDouble();
            // Return the area.
            if (radius < 0) {
                System.out.println("Please enter a radius that is not negative.");
            } else {

                double area = 3.14 * radius * radius;
                System.out.println("The area of a circle of radius " + radius + " is: " + area);
                validRadius = 1;
            }

        } while (validRadius == 0);

        // BONUS: Add validation. If user enters negative number, print an error message and quit.

        // BONUS: Extend by doing a while or do-while loop so that when the user enters a negative number they are re-prompted.

    }
}
