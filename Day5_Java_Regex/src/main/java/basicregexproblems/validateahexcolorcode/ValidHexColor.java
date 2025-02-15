package basicregexproblems.validateahexcolorcode;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidHexColor {
    public static void validHexcolor(String str){
        // Creating Regex
        String regex = "^#[A-Fa-f0-9]{6}$";

        // Compiling Pattern using Pattern class compile Method
        Pattern pattern = Pattern.compile(regex);

        // Methcher class Method to match String
        Matcher matcher =pattern.matcher(str);

        // Creating flag variable
        int flag = 0;
        while(matcher.find()){
            flag = 1;
        }
        if(flag == 1){
            System.out.println("Valid Hex color Code :");
        }else{
            System.out.println("Invalid Valid Hex color Code :");
        }
    }
    public static void main(String[] args) {
        // Taking String as User input
        String str = "#ff4500";

        // Caling Method
        validHexcolor(str);
    }
}
