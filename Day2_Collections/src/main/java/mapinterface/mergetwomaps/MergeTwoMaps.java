package mapinterface.mergetwomaps;

import java.util.Map;
import java.util.*;

public class MergeTwoMaps {
    public static void main(String[] args) {

        // Example input maps
        Map<String, Integer> map1 = new HashMap<>();
        map1.put("A", 1);
        map1.put("B", 2);

        Map<String, Integer> map2 = new HashMap<>();
        map2.put("B", 3);
        map2.put("C", 4);

        // Merge map2 into map1, summing the values for duplicate keys
        for (Map.Entry<String, Integer> entry : map2.entrySet()) {
            map1.merge(entry.getKey(), entry.getValue(), Integer::sum);
        }

        // Print the merged map
        System.out.println(map1);  // Output: {A=1, B=5, C=4}
    }
}

