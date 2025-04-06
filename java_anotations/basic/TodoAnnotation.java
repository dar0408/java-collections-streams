package basic;
import java.lang.annotation.*;
import java.lang.reflect.Method;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
@interface Todo {
    String task();
    String assignedTo();
    String priority() default "MEDIUM";
}

class Project {
    @Todo(task = "Add user login", assignedTo = "Ravi")
    public void feature1() {}

    @Todo(task = "Implement logout", assignedTo = "Megha", priority = "HIGH")
    public void feature2() {}
}

public class TodoAnnotation {
    public static void main(String[] args) throws Exception {
        for (Method m : Project.class.getDeclaredMethods()) {
            if (m.isAnnotationPresent(Todo.class)) {
                Todo t = m.getAnnotation(Todo.class);
                System.out.println("Task: " + t.task() + ", Assigned To: " + t.assignedTo() + ", Priority: " + t.priority());
            }
        }
    }
}