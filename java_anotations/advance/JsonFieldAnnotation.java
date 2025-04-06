package advance;
import java.lang.annotation.*;
import java.lang.reflect.Field;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.FIELD)
@interface JsonField {
    String name();
}

class Person {
    @JsonField(name = "full_name")
    String name;

    @JsonField(name = "age_years")
    int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
}

public class JsonFieldAnnotation {
    public static void main(String[] args) throws Exception {
        Person p = new Person("Darpan", 22);
        StringBuilder json = new StringBuilder("{");

        for (Field f : Person.class.getDeclaredFields()) {
            if (f.isAnnotationPresent(JsonField.class)) {
                f.setAccessible(true);
                String key = f.getAnnotation(JsonField.class).name();
                Object value = f.get(p);
                // json.append(""").append(key).append("":"").append(value).append("",");
            }
        }

        json.deleteCharAt(json.length() - 1);
        json.append("}");
        System.out.println(json);
    }
}