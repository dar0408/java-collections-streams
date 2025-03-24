package set_interface;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;

public class SymmetricDifference {
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

        // Compute the symmetric difference between set1 and set2
        HashSet<Integer> symmetricDiffSet = symmetricDiff(set1, set2);

        // Print the result
        System.out.println("Symmetric Difference: " + symmetricDiffSet);

    }

    private static HashSet<Integer> symmetricDiff(HashSet<Integer> set1, HashSet<Integer> set2) {
        HashSet<Integer> set = new HashSet<>();

        // Iterate through set1 and add elements that are not in set2
        Iterator<Integer> i = set1.iterator();
        while (i.hasNext()) {
            int value = i.next();
            if (!set2.contains(value)) { // If set2 doesn't contain it, add it
                set.add(value);
            }
        }

        // Iterate through set2 and add elements that are not in set1
        i = set2.iterator();
        while (i.hasNext()) {
            int value = i.next();
            if (!set1.contains(value)) { // If set1 doesn't contain it, add it
                set.add(value);
            }
        }

        return set;
    }
}
