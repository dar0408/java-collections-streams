package set_interface;

import java.util.*;

public class SetToSorted {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read the number of elements to be inserted into the set
        int n = scanner.nextInt();
        HashSet<Integer> set = new HashSet<>();

        // Read elements and add them to the HashSet
        // HashSet automatically removes duplicate values
        for (int i = 0; i < n; i++) {
            set.add(scanner.nextInt());
        }

        // Convert HashSet to an ArrayList for sorting
        ArrayList<Integer> list = new ArrayList<>(set);

        // Sort the list in ascending order
        Collections.sort(list);

        // Print the sorted list
        System.out.println(list);
    }
}
