import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        StackOfObjects<String> stack=new StackOfObjects<>();
        stack.push("Hello");
        System.out.println(stack.pop());


    }
}