package replaceandmodifystrings.replacemultiplespaceswithasinglespace;

public class ReplaceMultipleSpacesWithSingleSpace {
    public static void replace(String text){
        String replaceText = text.replaceAll("\\s+"," ");
        System.out.println("Original :"+text);
        System.out.println("Formatted :"+replaceText);
    }
    public static void main(String[] args) {
        // Creating String to Enter text
        String text ="This is an example with multiple spaces.";

        // Method calling
        replace(text);
    }
}
