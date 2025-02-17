package multileveluniversitymanagementsystem;

import java.util.ArrayList;
import java.util.List;

// Creating class of type generic
public  class Course<T extends CourseType> {
    private List<T> courses;

    // creating Constructor
    public Course(){
        courses = new ArrayList<>();
    }
    // Adding course in  a list
    public void addCouse(T course){
        courses.add(course);
    }
    // Method to get Course
    public List<T> getCourse(){
        return courses;
    }
}
