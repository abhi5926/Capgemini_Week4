package AnnotationProblems.PracticeProblemsForCustomAnnotation.BeginnerLevel.CreateanAnnotationToMarkMethods;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.lang.annotation.ElementType;
import java.lang.reflect.Method;

// Sample class with methods to apply the @ImportantMethod annotation
public class TaskManager {

    @ImportantMethod(level = "HIGH")
    public void processData() {
        System.out.println("Processing data...");
    }

    @ImportantMethod(level = "LOW")
    public void cleanData() {
        System.out.println("Cleaning data...");
    }

    // Method to print all methods annotated with @ImportantMethod
    public static void printImportantMethods() {

        Method[] methods = TaskManager.class.getMethods();

        // Check each method for the @ImportantMethod annotation
        for (Method method : methods) {
            if (method.isAnnotationPresent(ImportantMethod.class)) {
                ImportantMethod annotation = method.getAnnotation(ImportantMethod.class);
                System.out.println("Method: " + method.getName() + " | Importance Level: " + annotation.level());
            }
        }
    }

    public static void main(String[] args) {
        // Print the methods
        printImportantMethods();
    }
}