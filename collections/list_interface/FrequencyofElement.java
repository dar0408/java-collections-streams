package list_interface;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class FrequencyofElement {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in); // Scanner object for user input

        // Read the number of elements in the list
        int len = s.nextInt();

        // Create an ArrayList to store input strings
        ArrayList<String> list = new ArrayList<>();

        // Read 'len' number of strings from user input and add them to the list
        for (int i = 0; i < len; i++) {
            list.add(s.next()); // Read next string and store it in the list
        }

        // Create a HashMap to store the frequency of each unique string
        HashMap<String, Integer> map = new HashMap<>();

        // Iterate through the list and update the frequency in the HashMap
        for (String a : list) {
            map.put(a, map.getOrDefault(s, 0) + 1);
            // If key exists, increment count; otherwise, initialize with 1
        }

        // Print the frequency of each string in the list
        System.out.println(map);

    }
}
