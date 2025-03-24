package set_interface;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;

public class Subset {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read the size of the first set and populate it
        int len1 = scanner.nextInt();
        HashSet<Integer> set1 = new HashSet<>();
        for (int i = 0; i < len1; i++) {
            set1.add(scanner.nextInt());
        }

        // Read the size of the second set and populate it
        int len2 = scanner.nextInt();
        HashSet<Integer> set2 = new HashSet<>();
        for (int i = 0; i < len2; i++) {
            set2.add(scanner.nextInt());
        }

        // Check if one set is a subset of the other
        Boolean check = checkSubsets(set1, set2);
        System.out.println(check);
    }

    private static Boolean checkSubsets(HashSet<Integer> set1, HashSet<Integer> set2) {
        // Ensure the smaller set is always used for iteration to optimize performance
        if (set1.size() > set2.size())
            return checkSubsets(set2, set1);

        // Iterate through set1 and check if all elements exist in set2
        Iterator<Integer> i = set1.iterator();
        while (i.hasNext()) {
            if (!set2.contains(i.next()))
                return false; // If an element is missing, it's not a subset
        }
        return true; // All elements of set1 are found in set2
    }
}
