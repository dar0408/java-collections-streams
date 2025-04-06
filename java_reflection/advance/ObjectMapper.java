package advance;

import java.lang.reflect.Field;
import java.util.Map;

class Employee {
    public String name;
    public int id;
}

public class ObjectMapper {
    public static <T> T toObject(Class<T> clazz, Map<String, Object> props) throws Exception {
        T obj = clazz.getDeclaredConstructor().newInstance();
        for (Map.Entry<String, Object> entry : props.entrySet()) {
            Field field = clazz.getDeclaredField(entry.getKey());
            field.setAccessible(true);
            field.set(obj, entry.getValue());
        }
        return obj;
    }

    public static void main(String[] args) throws Exception {
        Map<String, Object> map = Map.of("name", "Darpan", "id", 101);
        Employee emp = toObject(Employee.class, map);
        System.out.println(emp.name + " - " + emp.id);
    }
}
