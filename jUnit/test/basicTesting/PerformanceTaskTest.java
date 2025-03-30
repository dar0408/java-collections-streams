package basicTesting;

import static org.junit.jupiter.api.Assertions.*;
        import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import java.util.concurrent.TimeUnit;

// Testing class for PerformanceTask
public class PerformanceTaskTest {
    PerformanceTask task = new PerformanceTask(); // Creating an instance

    @Test
    @Timeout(value = 2, unit = TimeUnit.SECONDS) // Test should fail if it takes more than 2 seconds
    public void testLongRunningTask() throws InterruptedException {
        task.longRunningTask(); // This will fail because it takes 3 seconds
    }
}
