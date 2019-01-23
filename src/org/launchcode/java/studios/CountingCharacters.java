package org.launchcode.java.studios;
import java.util.Scanner;
import java.util.Map;
import java.util.HashMap;

public class CountingCharacters {
    public static void main(String[] args) {
        // Write a program that calculates the number of times each character occurs in a string and prints these counts to the console.

        // Get the string as input from the user. (Or hard code the example, whichever you find better.)
        System.out.println("Enter a message...");
        Scanner in = new Scanner(System.in);
        // String pretend = "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Nunc accumsan sem ut ligula scelerisque sollicitudin. Ut at sagittis augue. Praesent quis rhoncus justo. Aliquam erat volutpat. Donec sit amet suscipit metus, non lobortis massa. Vestibulum augue ex, dapibus ac suscipit vel, volutpat eget massa. Donec nec velit non ligula efficitur luctus.";
        HashMap<Character, Integer> characterCounts = new HashMap<>();

        // Loop through the string one character at a time. TIP: Turn a String into an array of characters using char[] charactersInString = myString.toCharArray();
        String userIn = in.nextLine();
        String userInAlpha = userIn.replaceAll("[^a-zA-Z0-9]", "");
        userIn = userInAlpha.toLowerCase();
        char[] charactersInString = userIn.toCharArray();

        // Which type of data structure (ArrayList, HashMap, or Array) should you use to store character counts?
        // Store character counts.
        for (char c : charactersInString) {
            if (characterCounts.containsKey(c)) {
                characterCounts.put(c, characterCounts.get(c) + 1);
            }
            else {
                characterCounts.put(c, 1);
            }
        }

        // You'll need to "initialize" the counts for the characters in some fashion. It's probably better to do this as you go through the string, as opposed to doing so before you loop through the string. (Why?)

        // Print all the counts to the console.
        for (Map.Entry<Character, Integer> characterCount : characterCounts.entrySet()) {
            System.out.println(characterCount.getKey() + " : " + characterCount.getValue());
        }

        // BONUS: Ways to modify your solution.
        // [X] Make the counts case-insensitive.
        // [X] Exclude non-alphabetic characters.
        // [X] Get the string as input from the user at the command line.
        // [ ] Read the string in from a file. NOTE: This is a hard one, and we won't talk about reading from files in Java in this course, so be ready for a tough challenge if you bite this one off.

    }
}
