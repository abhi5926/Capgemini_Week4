package multileveluniversitymanagementsystem;

import java.util.List;

public class UniversityCourseManagementSystem {
    // Wildcard method to display Courses
    public static void displayCourses(List<? extends CourseType> courses){
        for(CourseType course : courses){
            System.out.println("The Course Name = "+course.getCourseName());
            System.out.println("The Course Price = "+course.getCoursePrice());
            System.out.println("The Course Id = "+course.getCourseId());
        }
    }

    // Creating Main Method
    public static void main(String[] args) {
        // Creating  object of  ExamCourse
        ExamCourse ob = new ExamCourse("Mera Placement Hoga",12000.700,123,"Java Full Stack");
        // Creating  object of  AssignmentCourse
        AssignmentCourse ob1 = new AssignmentCourse("DSA With C++",12000,89,120);
        // Creating  object of  AssignmentCourse
        ResearchCourse ob2 = new ResearchCourse("Delta 2.0",10000,12,"Data Science");

        // Creating Course Manager
        Course<ExamCourse> exam = new Course<>();
        Course<AssignmentCourse> assignment = new Course<>();
        Course<ResearchCourse> research = new Course<>();

        // Adding Courses
        exam.addCouse(ob);
        assignment.addCouse(ob1);
        research.addCouse(ob2);

        // Display Courses using wildcart
        System.out.println("Exam Course :");
        displayCourses(exam.getCourse());

        // Display Courses using wildcart
        System.out.println("Assignment Course :");
        displayCourses(assignment.getCourse());

        // Display Courses using wildcart
        System.out.println("Research Course :");
        displayCourses(research.getCourse());

    }
}
