package aidrivenresumescreeningsystem;

import multileveluniversitymanagementsystem.AssignmentCourse;
import multileveluniversitymanagementsystem.Course;
import multileveluniversitymanagementsystem.ExamCourse;
import multileveluniversitymanagementsystem.ResearchCourse;

import java.util.List;




public class AiDrivenResumeScreeningSystem {
   // wild card Method to display
    public static void displayDetails(List<? extends JobRole> resumes){
        for(JobRole job : resumes){
            System.out.println("The Name = "+job.getName());
            System.out.println("The Salary = "+job.getSalary());
        }
    }

    // Creating main Method
    public static void main(String[] args) {
        // Creating Objects of different classes
        SoftwareEngineer ob = new SoftwareEngineer("Abhishek Sen Software Engineer",30000,"Java");
        DataScientist ob1 = new DataScientist("Neeraj Data Scientist Engineer" ,120000,"Google");
        ProductManager ob2 = new ProductManager("Rajan Product Manager",55000,7 );

        // Creating Resume Manager
        Resume<SoftwareEngineer> soft= new Resume<>();
        Resume<DataScientist> data = new Resume<>();
        Resume<ProductManager> product= new Resume<>();

        // Adding resumes
        soft.addResume(ob);
        data.addResume(ob1);
        product.addResume(ob2);


        // display wild card Method calling

        System.out.println("SoftWare Engineer:");
        displayDetails(soft.getResume());

        // Display  using wildcart
        System.out.println(" Data Scientist:");
        displayDetails(data.getResume());

        // Display using wildcart
        System.out.println(" Product Manager:");
        displayDetails(product.getResume());
    }
}
