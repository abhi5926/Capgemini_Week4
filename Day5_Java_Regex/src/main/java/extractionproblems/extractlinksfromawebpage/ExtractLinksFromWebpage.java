package extractionproblems.extractlinksfromawebpage;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ExtractLinksFromWebpage {
    public static void extractLinkFromWebPage(String text){
        // Creating Regex
        String regex ="https?://(www\\.)?([a-zA-Z0-9.-]+)";

        // Creating Pattern class Object
        Pattern pattern = Pattern.compile(regex);

        Matcher matcher = pattern.matcher(text);

        while(matcher.find()){
            System.out.println(matcher.group());
        }
    }
    public static void main(String[] args) {
        // Taking String as Input
        String text = "Visit https://www.google.com and http://example.org for more info.";

        // Method calling
        extractLinkFromWebPage(text);

    }
}
