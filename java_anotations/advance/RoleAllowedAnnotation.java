package advance;
import java.lang.annotation.*;
import java.lang.reflect.Method;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
@interface RoleAllowed {
    String value();
}

class AdminService {
    @RoleAllowed("ADMIN")
    public void deleteData() {
        System.out.println("Data deleted!");
    }
}

public class RoleAllowedAnnotation {
    public static void main(String[] args) throws Exception {
        String userRole = "USER";

        for (Method m : AdminService.class.getDeclaredMethods()) {
            if (m.isAnnotationPresent(RoleAllowed.class)) {
                String role = m.getAnnotation(RoleAllowed.class).value();
                if (userRole.equals(role)) {
                    m.invoke(new AdminService());
                } else {
                    System.out.println("Access Denied!");
                }
            }
        }
    }
}