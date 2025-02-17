package AnnotationProblems.PracticeProblemsForCustomAnnotation.Advancelevel.ImplementaCustomCachingSystemWithCacheResult;

public class Main {

    public static void main(String[] args) {
        ExpensiveComputation computation = new ExpensiveComputation();

        // First call (this will compute the result)
        System.out.println("Result: " + computation.fibonacci(5));

        // Second call with the same argument (this will return cached result)
        System.out.println("Result: " + computation.fibonacci(5));

        // Call with a different argument (this will compute the result again)
        System.out.println("Result: " + computation.fibonacci(6));

        // Call with the same argument again (this will return cached result)
        System.out.println("Result: " + computation.fibonacci(6));
    }
}
