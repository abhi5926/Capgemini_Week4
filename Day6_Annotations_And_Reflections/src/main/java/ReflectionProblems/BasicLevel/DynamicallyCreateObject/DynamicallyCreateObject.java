package ReflectionProblems.BasicLevel.DynamicallyCreateObject;

import java.lang.reflect.Constructor;

public class DynamicallyCreateObject {
    public void createObject() {
        try {
            // Create a Class Object for Student class
            Class<?> studentClass = Class.forName("ReflectionProblems.BasicLevel.DynamicallyCreateObject.Student");

            // Get the Constructor of the Student class that takes (String, int)
            Constructor<?> constructor = studentClass.getConstructor(String.class, int.class);

            // Create an instance of the Student class using the constructor
            Object studentInstance = constructor.newInstance("Abhishek", 20);

            // Invoke the displayInfo method on the studentInstance
            studentClass.getMethod("displayInfo").invoke(studentInstance);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        // Create an instance of DynamicallyCreateObject
        DynamicallyCreateObject ob = new DynamicallyCreateObject();

        // Call the method to create and display the Student object info
        ob.createObject();
    }
}

