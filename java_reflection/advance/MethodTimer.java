package advance;

import java.lang.reflect.Method;

class Task {
    public void execute() {
        for (int i = 0; i < 1000000; i++); // dummy loop
        System.out.println("Task executed");
    }
}

public class MethodTimer {
    public static void main(String[] args) throws Exception {
        Task task = new Task();
        Method method = Task.class.getDeclaredMethod("execute");

        long start = System.nanoTime();
        method.invoke(task);
        long end = System.nanoTime();

        System.out.println("Execution time: " + (end - start) / 1_000_000.0 + " ms");
    }
}
