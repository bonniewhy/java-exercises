package org.launchcode.java.exercises;
import java.util.ArrayList;

public class FiveLetterWords {
    public static void main(String[] args) {
        // Make a list of words, some with 5 letters.
        ArrayList<String> words = new ArrayList<String>() {{
            add("lucky");
            add("daring");
            add("pretty");
            add("bold");
            add("crazy");
            add("great");
            add("good");
            add("exact");
        }};
        // Make a for loop to check the length of each word in that list.
        for (String word : words) {
            // Everytime it finds a five letter word, have it print it out.
            if (word.length() == 5) {
                System.out.println(word);
            }
        }
    }
}
