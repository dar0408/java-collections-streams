package list_interface.reverse_list;

import java.util.ArrayList;
import java.util.Scanner;

public class ReverseArraylist {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in); // Create a Scanner object for user input

        // Prompt the user to enter the length of the ArrayList
        System.out.println("Enter the length of ArrayList: ");
        int n = s.nextInt(); // Read the number of elements

        // Create an ArrayList to store integers
        ArrayList<Integer> list = new ArrayList<>();

        // Read 'n' elements from user input and add them to the list
        for (int i = 0; i < n; i++) {
            list.add(s.nextInt());
        }

        // Call the method to reverse the list
        reverseList(list);

        // Print the reversed list
        System.out.println("Reversed List: " + list);

    }

    // Method to reverse the ArrayList in-place
    private static void reverseList(ArrayList<Integer> list) {
        int i = 0; // Start index (left pointer)
        int j = list.size() - 1; // End index (right pointer)

        // Swap elements using the two-pointer approach
        while (i < j) {
            int temp = list.get(i); // Store the left element temporarily
            list.set(i, list.get(j)); // Swap left with right element
            list.set(j, temp); // Swap right with stored element

            // Move pointers towards the center
            i++;
            j--;
        }
    }
}
