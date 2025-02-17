package smartwarehousemanagementsystem;

public class Electronics extends WarehouseItem {
    // varible to take Company name of item
    private String companyName;

    // Creating Constructor
    public Electronics(String name,int id,String companyName){
        // Calling Parent class Constructor
        super(name,id);
        this.companyName = companyName;
    }

    // Implementing the super class abstract method
    @Override
    public void display(){
        System.out.println("The Name of The Item is : "+getName());
        System.out.println("The Id of the Product : "+getId());
        System.out.println("The Name of the Company is : "+companyName);
    }

}
