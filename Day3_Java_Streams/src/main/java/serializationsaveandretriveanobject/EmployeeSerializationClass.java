package serializationsaveandretriveanobject;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

class EmployeeSerialization {
    // Method to serialize the list of employees
    public static void serializeEmployees(List<Employee> employees, String filePath) {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(filePath))) {
            oos.writeObject(employees);
            System.out.println("Employee data has been serialized to " + filePath);
        } catch (IOException e) {
            System.out.println("IOException during serialization: " + e.getMessage());
        }
    }


    // Method to deserialize the list of employees
    public static List<Employee> deserializeEmployees(String filePath) {
        List<Employee> employees = null;
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(filePath))) {
            employees = (List<Employee>) ois.readObject();
            System.out.println("Employee data has been deserialized from " + filePath);
        } catch (IOException e) {
            System.out.println("IOException during deserialization: " + e.getMessage());
        } catch (ClassNotFoundException e) {
            System.out.println("ClassNotFoundException: " + e.getMessage());
        }
        return employees;
    }
    public static void main(String[] args) {
        // Create a list of employees
        List<Employee> employees = new ArrayList<>();
        employees.add(new Employee(1, "Alice", "HR", 50000));
        employees.add(new Employee(2, "Bob", "IT", 60000));
        employees.add(new Employee(3, "Charlie", "Finance", 70000));
        // Serialize the employee list
        String filePath = "D:\\Capgemini Notes\\Sample.txt";
        serializeEmployees(employees, filePath);
        // Deserialize the employee list and display it
        List<Employee> deserializedEmployees = deserializeEmployees(filePath);
        // Display the deserialized employee data
        if (deserializedEmployees != null) {
            System.out.println("\nDeserialized Employee List:");
            for (Employee employee : deserializedEmployees) {
                System.out.println(employee);
            }
        }
    }
}

