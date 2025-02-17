package setinterface.findsubsets;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class FindSubset {
    // Method to check set1 is a subset of set2
    public static boolean checkSubset(HashSet<Integer> set1,HashSet<Integer> set2){

    int n = Math.min(set1.size(),set2.size());
    int count = 0;
       for(Integer el : set2){
           if(set1.contains(el)){
              count++;
           }else{
               continue;
           }
       }
       if(count == n){
           return true;
       }
        return false;
    }
    public static void main(String[] args) {
        // Creating set1
        HashSet<Integer> set1 = new HashSet<>();

        // Creating set2
        HashSet<Integer> set2 = new HashSet<>();

        // Adding element in set1
        set1.add(2);
        set1.add(3);

        // Adding element in set2
        set2.add(1);
        set2.add(2);
        set2.add(3);
        set2.add(4);

        // Method calling
        boolean result = checkSubset(set1,set2);

        // Display result
        System.out.println(result);
    }
}
