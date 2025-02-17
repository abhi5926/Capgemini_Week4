package listinterface.rotateelementinalist;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class RotateElementInList {
    // Method To Rotate List
    public static List<Integer> rotateList(List<Integer> list,int rotate){
        List<Integer> temp1 = new ArrayList<Integer>();
        List<Integer> temp2 = new ArrayList<Integer>();

        int number = list.size();

        // adding rotated element in temp1 list
       for(int i=0;i<rotate;i++){
           int temp = list.get(i);
           temp1.add(temp);
       }

        // adding rotated element in temp2 list
        for(int i=rotate;i<number;i++){
            int temp = list.get(i);
            temp2.add(temp);
        }

        // Creating Result list
        List<Integer> result = new ArrayList<>();

        // Copying all the element in result list
        result.addAll(temp2);
        result.addAll(temp1);

        return result;
    }
    public static void main(String[] args) {
        // Creating List
        List<Integer> list = new ArrayList<>();

        // Adding elements in list
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);
        // Taking Number as input to rotate list
        int rotate = 2;

        // Creating Result list
        List<Integer> result = new ArrayList<>();

        // Calling Mdethod to rotate
        result = rotateList(list,rotate);

        // Display the List
        System.out.println("Rotated List :");
        System.out.println(result);
    }
}
