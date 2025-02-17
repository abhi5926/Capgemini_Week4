package listinterface.findthenthelementfromend;
import java.util.Collections;
import java.util.LinkedList;
public class FindElementFromEnd {
    public static void main(String[] args) {
        // creating LinkedList
        LinkedList<Character> list = new LinkedList<>();

        // Adding elements in list
        list.add('A');
        list.add('B');
        list.add('C');
        list.add('D');
        list.add('E');

        // Taking index as input
        int n =2;
        // Display Whole list
        System.out.println(list);

        // reverse the list
        Collections.reverse(list);

        // display list and character
        Character ch = list.get(n-1);
        System.out.println(ch);
    }
}
