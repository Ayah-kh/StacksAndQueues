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

    }
}