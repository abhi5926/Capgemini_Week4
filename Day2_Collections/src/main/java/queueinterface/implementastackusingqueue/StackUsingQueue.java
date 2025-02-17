package queueinterface.implementastackusingqueue;

import java.util.LinkedList;
import java.util.Queue;

public class StackUsingQueue {

        private Queue<Integer> queue1;
        private Queue<Integer> queue2;

        // Constructor to initialize two queues
        public StackUsingQueue() {
            queue1 = new LinkedList<>();
            queue2 = new LinkedList<>();
        }

        // Push operation
        public void push(int x) {
            // Push to the first queue
            queue1.add(x);
        }

        // Pop operation
        public int pop() {
            // If queue1 is empty, throw exception
            if (queue1.isEmpty()) {
                throw new IllegalStateException("Stack is empty");
            }

            // Move all elements from queue1 to queue2, except the last one
            while (queue1.size() > 1) {
                queue2.add(queue1.poll());
            }

            // The last element in queue1 is the one we need to pop
            int topElement = queue1.poll();

            // Swap queue1 and queue2 for next operations
            Queue<Integer> temp = queue1;
            queue1 = queue2;
            queue2 = temp;

            return topElement;
        }

        // Top operation
        public int top() {
            // If queue1 is empty, throw exception
            if (queue1.isEmpty()) {
                throw new IllegalStateException("Stack is empty");
            }

            // Move all elements from queue1 to queue2, except the last one
            while (queue1.size() > 1) {
                queue2.add(queue1.poll());
            }

            // The last element in queue1 is the top element
            int topElement = queue1.peek();

            // Move the top element to queue2
            queue2.add(queue1.poll());

            // Swap queue1 and queue2 for next operations
            Queue<Integer> temp = queue1;
            queue1 = queue2;
            queue2 = temp;

            return topElement;
        }

        // Check if the stack is empty
        public boolean isEmpty() {
            return queue1.isEmpty();
        }

        public static void main(String[] args) {
            StackUsingQueue stack = new StackUsingQueue();

            // Push elements onto the stack
            stack.push(1);
            stack.push(2);
            stack.push(3);

            // Pop the top element (should return 3)
            System.out.println("Pop: " + stack.pop());  // Output: 3

            // Top element after popping (should return 2)
            System.out.println("Top: " + stack.top());  // Output: 2

            // Pop the top element (should return 2)
            System.out.println("Pop: " + stack.pop());  // Output: 2

            // Pop the top element (should return 1)
            System.out.println("Pop: " + stack.pop());  // Output: 1

            // Check if stack is empty
            System.out.println("Is stack empty? " + stack.isEmpty());  // Output: true
        }
}
