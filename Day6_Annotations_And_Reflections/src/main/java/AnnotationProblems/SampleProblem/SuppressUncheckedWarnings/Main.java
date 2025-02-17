package AnnotationProblems.SampleProblem.SuppressUncheckedWarnings;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        // Using ArrayList without generics will trigger an unchecked warning
        @SuppressWarnings("unchecked")
        ArrayList list = new ArrayList();

        // Adding elements to the ArrayList
        list.add("Hello");
        list.add(123);

        // Printing the elements
        for (Object obj : list) {
            System.out.println(obj);
        }
    }
}
