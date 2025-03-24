package list_interface;

import java.util.LinkedList;
import java.util.Scanner;

public class NthElement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read the size of the linked list
        int len = scanner.nextInt();
        LinkedList<Character> list = new LinkedList<>();

        // Read elements into LinkedList
        for (int i = 0; i < len; i++) {
            list.add(scanner.next().charAt(0)); // Read character input
        }

        // Read N (position from end)
        int N = scanner.nextInt();

        // Find and print the Nth element from the end
        Character result = findNthFromEnd(list, N);
        if (result != null) {
            System.out.println(result);
        } else {
            System.out.println("Invalid input: N is greater than the list size or less than 1");
        }

    }

    // Method to find the Nth node from the end using the two-pointer technique
    private static Character findNthFromEnd(LinkedList<Character> list, int N) {
        if (list.isEmpty() || N <= 0)
            return null;

        // Two-pointer approach
        var first = list.listIterator();
        var second = list.listIterator();

        // Move the first pointer N steps ahead
        for (int i = 0; i < N; i++) {
            if (first.hasNext()) {
                first.next();
            } else {
                return null; // N is greater than the list size
            }
        }

        // Move both pointers until first reaches the end
        while (first.hasNext()) {
            first.next();
            second.next();
        }

        // Second pointer now points to the Nth node from the end
        return second.next();
    }
}
