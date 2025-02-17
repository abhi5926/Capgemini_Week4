package AnnotationProblems.PracticeProblemsForCustomAnnotation.BeginnerLevel.CreateaTdoAnnotationforPendingTasks;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.lang.annotation.ElementType;
import java.lang.reflect.Method;

// Sample class with methods to apply the @Todo annotation
public class ProjectManager {

    @Todo(task = "Implement user authentication", assignedTo = "John", priority = "HIGH")
    public void implementAuth() {
        System.out.println("Implementing authentication...");
    }

    @Todo(task = "Design database schema", assignedTo = "Alice", priority = "LOW")
    public void designDatabase() {
        System.out.println("Designing database schema...");
    }

    @Todo(task = "Write unit tests for features", assignedTo = "David", priority = "MEDIUM")
    public void writeUnitTests() {
        System.out.println("Writing unit tests...");
    }

    // Method to retrieve and print all Todo tasks using reflection
    public static void printPendingTasks() {
        // Get all methods of the ProjectManager class
        Method[] methods = ProjectManager.class.getMethods();

        // Check each method for the @Todo annotation
        for (Method method : methods) {
            if (method.isAnnotationPresent(Todo.class)) {
                Todo todo = method.getAnnotation(Todo.class);

                // Print the task description, assigned person, and priority
                System.out.println("Task: " + todo.task());
                System.out.println("Assigned To: " + todo.assignedTo());
                System.out.println("Priority: " + todo.priority());
                System.out.println("----------------------------");
            }
        }
    }

    public static void main(String[] args) {
        // Print all pending tasks
        printPendingTasks();
    }
}