package AnnotationProblems.SampleProblem.UseOverrideCorrectly;

public class Dog extends Animal {
    // Overriding makeSound() method
    @Override
    public void makeSound() {
        System.out.println("The dog barks.");
    }
}
