package listinterface.removeduplicateswhilepreservingorder;
import java.util.ArrayList;
import java.util.List;
import java.util.Collections;

public class RemoveDuplicates {
    public static List<Integer> removeDuplicate(List<Integer> list){
        // creating Result list to store unique elements
        List<Integer> result = new ArrayList<>();
       for(Integer el : list){
           if(!result.contains(el)){
               result.add(el);
           }
       }
       return result;
    }
    // main Method
    public static void main(String[] args) {
    // Creating List
        List<Integer> list = new ArrayList<>();

        // Stroing Elements in list
        list.add(3);
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(3);
        list.add(4);

        // Creating HashSet
        List<Integer> result = new ArrayList<>();

        // Storing return hashSet from Method
        result = removeDuplicate(list);

        // Display HashSet
        System.out.println(result);
    }
}
