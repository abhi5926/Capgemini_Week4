package multileveluniversitymanagementsystem;

public class AssignmentCourse extends CourseType {
    // Creating Attributes
    private int assignmentNumber;

    // Creating Constructor
    public AssignmentCourse(String courseName,double coursePrice,int id,int assignmentNumber){
        super(courseName,coursePrice,id);
        this.assignmentNumber = assignmentNumber;
    }
    // implementing abstract method of super class CourseType
    public void display(){
        System.out.println("The Name of the Course : "+getCourseName());
        System.out.println("The Price of the Course : "+getCoursePrice());
        System.out.println("The Id of the Course : "+getCourseId());
        System.out.println("The Number of the Course Assignment : "+assignmentNumber);
    }
}
