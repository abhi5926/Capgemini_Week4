package setinterface.convertasettoasortedlist;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;

public class ConverSetToList {
    // creating Method to convert HashSet to Sorted List
    public static void converHashSetToSortedList(HashSet<Integer> set){
        // Creating list
        List<Integer> list = new ArrayList<>();
        list.addAll(set);

         // Sorting list
        Collections.sort(list);
        // Display List
        System.out.println(list);
    }
    public static void main(String[] args) {
        // Creating HasSet
        HashSet<Integer> set = new HashSet<>();

        // adding element in HashSet
        set.add(5);
        set.add(3);
        set.add(9);
        set.add(1);

        // Method Calling
        converHashSetToSortedList(set);
    }
}
