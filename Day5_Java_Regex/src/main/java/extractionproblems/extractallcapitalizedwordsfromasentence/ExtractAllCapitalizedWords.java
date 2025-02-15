package extractionproblems.extractallcapitalizedwordsfromasentence;

import java.util.regex.Pattern;

public class ExtractAllCapitalizedWords {
    public static void extractCapitalizedWord(String str){
        // Creating regex
        String regex = "^[A-Z][A-Za-z0-9]*$";

        // Compiling pattern using Pattern class object
        Pattern pattern = Pattern.compile(regex);

        String[] words = str.split(" ");

        for(String word : words){
            if(pattern.matcher(word).matches()){
                System.out.println(word +",");
            }
        }
    }
    public static void main(String[] args) {
        // Creating String
        String text = "The Eiffel Tower is in Paris and the Statue of Liberty is in New York.";

        // Method calling
        extractCapitalizedWord(text);
    }
}
