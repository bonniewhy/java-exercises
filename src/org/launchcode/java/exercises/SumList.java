package org.launchcode.java.exercises;
import java.util.ArrayList;

public class SumList {
    public static void main(String[] args) {
        // Create a list with 10 integers.
        ArrayList<Integer> nums = new ArrayList<>(){{
            add(1);
            add(2);
            add(5);
            add(4);
            add(10);
            add(22);
            add(39);
            add(18);
            add(44);
            add(3225);
            add(8);
        }};
        int evenSums = 0;

        // Create a loop to figure out which ones are even and add them together.
        for (int i : nums) {
            if (i % 2 == 0) {
                evenSums += i;
            }
        }

        // Print out evenSums.
        System.out.println(evenSums);
    }
}
