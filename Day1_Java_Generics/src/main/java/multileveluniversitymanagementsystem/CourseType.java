package multileveluniversitymanagementsystem;

public abstract class CourseType {
    // Attributes of Course
    private String courseName;
    private double coursePrice;
    private int id;

    // Constructor Creating
    public CourseType(String courseName,double coursePrice,int id){
        this.courseName = courseName;
        this.coursePrice = coursePrice;
        this.id = id;
    }

    // Creating abstract method to display the Course Details
    public abstract void display();

    // Creating Getter Method to get CourseName
    public String getCourseName(){
        return courseName;
    }
    // Creating Method to get the course Price
    public double getCoursePrice(){
        return coursePrice;
    }
    // Creating Method to get Course Id
    public int getCourseId(){
        return id;
    }
}
