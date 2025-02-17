package AnnotationProblems.PracticeProblemsForCustomAnnotation.Advancelevel.ImplementaCustomCachingSystemWithCacheResult;

public class ExpensiveComputation {

    // Cache instance to store results
    private static Cache cache = new Cache();

    // Method with caching applied
    @CacheResult
    public int fibonacci(int n) {
        // Check cache first
        String key = "fibonacci_" + n;
        Object cachedResult = cache.get(key);
        if (cachedResult != null) {
            System.out.println("Returning cached result for fibonacci(" + n + ")");
            return (int) cachedResult;
        }

        // Simulate an expensive computation (Fibonacci in this case)
        System.out.println("Computing fibonacci(" + n + ")");
        int result = fibonacciComputation(n);

        // Cache the result
        cache.put(key, result);
        return result;
    }

    // Actual Fibonacci computation
    private int fibonacciComputation(int n) {
        if (n <= 1) return n;
        return fibonacciComputation(n - 1) + fibonacciComputation(n - 2);
    }
}

