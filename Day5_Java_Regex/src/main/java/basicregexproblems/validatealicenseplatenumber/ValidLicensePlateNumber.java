package basicregexproblems.validatealicenseplatenumber;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidLicensePlateNumber {
    public static void validLicensePlateNumber(String str){
        // Creating Regex
        String regex = "^[A-Z]{2}+[0-9]{4}$";

        // Pattern class Compiling regex
        Pattern pattern = Pattern.compile(regex);

        // Matcher class for parforming match operation
        Matcher matcher = pattern.matcher(str);

        // Creating flag
        int flag = 0;
        while(matcher.find()){
            flag = 1;
        }
        if(flag == 1){
            System.out.println("Valid License Plate Number");
        }else{
            System.out.println("Invalid Valid License Plate Number");
        }

    }
    public static void main(String[] args) {
        // Crating String type variable to store licenec plate number
        String str = "AB1234";

        // Method calling
        validLicensePlateNumber(str);
    }
}
