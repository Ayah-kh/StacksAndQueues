import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        LinkedStackOfStrings stack=new LinkedStackOfStrings();
        stack.push("Hello");
        stack.push("My World");
        stack.push("How");
        stack.push("Please");
        System.out.println(stack.isEmpty());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.isEmpty());

        System.out.println("-------------------");

        FixedCapacityStackOfStrings stack1=new FixedCapacityStackOfStrings(10);
        stack1.push("Hello");
        stack1.push("My World");
        stack1.push("How");
        stack1.push("Please");
        System.out.println(stack1.isEmpty());
        System.out.println(stack1.pop());
        System.out.println(stack1.pop());
        System.out.println(stack1.pop());
        System.out.println(stack1.pop());
        System.out.println(stack1.isEmpty());

        System.out.println("----------------");
        LinkedQueueOfStrings queue=new LinkedQueueOfStrings();
        queue.enqueue("Hello");
        queue.enqueue("sad");
        queue.enqueue("happy");
        queue.enqueue("world");
        queue.enqueue("!!!");
        System.out.println(queue.isEmpty());
        System.out.println(queue.dequeue());
        System.out.println(queue.dequeue());
        System.out.println(queue.dequeue());
        System.out.println(queue.dequeue());
        System.out.println(queue.dequeue());

        System.out.println(queue.isEmpty());


    }
}