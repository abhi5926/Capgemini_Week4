package smartwarehousemanagementsystem;

abstract public class WarehouseItem {
    // Attributes of WarehouseItem
    private String name;
    private int id;

    // Creating Constructor
    public WarehouseItem(String name,int id){
        this.name = name;
        this.id = id;
    }

    // abstract method to display
    abstract public void display();

    // Getter Method to get name
    public String getName(){
        return name;
    }

    // Getter Method to get Id
    public int getId(){
        return id;
    }
}
