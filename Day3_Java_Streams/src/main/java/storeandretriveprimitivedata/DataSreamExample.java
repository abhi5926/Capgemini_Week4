package storeandretriveprimitivedata;

import java.io.*;

class DataStreamExample {
    public static void main(String[] args) {
        String filePath = "student_data.dat"; // Path to the binary file where student details will be saved

        // Create an array of students to store in the file
        Student[] students = {
                new Student(1, "Abhishek", 3.9),
                new Student(2, "Neeraj", 3.5),
                new Student(3, "Rajan", 3.8)
        };

        // Writing student details to a binary file using DataOutputStream
        try (DataOutputStream dos = new DataOutputStream(new FileOutputStream(filePath))) {
            for (Student student : students) {
                dos.writeInt(student.rollNumber);
                dos.writeUTF(student.name);
                dos.writeDouble(student.GPA);
            }
            System.out.println("Student data has been written to the binary file.");
        } catch (IOException e) {
            System.out.println("Error writing student data: " + e.getMessage());
        }

        // Reading student details from the binary file using DataInputStream
        try (DataInputStream dis = new DataInputStream(new FileInputStream(filePath))) {
            System.out.println("Reading student data from the binary file:");
            while (dis.available() > 0) {
                int rollNumber = dis.readInt();
                String name = dis.readUTF();
                double GPA = dis.readDouble();

                // Displaying the student details
                System.out.println("Roll Number: " + rollNumber + ", Name: " + name + ", GPA: " + GPA);
            }
        } catch (IOException e) {
            System.out.println("Error reading student data: " + e.getMessage());
        }
    }
}

