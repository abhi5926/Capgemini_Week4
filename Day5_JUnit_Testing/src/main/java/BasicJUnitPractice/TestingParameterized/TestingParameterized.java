package BasicJUnitPractice.TestingParameterized;

public class TestingParameterized {
    // Method to check if a number is even
    public static boolean isEven(int number) {
        return number % 2 == 0;
    }

    public static void main(String[] args) {
        // Method calling
        System.out.println(isEven(6));
    }
}
