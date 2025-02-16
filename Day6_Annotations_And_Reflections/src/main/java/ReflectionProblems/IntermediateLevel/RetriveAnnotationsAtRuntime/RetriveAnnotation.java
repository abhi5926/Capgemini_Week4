package ReflectionProblems.IntermediateLevel.RetriveAnnotationsAtRuntime;

public class RetriveAnnotation {
    public static void main(String[] args) {
        try {
            // Trying to load the Book class
            Class<?> bookClass = Class.forName("ReflectionProblems.IntermediateLevel.RetriveAnnotationsAtRuntime.Book");

            // Check if the @Author annotation is present on the class
            if (bookClass.isAnnotationPresent(Author.class)) {
                // Retrieve the @Author annotation
                Author author = bookClass.getAnnotation(Author.class);

                // Display the author's name
                System.out.println("Author: " + author.name());
            } else {
                System.out.println("No @Author annotation found on the Book class.");
            }
        } catch (ClassNotFoundException e) {
            // Handle case where the class is not found
            System.err.println("Error: The class 'Book' could not be found. Ensure it is compiled and in the correct package.");
            e.printStackTrace();
        } catch (SecurityException e) {
            // Handle security exceptions when accessing the class or annotation
            System.err.println("Error: Security violation while trying to access the class or annotation.");
            e.printStackTrace();
        } catch (Exception e) {
            // Handle any other unexpected exceptions
            System.err.println("An unexpected error occurred.");
            e.printStackTrace();
        }
    }
}
