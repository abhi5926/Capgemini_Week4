package ReflectionProblems.AdvancedLevel.CreateaCustomObjectMapper;

import java.util.HashMap;
import java.util.Map;

public class Main {

    public static void main(String[] args) {
        // Create a Map with properties to be mapped to a Person object
        Map<String, Object> properties = new HashMap<>();
        properties.put("name", "John Doe");
        properties.put("age", 25);

        // Use the CustomObjectMapper to convert the Map to a Person object
        Person person = CustomObjectMapper.toObject(Person.class, properties);

        // Output the result
        if (person != null) {
            System.out.println(person);
        } else {
            System.out.println("Object creation failed.");
        }
    }
}
