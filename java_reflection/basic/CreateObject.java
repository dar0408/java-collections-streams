package basic;
class Student {
    public Student() {
        System.out.println("Student object created!");
    }
}

public class CreateObject {
    public static void main(String[] args) throws Exception {
        Class<?> clazz = Class.forName("Student");
        Object student = clazz.getDeclaredConstructor().newInstance(); // no 'new' keyword used
    }
}
