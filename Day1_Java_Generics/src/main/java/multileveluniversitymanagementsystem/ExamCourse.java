package multileveluniversitymanagementsystem;

public class ExamCourse extends CourseType {
    // Creating Attribute
    private String subjectName;

    // Creating Constructor
    public ExamCourse(String courseName,double coursePrice,int id,String subjectName){
        super(courseName,coursePrice,id);
        this.subjectName = subjectName;
    }

    // implementing abstract method of super class CourseType
    public void display(){
        System.out.println("The Name of the Course : "+getCourseName());
        System.out.println("The Price of the Course : "+getCoursePrice());
        System.out.println("The Id of the Course : "+getCourseId());
        System.out.println("The Subject of the Course : "+subjectName);
    }

}
