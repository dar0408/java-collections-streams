package list_interface.reverse_list;

import java.util.Scanner;
import java.util.LinkedList;

public class ReverseLinkedList {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in); // Create Scanner object for user input

        // Prompt the user to enter the length of the LinkedList
        System.out.println("Enter the length of LinkedList: ");
        int n = s.nextInt(); // Read the number of elements

        // Create a LinkedList to store integers
        LinkedList<Integer> ll = new LinkedList<>();

        // Read 'n' elements from user input and add them to the LinkedList
        for (int i = 0; i < n; i++) {
            ll.add(s.nextInt());
        }

        // Call the method to reverse the LinkedList
        reverseLL(ll);

        // Print the reversed LinkedList
        System.out.println("Reversed LinkedList: " + ll);

    }

    // Method to reverse the LinkedList in-place
    private static void reverseLL(LinkedList<Integer> ll) {
        int i = 0; // Start index (left pointer)
        int j = ll.size() - 1; // End index (right pointer)

        // Swap elements using the two-pointer approach
        while (i < j) {
            int temp = ll.get(i); // Store the left element temporarily
            ll.set(i, ll.get(j)); // Swap left with right element
            ll.set(j, temp); // Swap right with stored element

            // Move pointers towards the center
            i++;
            j--;
        }
    }
}
