import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        Stack<String> stringStack = new Stack<>();
        stringStack.push("Ayah");
        stringStack.push("Noor");
        stringStack.push("Raghad");
        stringStack.push("Yasmeen");
        stringStack.push("Who");
        System.out.println(stringStack);
        stringStack.pop();
        stringStack.pop();
        System.out.println(stringStack);
        System.out.println(stringStack.size());
    }
}