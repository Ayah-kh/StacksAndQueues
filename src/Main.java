public class Main {
    public static void main(String[] args) {
        StackOfObjects<String> stack = new StackOfObjects<>();
        stack.push("Hello");
        System.out.println(stack.pop());

        StackOfObjects<Integer> stack1 = new StackOfObjects<>();
        stack1.push(1);
        stack1.push(2);
        stack1.push(3);
        stack1.push(5);
        stack1.push(16);
        stack1.push(22);
        stack1.push(6);

        for (int i : stack1) {
            System.out.println(i);
        }


    }
}