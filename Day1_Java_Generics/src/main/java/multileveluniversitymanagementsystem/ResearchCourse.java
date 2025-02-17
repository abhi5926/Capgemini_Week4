package multileveluniversitymanagementsystem;

public class ResearchCourse extends CourseType {
    // Creating Attribute
    private String researchTopic;

    // Creating Constructor
    public ResearchCourse(String courseName,double coursePrice,int id,String researchTopic){
        super(courseName,coursePrice,id);
        this.researchTopic = researchTopic;
    }
    // implementing abstract method of super class CourseType
    public void display(){
        System.out.println("The Name of the Course : "+getCourseName());
        System.out.println("The Price of the Course : "+getCoursePrice());
        System.out.println("The Id of the Course : "+getCourseId());
        System.out.println("The Research Topic of the Course  : "+researchTopic);
    }
}
