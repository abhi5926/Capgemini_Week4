package mapinterface.givethekeywiththehighestvalue;

import java.util.HashMap;
import java.util.Map;

public class HighestValueKey {
    public static void highestValueKey(Map<String,Integer> map){
        String maxKey = "";
        int maxValue = -1;
        for(var el : map.entrySet()){
            if(el.getValue() > maxValue){
                maxValue = el.getValue();
                maxKey = el.getKey();
            }
        }
        System.out.println(maxKey);
    }
    public static void main(String[] args) {
        // Creating Map
        Map<String,Integer> map = new HashMap<>();

        // Storing data in HashMap
        map.put("A",10);
        map.put("B",20);
        map.put("C",15);

        // Method call
        highestValueKey(map);
    }
}
