package extractionproblems.extractallemailaddressesfromatext;

import java.util.regex.Pattern;

public class ExtractAllEmailAddress {
    public static void extractAllEmailAddress(String str){
        // Creating Regex
        String regex = "^[a-zA-Z0-9_.+-]+@[a-zA-Z0-9.-_+-]+\\.[a-zA-Z]{2,}$";

        // Compiling Regex using Pattern class Compile method
        Pattern pattern = Pattern.compile(regex);

        String[] emails = str.split(" ");
        // running for each loop
        for(String email : emails){
            if(pattern.matcher(email).matches()){
                System.out.println(email);
            }
        }
    }
    public static void main(String[] args) {
        // Taking text String as Input
        String str = "Contact us at support@example.com and info@company.org";

        // Calling Method
        extractAllEmailAddress(str);
    }
}
