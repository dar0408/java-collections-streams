package intermediate;
import java.lang.annotation.*;
import java.lang.reflect.Method;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
@interface LogExecutionTime {}

class Processor {
    @LogExecutionTime
    public void process() {
        try {
            Thread.sleep(200);
        } catch (InterruptedException e) {}
    }
}

public class LogExecutionTimeAnnotation {
    public static void main(String[] args) throws Exception {
        Processor p = new Processor();
        for (Method m : Processor.class.getDeclaredMethods()) {
            if (m.isAnnotationPresent(LogExecutionTime.class)) {
                long start = System.nanoTime();
                m.invoke(p);
                long end = System.nanoTime();
                System.out.println(m.getName() + " executed in " + (end - start) + " ns");
            }
        }
    }
}