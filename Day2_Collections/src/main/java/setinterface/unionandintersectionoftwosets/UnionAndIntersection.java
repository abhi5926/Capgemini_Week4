package setinterface.unionandintersectionoftwosets;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class UnionAndIntersection {
    // Method to calculate Union
    public static HashSet<Integer> UnionCalculate(HashSet<Integer> set1,HashSet<Integer> set2){
        // Creating result Hashset
        HashSet<Integer> result = new HashSet<>();

        result.addAll(set1);
        result.addAll(set2);
        return result;
    }
    // Creating Method to calculate Intersection
    public static List<Integer> calculateIntersection(HashSet<Integer> set1,HashSet<Integer> set2){
        // Creating list to store intersection element
        List<Integer> list = new ArrayList<>();

        for(Integer el : set1){
            if(set2.contains(el)){
                list.add(el);
            }
        }
        return list;
    }

    public static void main(String[] args) {
        // Creating Set1
        HashSet<Integer> set1 = new HashSet<>();

        // Creating set2
        HashSet<Integer> set2 = new HashSet<>();

        // Adding element in set1
        set1.add(1);
        set1.add(2);
        set1.add(3);

        // Adding element in set2
        set2.add(3);
        set2.add(4);
        set2.add(5);

        // storing result union
        HashSet<Integer> result = new HashSet<>();

        // calling method for union
        result = UnionCalculate(set1,set2);

        // Creating list to store intersection method result
        List<Integer> list = new ArrayList<>();

        list = calculateIntersection(set1,set2);

        // Display Union
        System.out.println("The union of two sets :"+result);

        // Display Intersection
        System.out.println("Intersection of two sets :"+list);
    }
}
