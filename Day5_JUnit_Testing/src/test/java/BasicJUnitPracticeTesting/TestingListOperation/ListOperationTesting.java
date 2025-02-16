package BasicJUnitPracticeTesting.TestingListOperation;

import BasicJUnitPractice.TestingListOperations.ListOperation;
import BasicJUnitPractice.TestingStringUtilityMethods.StringUtility;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertTrue;


public class ListOperationTesting {
    private ListOperation ob;
    private List<Integer> numbers;

    @BeforeEach
    public void setUp() {
        ob = new ListOperation();
        numbers = new ArrayList<>();

    }
    @Test
    public void testaddelement(){
        ob.addElement(numbers,5);
    }
    @Test
    public void testRemoveelement(){
        ob.removeElement(numbers,1);
    }
}
