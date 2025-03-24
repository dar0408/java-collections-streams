package set_interface;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;

public class EqualSets {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read the size of the first set
        int len1 = scanner.nextInt();
        HashSet<Integer> set1 = new HashSet<>();

        // Read elements into the first set
        for (int i = 0; i < len1; i++) {
            set1.add(scanner.nextInt());
        }

        // Read the size of the second set
        int len2 = scanner.nextInt();
        HashSet<Integer> set2 = new HashSet<>();

        // Read elements into the second set
        for (int i = 0; i < len2; i++) {
            set2.add(scanner.nextInt());
        }

        // Check if both sets are equal
        boolean check = checkEquality(set1, set2);
        System.out.println(check);

        scanner.close(); // Close scanner to prevent resource leaks
    }

    private static boolean checkEquality(HashSet<Integer> set1, HashSet<Integer> set2) {
        // If sizes are different, sets cannot be equal
        if (set1.size() != set2.size())
            return false;

        // Iterate through elements of the first set
        Iterator<Integer> i = set1.iterator();
        while (i.hasNext()) {
            // If an element of set1 is not found in set2, sets are not equal
            if (!set2.contains(i.next()))
                return false;
        }

        // If all elements matched, sets are equal
        return true;
    }
}
