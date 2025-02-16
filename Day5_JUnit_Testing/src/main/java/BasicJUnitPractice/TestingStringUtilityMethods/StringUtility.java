package BasicJUnitPractice.TestingStringUtilityMethods;

public class StringUtility {
    // Method to reverse String
    public  String reverseString(String str){
        String rev_str ="";
        for(int i=str.length()-1;i>=0;i--){
            rev_str = rev_str+str.charAt(i);
        }
        return rev_str;
    }
    // Method to check palindrome
    public  Boolean isPalindrome(String str){
        String str_Rev = reverseString(str);
        if(str == str_Rev){
            return true;
        }
        return false;
    }
    // Method to convert String in uppercase
    public  String upperCase(String str){
        String str_Result = str.toUpperCase();
        return str_Result;
    }
    public static void main(String[] args) {
        // Taking String as input
        String str = "madam";
       // Creating Object Of the class
        StringUtility ob = new StringUtility();
        // Method calling
        System.out.println("The Reversed String is "+ob.reverseString(str));
        System.out.println("The String is palindrome or not :"+ob.isPalindrome(str));
        System.out.println("String Converted In UpperCase :"+ob.upperCase(str));

    }
}
