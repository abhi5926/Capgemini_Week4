package AnnotationProblems.PracticeProblemsForCustomAnnotation.Advancelevel.ImplementaRoleBasedAccessControlWithRoleAllowed;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.lang.annotation.ElementType;
import java.lang.reflect.Method;

public class SystemService {
    // Method only accessible by users with "ADMIN" role
    @RoleAllowed("ADMIN")
    public void adminTask() {
        System.out.println("Executing Admin Task...");
    }

    // Method only accessible by users with "USER" role
    @RoleAllowed("USER")
    public void userTask() {
        System.out.println("Executing User Task...");
    }

    // Method to simulate role-based access control
    public static void accessMethod(User user, String methodName) {
        try {
            // Get the SystemService class
            Method method = SystemService.class.getMethod(methodName);

            // Check if the method has the @RoleAllowed annotation
            if (method.isAnnotationPresent(RoleAllowed.class)) {
                // Get the allowed role from the annotation
                RoleAllowed roleAllowed = method.getAnnotation(RoleAllowed.class);
                String allowedRole = roleAllowed.value();

                // Check if the user role matches the allowed role
                if (user.getRole().equalsIgnoreCase(allowedRole)) {
                    // User has access, invoke the method
                    method.invoke(new SystemService());
                } else {
                    // User does not have access
                    System.out.println("Access Denied!");
                }
            }
        } catch (NoSuchMethodException | IllegalAccessException | java.lang.reflect.InvocationTargetException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        User adminUser = new User("ADMIN");
        User regularUser = new User("USER");

        // Simulate access control for an ADMIN user
        System.out.println("Admin User accessing adminTask:");
        accessMethod(adminUser, "adminTask");

        System.out.println("\nRegular User accessing adminTask:");
        accessMethod(regularUser, "adminTask");

        System.out.println("\nRegular User accessing userTask:");
        accessMethod(regularUser, "userTask");

        System.out.println("\nAdmin User accessing userTask:");
        accessMethod(adminUser, "userTask");
    }
}

