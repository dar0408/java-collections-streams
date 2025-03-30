package basicTesting;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import java.util.ArrayList;
import java.util.List;

// Testing class for ListManager
public class ListManagerTest {
    ListManager manager = new ListManager(); // Instance of ListManager

    @Test
    public void testAddElement() {
        List<Integer> list = new ArrayList<>();
        manager.addElement(list, 5); // Adding 5 to list
        assertEquals(1, list.size()); // List size should be 1
    }

    @Test
    public void testRemoveElement() {
        List<Integer> list = new ArrayList<>();
        list.add(5);
        manager.removeElement(list, 5); // Removing 5 from list
        assertFalse(list.contains(5)); // List should not contain 5 anymore
    }

    @Test
    public void testGetSize() {
        List<Integer> list = new ArrayList<>();
        list.add(5);
        list.add(10);
        assertEquals(2, manager.getSize(list)); // List has 2 elements
    }
}
