package list_interface;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;

public class RemoveDuplicate {
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

        // Call method to remove duplicates
        removeDuplicate(list);

        // Print the modified list after removing duplicates
        System.out.println(list);

    }

    // Method to remove duplicate elements from an ArrayList
    private static void removeDuplicate(ArrayList<Integer> list) {
        HashSet<Integer> set = new HashSet<>();
        ArrayList<Integer> uniqueList = new ArrayList<>();

        // Iterate through the list and add only unique elements
        for (Integer num : list) {
            if (!set.contains(num)) {
                set.add(num); // Add to HashSet to track seen numbers
                uniqueList.add(num); // Add to new list
            }
        }

        // Clear original list and copy back unique elements
        list.clear();
        list.addAll(uniqueList);
    }
}
