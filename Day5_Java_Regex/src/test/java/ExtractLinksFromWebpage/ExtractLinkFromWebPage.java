package ExtractionProblemTesting.ExtractLinksFromWebpage;

import extractionproblems.extractlinksfromawebpage.ExtractLinksFromWebpage;
import org.junit.jupiter.api.Test;

public class ExtractLinkFromWebPage {
    @Test
    public void extractLinkFromWebPage(){
        // Creating String
        String str ="";

        // Creating class Object
        ExtractLinksFromWebpage ob = new ExtractLinksFromWebpage();

        // Method calling
        ob.extractLinkFromWebPage(str);
    }
}
