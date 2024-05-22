package exercise;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;
// BEGIN
public class Validator {

    public static List<String> validate(Address address) {
        List<String> result = new ArrayList<>();
        try {
            for(Field field: address.getClass().getDeclaredFields()) {
                field.setAccessible(true);
                String name = field.getName();
                if (result.contains(name)) continue;
                if (field.isAnnotationPresent(NotNull.class) && field.get(address) == null) {
                    result.add(name);
                }
            }
        } catch (SecurityException | IllegalArgumentException | IllegalAccessException e) {
            e.printStackTrace();
        }

        return result;
    }

}
// END
