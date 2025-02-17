package aidrivenresumescreeningsystem;

public class ProductManager extends JobRole{
    private int experience;

    // Creating Constructor
    public ProductManager(String name,double salary,int experience){
        super(name, salary);
        this.experience = experience;
    }
    // Implementing abstract method
    public void display(){
        System.out.println("The name of  Product Manager:"+getName());
        System.out.println("The salary of Product Manager :"+getSalary());
        System.out.println("The Experience of Product Manager :"+experience);
    }
}
