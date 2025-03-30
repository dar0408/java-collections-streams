package basicTesting;
import java.util.List;

// Class to manage list operations
public class ListManager {

    // Adds an element to a list
    public void addElement(List<Integer> list, int element) {
        list.add(element);
    }

    // Removes an element from a list (if it exists)
    public void removeElement(List<Integer> list, int element) {
        list.remove(Integer.valueOf(element));
    }

    // Returns the size of the list
    public int getSize(List<Integer> list) {
        return list.size();
    }
}
