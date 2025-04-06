package intermediate;
import java.lang.annotation.*;
import java.lang.reflect.Field;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.FIELD)
@interface MaxLength {
    int value();
}

class User {
    @MaxLength(10)
    String username;

    public User(String username) throws Exception {
        this.username = username;
        for (Field field : getClass().getDeclaredFields()) {
            if (field.isAnnotationPresent(MaxLength.class)) {
                MaxLength ml = field.getAnnotation(MaxLength.class);
                field.setAccessible(true);
                String value = (String) field.get(this);
                if (value.length() > ml.value()) {
                    throw new IllegalArgumentException("Username too long!");
                }
            }
        }
    }
}

public class MaxLengthAnnotation {
    public static void main(String[] args) throws Exception {
        new User("dar0408");
    }
}