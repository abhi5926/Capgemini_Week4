package aidrivenresumescreeningsystem;


public class DataScientist extends JobRole {
    private String companyName;

    // Creating Constructor
    public DataScientist(String name,double salary, String companyName){
        super(name, salary);
        this.companyName = companyName;
    }
    // Implementing abstract method
    public  void display(){
        System.out.println("The name of  Product Manager:"+getName());
        System.out.println("The salary of Product Manager :"+getSalary());
        System.out.println("The Experience of Product Manager :"+companyName);
    }


}
