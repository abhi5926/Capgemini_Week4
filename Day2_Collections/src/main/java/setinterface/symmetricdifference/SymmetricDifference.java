package setinterface.symmetricdifference;

import java.util.ArrayList;
import java.util.HashSet;


public class SymmetricDifference {
    // Method to calculate Symmetric difference
    public static HashSet<Integer> calculateSymmetricDifference(HashSet<Integer> set1,HashSet<Integer> set2){
        // Creating HashSet to add result
        HashSet<Integer> list = new HashSet<>();
        // Stroing element in list
        list.addAll(set1);
        set1.retainAll(set2);
        list.addAll(set2);
        list.removeAll(set1);

        return list;
    }
    public static void main(String[] args) {
        // Creating set1
        HashSet<Integer> set1 = new HashSet<>();

        // Creating set2
        HashSet<Integer> set2 = new HashSet<>();

        // adding elements in set1
         set1.add(1);
         set1.add(2);
         set1.add(3);

         // adding elements in set2
         set2.add(3);
         set2.add(4);
         set2.add(5);

         // Creating HashSet to store HashSet that return by method

        HashSet<Integer> set = new HashSet<>();

        // Method calling
        set = calculateSymmetricDifference(set1,set2);

        // display the result HashSet element
        System.out.println(set);
    }
}
