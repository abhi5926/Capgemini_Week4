import ReflectionProblems.BasicLevel.AccessPrivateField.Person;

import java.lang.reflect.Field;

public class Main {
    // Method to modify the private field 'age'
    public static void ageFieldModification() {
        try {
            // Creating Person Class Object
            Person ob = new Person(25);

            // Getting the class object of the Person class
            Class<?> ob1 = ob.getClass();

            // Accessing the private field 'age' of the Person class
            Field ageField = ob1.getDeclaredField("age");

            // Making the private field accessible
            ageField.setAccessible(true);

            // Retrieve the current value of 'age' field
            int ageValue = (int) ageField.get(ob);

            // Modify the value of 'age' field to 30
            ageField.set(ob, 30);

            // Retrieve the new value of 'age' field
            int newAge = (int) ageField.get(ob);
            System.out.println("Modified Age: " + newAge);

        } catch (NoSuchFieldException | IllegalAccessException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        // Calling the method to modify the private field 'age'
        ageFieldModification();
    }
}
