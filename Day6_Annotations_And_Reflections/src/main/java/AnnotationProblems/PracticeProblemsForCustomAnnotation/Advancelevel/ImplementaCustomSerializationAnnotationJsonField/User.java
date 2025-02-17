package AnnotationProblems.PracticeProblemsForCustomAnnotation.Advancelevel.ImplementaCustomSerializationAnnotationJsonField;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.lang.annotation.ElementType;
import java.lang.reflect.Field;
import java.util.HashMap;
import java.util.Map;

// User class with fields annotated with @JsonField
public class User {

    @JsonField(name = "user_name")
    private String username;

    @JsonField(name = "user_age")
    private int age;

    public User(String username, int age) {
        this.username = username;
        this.age = age;
    }

    // Getter methods
    public String getUsername() {
        return username;
    }

    public int getAge() {
        return age;
    }

    // Method to convert an object to JSON string using reflection
    public static String convertToJson(Object object) {
        StringBuilder jsonString = new StringBuilder();
        jsonString.append("{");

        // Get all fields of the class
        Field[] fields = object.getClass().getDeclaredFields();

        // Iterate over all fields
        for (int i = 0; i < fields.length; i++) {
            Field field = fields[i];
            if (field.isAnnotationPresent(JsonField.class)) {
                // Get the @JsonField annotation
                JsonField jsonField = field.getAnnotation(JsonField.class);

                // Set the field accessible if it is private
                field.setAccessible(true);

                try {
                    // Retrieve the value of the field
                    Object value = field.get(object);

                    // Append the field name and its value to the JSON string
                    jsonString.append("\"")
                            .append(jsonField.name())
                            .append("\": \"")
                            .append(value)
                            .append("\"");

                    // Add a comma unless it's the last field
                    if (i < fields.length - 1) {
                        jsonString.append(", ");
                    }

                } catch (IllegalAccessException e) {
                    e.printStackTrace();
                }
            }
        }

        jsonString.append("}");
        return jsonString.toString();
    }

    public static void main(String[] args) {
        // Create a User object
        User user = new User("JohnDoe", 30);

        // Convert the User object to JSON string
        String json = convertToJson(user);

        // Print the resulting JSON string
        System.out.println(json);
    }
}