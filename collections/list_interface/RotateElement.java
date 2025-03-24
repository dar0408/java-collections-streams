package list_interface;

import java.util.ArrayList;
import java.util.Scanner;

public class RotateElement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Scanner object for user input

        // Read the number of elements in the list
        int len = scanner.nextInt();

        // Create an ArrayList to store input integers
        ArrayList<Integer> list = new ArrayList<>();

        // Read 'len' number of integers from user input and add them to the list
        for (int i = 0; i < len; i++) {
            list.add(scanner.nextInt());
        }

        // Read the number of rotations
        int k = scanner.nextInt();

        // Rotate the list by 'k' positions
        rotate(list, k);

        // Print the rotated list
        System.out.println(list);

    }

    // Method to rotate the ArrayList by 'k' positions to the right
    private static void rotate(ArrayList<Integer> list, int k) {
        k = k % list.size(); // Handle cases where k > list.size()

        // Step 1: Reverse the first 'k' elements
        reverseList(list, 0, k - 1);

        // Step 2: Reverse the remaining elements
        reverseList(list, k, list.size() - 1);

        // Step 3: Reverse the entire list to achieve the rotation effect
        reverseList(list, 0, list.size() - 1);
    }

    // Helper method to reverse elements in a given range (in-place)
    private static void reverseList(ArrayList<Integer> list, int i, int j) {
        while (i < j) {
            // Swap elements at index i and j
            int temp = list.get(i);
            list.set(i, list.get(j));
            list.set(j, temp);

            // Move pointers towards the center
            i++;
            j--;
        }
    }
}
