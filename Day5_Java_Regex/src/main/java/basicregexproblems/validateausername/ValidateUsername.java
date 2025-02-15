package basicregexproblems.validateausername;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidateUsername {
    // creating Method to check weather username is valid or not
    public static void validUsername(String str){

        // Creating Regex
        String regex = "^(?!\\d)[a-zA-Z0-9_.+-]{5,15}$";

        // Patternclass Compiling Regex
        Pattern pattern = Pattern.compile(regex);

        // Matcherclass method calling to perform match operation
        Matcher matcher = pattern.matcher(str);
       // Creating flag
        int flag = 0;
        while(matcher.find()){
            flag = 1;
        }
        if(flag == 1){
            System.out.println("Valid Username : "+str);
        }else{
            System.out.println("Invalid Username : "+str);
        }
    }
    public static void main(String[] args) {
        //Taking username as input in String
        String str = "Abhishek_123";

        // calling Method
        validUsername(str);
    }

}
