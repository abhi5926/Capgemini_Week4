package AnnotationProblems.PracticeProblemsForCustomAnnotation.Advancelevel.ImplementaCustomCachingSystemWithCacheResult;
import java.util.HashMap;
import java.util.Map;

public class Cache {
    private Map<String, Object> cache = new HashMap<>();

    // Method to get an item from the cache
    public Object get(String key) {
        return cache.get(key);
    }

    // Method to store an item in the cache
    public void put(String key, Object value) {
        cache.put(key, value);
    }
}
