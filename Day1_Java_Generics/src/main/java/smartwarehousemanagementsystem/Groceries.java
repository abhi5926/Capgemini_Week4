package smartwarehousemanagementsystem;

public class Groceries extends WarehouseItem{

    // Expiry dates of the item
    private String expiryDate;

    // Creating Constructor
    public Groceries(String name,int id,String expiryDate){
         super(name,id);
         this.expiryDate = expiryDate;
    }

    // implementing abstract method
    public void display(){
        System.out.println("The name of the Grocery Item : "+getName());
        System.out.println("The Id of the Product is : "+getId());
        System.out.println("The Expiry Date of The Grocery Item : "+ expiryDate);
    }

}
