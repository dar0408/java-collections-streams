package basic;
import java.lang.annotation.*;
import java.lang.reflect.Method;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
@interface ImportantMethod {
    String level() default "HIGH";
}

class Service {
    @ImportantMethod
    public void login() {
        System.out.println("Login called");
    }

    @ImportantMethod(level = "MEDIUM")
    public void logout() {
        System.out.println("Logout called");
    }
}

public class ImportantMethodAnnotation {
    public static void main(String[] args) throws Exception {
        for (Method m : Service.class.getDeclaredMethods()) {
            if (m.isAnnotationPresent(ImportantMethod.class)) {
                ImportantMethod ann = m.getAnnotation(ImportantMethod.class);
                System.out.println(m.getName() + " - Level: " + ann.level());
            }
        }
    }
}