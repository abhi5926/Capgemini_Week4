package aidrivenresumescreeningsystem;

public abstract class JobRole {
    private String name;
    private double salary;

    // Creating Constructor
    public JobRole(String name,double salary){
        this.name = name;
        this.salary = salary;
    }
    // Creating a abstract method
    abstract public void display();
    // Method to get name
    public String getName(){
        return name;
    }
    // Method to get salary
    public double getSalary(){
        return salary;
    }
}
