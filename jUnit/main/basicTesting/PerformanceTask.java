package basicTesting;

// Class with a method that simulates a long-running task
public class PerformanceTask {

    // Simulates a task that takes time to complete
    public void longRunningTask() throws InterruptedException {
        Thread.sleep(3000); // Makes the program wait for 3 seconds
    }
}
