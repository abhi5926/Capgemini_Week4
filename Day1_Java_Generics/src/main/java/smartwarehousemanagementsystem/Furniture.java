package smartwarehousemanagementsystem;

public class Furniture extends WarehouseItem {
    // Creating Attribute as Material Type of furniture
    private String materialName;

    // Creating Constructor
    public Furniture(String name, int id, String materialname){
        super(name,id);
        this.materialName = materialname;
    }

    // Implementing Abstract Method of the Super class
    public void display(){
        System.out.println("The Name of the Furniture is : "+getName());
        System.out.println("The Id of the Furniture Item is : "+getId());
        System.out.println("The Material Name of the Furniture : "+materialName);
    }
}
