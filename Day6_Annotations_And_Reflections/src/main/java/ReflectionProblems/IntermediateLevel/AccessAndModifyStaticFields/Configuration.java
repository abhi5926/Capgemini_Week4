package ReflectionProblems.IntermediateLevel.AccessAndModifyStaticFields;

public class Configuration {
    // Private static field
    private static String API_KEY = "OldAPIKey123";

    // Method to print the API_KEY
    public static void printAPIKey() {
        System.out.println("Current API Key: " + API_KEY);
    }
}
