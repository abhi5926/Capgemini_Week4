package setinterface.checkiftwoseatsareequal;
import java.util.Collections;
import java.util.HashSet;

public class TwoSetsEqual {

    // Creating method to compare two sets
    public static boolean compareSet(HashSet<Integer> set1,HashSet<Integer> set2){
        if(set1.equals(set2)){
            return true;
        }
        return false;
    }
    public static void main(String[] args) {

        // Creating Set1 of type HashSet
        HashSet<Integer> set1 = new HashSet<>();

        // Add items in set1
        set1.add(1);
        set1.add(2);
        set1.add(3);

        // Creating set2 of type HashSet
        HashSet<Integer> set2 = new HashSet<>();

        // Add items in set2
        set2.add(1);
        set2.add(2);
        set2.add(3);

        // Storing result in variable name result
        boolean result = compareSet(set1,set2);

        // display result
        System.out.println(result);

    }
}
