package set_interface;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;

public class UnionAndIntersection {
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

        // Compute the union and intersection of both sets
        HashSet<Integer> union = unionSet(set1, set2);
        HashSet<Integer> intersection = intersectionSet(set1, set2);

        // Print the results
        System.out.println("Union: " + union);
        System.out.println("Intersection: " + intersection);

    }

    private static HashSet<Integer> intersectionSet(HashSet<Integer> set1, HashSet<Integer> set2) {
        HashSet<Integer> set = new HashSet<>();

        // Iterate through elements of set1
        Iterator<Integer> i = set1.iterator();
        while (i.hasNext()) {
            int value = i.next();

            // If set2 also contains the value, add it to the intersection set
            if (set2.contains(value)) {
                set.add(value);
            }
        }
        return set;
    }

    private static HashSet<Integer> unionSet(HashSet<Integer> set1, HashSet<Integer> set2) {
        HashSet<Integer> set = new HashSet<>();

        // Add all elements from set1 to the new set
        Iterator<Integer> i = set1.iterator();
        while (i.hasNext()) {
            set.add(i.next());
        }

        // Add all elements from set2 to the new set
        i = set2.iterator();
        while (i.hasNext()) {
            set.add(i.next());
        }

        return set;
    }
}
