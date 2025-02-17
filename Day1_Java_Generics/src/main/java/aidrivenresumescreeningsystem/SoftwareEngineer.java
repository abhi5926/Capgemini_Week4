package aidrivenresumescreeningsystem;

public class SoftwareEngineer extends JobRole {
    private String domainLanguage;

    // Creating Constructor
    public SoftwareEngineer(String name,double salary,String domainLanguage){
        super(name, salary);
        this.domainLanguage = domainLanguage;
    }
    // Implementing abstract method
    public  void display(){
        System.out.println("The name of Software Engineer :"+getName());
        System.out.println("The salary of Software Engineer :"+getSalary());
        System.out.println("The Domain Language Of Software Engineer"+domainLanguage);
    }
}
