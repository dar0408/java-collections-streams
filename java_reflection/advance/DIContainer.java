package advance;

import java.lang.annotation.*;
import java.lang.reflect.*;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.FIELD)
@interface Inject {}

class Service {
    void run() {
        System.out.println("Service is running...");
    }
}

class App {
    @Inject
    private Service service;

    void start() {
        service.run();
    }
}

public class DIContainer {
    public static void main(String[] args) throws Exception {
        App app = new App();

        for (Field field : app.getClass().getDeclaredFields()) {
            if (field.isAnnotationPresent(Inject.class)) {
                field.setAccessible(true);
                field.set(app, field.getType().getDeclaredConstructor().newInstance());
            }
        }

        app.start();
    }
}
