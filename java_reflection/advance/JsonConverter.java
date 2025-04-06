package advance;

import java.lang.reflect.Field;

class Book {
    public String title = "Java Basics";
    public double price = 299.99;
}

public class JsonConverter {
    public static String toJson(Object obj) throws Exception {
        Class<?> clazz = obj.getClass();
        StringBuilder json = new StringBuilder("{");

        for (Field field : clazz.getDeclaredFields()) {
            field.setAccessible(true);
            json.append("\"").append(field.getName()).append("\":\"")
                .append(field.get(obj)).append("\",");
        }

        if (json.charAt(json.length() - 1) == ',') json.setLength(json.length() - 1);
        json.append("}");
        return json.toString();
    }

    public static void main(String[] args) throws Exception {
        Book book = new Book();
        System.out.println(toJson(book));
    }
}
