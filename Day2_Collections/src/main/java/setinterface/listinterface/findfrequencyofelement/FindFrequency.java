package listinterface.findfrequencyofelement;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

public class FindFrequency {
    // Method to count Frequency in HashMap and Return the HashMap
    public static HashMap<String,Integer> frequency(List<String> list){
        HashMap<String,Integer> map = new HashMap<>();
        for(String el : list){
            if(map.containsKey(el)){
                map.put(el,map.get(el)+1);
            }else{
                map.put(el,1);
            }
        }
        return map;
    }
    public static void main(String[] args) {
        // Creating Object of Scanner class
        Scanner sc = new Scanner(System.in);

        // Taking size of list as input
        List<String> list = new ArrayList<>();

        list.add("apple");
        list.add("banana");
        list.add("apple");
        list.add("orange");

        // Creating HashMap to store Strings and Its Frequency
        HashMap<String,Integer> map = new HashMap<>();

        // Calling Method and Storing the Return statement
        map = frequency(list);

        // Display the Map with strings and its Frequency
        System.out.println(map);

    }
}
