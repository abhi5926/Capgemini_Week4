package ReflectionProblems.IntermediateLevel.AccessAndModifyStaticFields;

import java.lang.reflect.Field;

public class ModifyStaticField {
    public static void modifyStaticField() {
        try {
            // Access the Configuration class using reflection
            Class<?> configClass = Class.forName("ReflectionProblems.IntermediateLevel.AccessAndModifyStaticFields.Configuration");

            // Access the private static field 'API_KEY' using reflection
            Field apiKeyField = configClass.getDeclaredField("API_KEY");

            // Make the private field accessible
            apiKeyField.setAccessible(true);

            // Get the current value of the API_KEY (which should be "OldAPIKey123")
            String oldAPIKey = (String) apiKeyField.get(null);
            System.out.println("Old API Key: " + oldAPIKey);

            // Modify the value of the static field API_KEY
            apiKeyField.set(null, "NewAPIKey456");

            // Get the updated value of API_KEY
            String newAPIKey = (String) apiKeyField.get(null);
            System.out.println("New API Key: " + newAPIKey);

            // Call the method to print the new API Key
            Configuration.printAPIKey();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        modifyStaticField();
    }
}
