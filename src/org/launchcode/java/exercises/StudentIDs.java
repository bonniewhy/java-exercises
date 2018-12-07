package org.launchcode.java.exercises;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class StudentIDs {

    public static void main(String[] args) {

        HashMap<Integer, String> students = new HashMap<>();
        Scanner in = new Scanner(System.in);
        Integer newID;
        String newStudent;

        System.out.println("Enter your students (or ENTER to finish: ");

        // Get student names and grades
        do {

            System.out.println("Student: ");
            newStudent = in.nextLine();

            if (!newStudent.equals("")) {
                System.out.println("ID #: ");
                newID = in.nextInt();
                students.put(newID, newStudent);

                // Read in the newline before looping back
                in.nextLine();
            }
        } while(!newStudent.equals(""));

        // Print class roster
        System.out.println("\nClass roster:");

        for (Map.Entry<Integer, String> student : students.entrySet()) {
            System.out.println(student.getKey() + ": " + student.getValue() + ".");
        }
        // Similar to "Gradebook" but takes student names (string) and ID numbers (int)

        // Key should be ID numbers (int), values should be names (string)

        // Modify the roster printing code accordingly.

    }
}
