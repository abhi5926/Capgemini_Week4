package replaceandmodifystrings.censorbadwordsinasentence;

public class CensorBadWordsInSentence
{
    public static void replace(String text)
    {
        String badWords = "(damn|stupid)";
        String replaceText = text.replaceAll(badWords,"****");
        System.out.println("Original :"+text);
        System.out.println("Formatted :"+replaceText);
    }
    public static void main(String[] args)
    {
        // Creating String to Enter text
        String text ="This is a damn bad example with some stupid words.";

        // Method calling
        replace(text);
    }
}
