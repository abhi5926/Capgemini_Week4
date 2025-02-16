package BasicJUnitPractice.TestingListOperations;


import java.util.List;

public class ListOperation {
    // Method to add Element in list
    public void addElement(List<Integer> list, int element) {
        list.add(element);
    }
    // Method to remove element in list
    public void removeElement(List<Integer> list, int element) {
        // Remove the element if it exists
        if (list.contains(element)) {
            list.remove(Integer.valueOf(element));
        } else {
            System.out.println("Element not found in the list.");
        }
    }
    // Method to get size of list
    public int getSize(List<Integer> list) {
        return list.size();
    }

    public static void main(String[] args) {
        ListOperation manager = new ListOperation();
        List<Integer> numbers = new java.util.ArrayList<>();

        // Adding elements to the list
        manager.addElement(numbers, 10);
        manager.addElement(numbers, 20);
        manager.addElement(numbers, 30);
    }
}
