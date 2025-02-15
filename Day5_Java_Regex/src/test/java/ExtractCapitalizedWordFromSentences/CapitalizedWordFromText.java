package ExtractionProblemTesting.ExtractCapitalizedWordFromSentences;

import extractionproblems.extractallcapitalizedwordsfromasentence.ExtractAllCapitalizedWords;
import org.junit.jupiter.api.Test;

public class CapitalizedWordFromText {
    @Test
    public void capitalizedWord(){
        // Creating String
        String str = "";

        // Creating class Object
        ExtractAllCapitalizedWords ob = new ExtractAllCapitalizedWords();

        // Method calling
        ob.extractCapitalizedWord(str);
    }
}
