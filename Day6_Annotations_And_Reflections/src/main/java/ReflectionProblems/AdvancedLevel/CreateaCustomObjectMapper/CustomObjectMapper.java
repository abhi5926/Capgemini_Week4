package ReflectionProblems.AdvancedLevel.CreateaCustomObjectMapper;

import java.lang.reflect.Field;
import java.util.Map;

public class CustomObjectMapper {
    // Method to map values from the Map to the fields of the given object
    public static <T> T toObject(Class<T> clazz, Map<String, Object> properties) {
        try {
            // Create a new instance of the provided class
            T objectInstance = clazz.getDeclaredConstructor().newInstance();

            // Get all fields from the class
            Field[] fields = clazz.getDeclaredFields();

            // Iterate over each field and set its value from the Map if available
            for (Field field : fields) {
                field.setAccessible(true);
                String fieldName = field.getName();

                // Check if the Map contains the field name as a key
                if (properties.containsKey(fieldName)) {
                    Object fieldValue = properties.get(fieldName);

                    // Ensure the type is compatible before setting the value
                    if (field.getType().isAssignableFrom(fieldValue.getClass())) {
                        field.set(objectInstance, fieldValue);
                    } else {
                        System.out.println("Type mismatch for field: " + fieldName);
                    }
                }
            }
            return objectInstance;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
}
