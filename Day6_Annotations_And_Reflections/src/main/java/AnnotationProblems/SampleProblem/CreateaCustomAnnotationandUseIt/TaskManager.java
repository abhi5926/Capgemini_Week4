package AnnotationProblems.SampleProblem.CreateaCustomAnnotationandUseIt;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.lang.annotation.ElementType;
import java.lang.reflect.Method;


// TaskManager class where the annotation will be applied
public class TaskManager {

    @TaskInfo(priority = 1, assignedTo = "Alice")
    public void completeTask() {
        System.out.println("Completing task...");
    }

    public static void main(String[] args) {
        // Using reflection to retrieve the TaskInfo annotation from the completeTask method
        try {
            Method method = TaskManager.class.getMethod("completeTask");

            // Check if the TaskInfo annotation is present on the method
            if (method.isAnnotationPresent(TaskInfo.class)) {
                TaskInfo taskInfo = method.getAnnotation(TaskInfo.class);

                // Retrieve and print the annotation details
                System.out.println("Task Priority: " + taskInfo.priority());
                System.out.println("Assigned To: " + taskInfo.assignedTo());
            } else {
                System.out.println("No TaskInfo annotation present on the method.");
            }

        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        }
    }
}

