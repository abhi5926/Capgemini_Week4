package listinterface.reversealist;

import java.util.*;

public class ReverseList {
    // Method
    public static List<Integer> arraylistReverse(List<Integer> arr){
        int n = arr.size();
        for(int i=0;i< n/2;i++){
            Collections.swap(arr,i,n-i-1);
        }
        return arr;
    }
    // Main Method to reverse LinkedList
    public static List<Integer> linkedListReverse(List<Integer> list){
        int n =list.size();
        for(int i=0;i<n/2;i++){
            Collections.swap(list,i,n-i-1);
        }
        return list;
    }
    public static void main(String[] args) {

        // Creating ArrayList
        List<Integer> arr = new ArrayList<>();


        // Creating LinkedList
        List<Integer> list = new LinkedList<>();

        // Storing element in Arraylist
        arr.add(1);
        arr.add(2);
        arr.add(3);
        arr.add(4);
        arr.add(5);

        // Stroring element in LinkedList
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);

        // Method calling to reverse ArrayList
        arraylistReverse(arr);
        System.out.println("Reversed ArrayList Elements :");
        System.out.println(arr);

        // Method calling to Reverse LinkedList
        linkedListReverse(list);
        System.out.println("Reversed LinkedList Elements :");
        System.out.println(list);
    }
}

