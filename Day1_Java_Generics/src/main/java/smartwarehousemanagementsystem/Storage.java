package smartwarehousemanagementsystem;

import java.util.ArrayList;
import java.util.List;

public class Storage<T extends WarehouseItem> {
    // Creating List to Store Items
    private List<T> items;

    // Creating Constructor that Specifying The DataStructure To Store Item
    public Storage(){
        items = new ArrayList<>();
    }
    // Method To Add Items in  Arralist
    public void addItem(T item){
        items.add(item);
    }
    // Method to remove item From arrayList
    public void remove(T item){
        items.remove(item);
    }
   // Method to get Item
 public List<T> getItems(){
        return items;
 }
}
