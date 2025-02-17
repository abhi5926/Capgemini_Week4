package AnnotationProblems.SampleProblem.CreateandUseRepeatableAnnotation;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Repeatable;
import java.lang.annotation.ElementType;
import java.lang.annotation.Target;
// Sample class to use the annotation
public class Software {

    @BugReport(description = "Null pointer exception occurs in method X.")
    @BugReport(description = "Array index out of bounds in method Y.")
    public void processData() {
        System.out.println("Processing data...");
    }

    // Method to retrieve and print all BugReports for a given method
    public static void printBugReports() {
        try {
            // Get the BugReports container annotation from the processData method
            BugReports bugReports = Software.class.getMethod("processData").getAnnotation(BugReports.class);
            if (bugReports != null) {
                // Print each bug description stored in the BugReport annotations
                for (BugReport bug : bugReports.value()) {
                    System.out.println("Bug Description: " + bug.description());
                }
            }
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        // Print the bug reports applied to the processData method
        printBugReports();
    }
}
