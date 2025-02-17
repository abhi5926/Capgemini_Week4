package queueinterface.reverseaqueue;

import java.util.*;

public class QueueReverse {
    // Method to reverse Queue
    public static void reverseQueue(Queue<Integer> queue){
       // Creating stack and put element in stack
        Stack<Integer> stack = new Stack<>();
         stack.addAll(queue);
     // Clear data of queue
        queue.clear();
        // add element from stack to queue and pop element from stack
        while(!stack.isEmpty()){
            queue.add(stack.pop());
        }
        // display queue
        System.out.println(queue);
    }
    public static void main(String[] args) {
        // Creating Queue
        Queue<Integer> queue = new LinkedList<>();

        // Adding element in queue
        queue.add(10);
        queue.add(20);
        queue.add(30);

        // Method calling
        reverseQueue(queue);
    }
}
