package basic;
import java.lang.reflect.Field;

class Person {
    private int age = 25;
}

public class AccessPrivateField {
    public static void main(String[] args) throws Exception {
        Person person = new Person();

        Field field = Person.class.getDeclaredField("age");
        field.setAccessible(true); // allow access to private field

        System.out.println("Original age: " + field.get(person));

        field.set(person, 30);
        System.out.println("Modified age: " + field.get(person));
    }
}
