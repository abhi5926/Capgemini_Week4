package smartwarehousemanagementsystem;

import java.util.List;

public class SmartWarehouseSystem {
    // Method to display all the items using Wildcart
    public void displayItems(List<? extends WarehouseItem> items){
     for(WarehouseItem item : items){
         item.display();
     }
    }

    // Creating Main Method
    public static void main(String[] args) {
        // Creating object of the class Electronics
        Electronics ob = new Electronics("Mobile",123,"Samsung");

        // Creating The Object of Groceries Class
        Groceries ob1 = new Groceries("Oil",156,"12 may 2025");

        // Creating Object of the class Furniture
        Furniture ob2 = new Furniture("Chair",12,"Wooden");

        // Storing each item in Storage
        Storage<Electronics> electronics = new Storage<>();
        Storage<Groceries> groceries = new Storage<>();
        Storage<Furniture> furniture = new Storage<>();

        // adding items in Storage
        electronics.addItem(ob);
        groceries.addItem(ob1);
        furniture.addItem(ob2);

        // Creating the Object of SmartWarehouseSystem class
        SmartWarehouseSystem sm = new SmartWarehouseSystem();

        // Displaying all the Items Using WildCart
        System.out.println("Electronics Items : ");
        sm.displayItems(electronics.getItems());
        System.out.println();

        System.out.println("Groceries Items : ");
        sm.displayItems(groceries.getItems());
        System.out.println();

        System.out.println("Furniture Items : ");
        sm.displayItems(furniture.getItems());

    }
}
