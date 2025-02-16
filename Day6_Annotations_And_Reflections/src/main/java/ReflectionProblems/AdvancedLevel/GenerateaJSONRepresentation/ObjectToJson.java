package ReflectionProblems.AdvancedLevel.GenerateaJSONRepresentation;

import java.lang.reflect.Field;

// A simple class for demonstration
class Person {
    private String name;
    private int age;

    // Constructor
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Getter and Setter for name
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    // Getter and Setter for age
    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}


public class ObjectToJson {
    // Method to convert an object to a JSON-like string
    public static String toJson(Object object) {
        StringBuilder json = new StringBuilder();
        json.append("{");

        // Get the class of the object
        Class<?> clazz = object.getClass();

        // Get all declared fields of the class
        Field[] fields = clazz.getDeclaredFields();

        try {
            // Iterate over each field
            for (int i = 0; i < fields.length; i++) {
                Field field = fields[i];
                field.setAccessible(true);

                // Get the field's name and value
                String fieldName = field.getName();
                Object fieldValue = field.get(object);

                // Add field name and value to the JSON string
                json.append("\"").append(fieldName).append("\": ");

                // Handle the field value
                if (fieldValue instanceof String) {
                    json.append("\"").append(fieldValue).append("\"");
                } else {
                    json.append(fieldValue);
                }

                // Add a comma after each field, except for the last one
                if (i < fields.length - 1) {
                    json.append(", ");
                }
            }
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }

        json.append("}");
        return json.toString();
    }

    public static void main(String[] args) {
        // Test class with some fields
        Person person = new Person("John Doe", 30);

        // Convert the Person object to JSON-like string
        String jsonRepresentation = toJson(person);

        // Print the JSON-like string
        System.out.println(jsonRepresentation);
    }
}

