import java.util.Stack;
public class StackDemo {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(23);
        stack.push(33);
        stack.push(43);
        stack.push(55);
        stack.push(33);
        stack.push(63);
        stack.push(73);
        stack.push(83);
        stack.push(93);
        stack.push(13);
        System.out.println("Elements:");
        System.out.println(stack);
        stack.pop();
        stack.pop();
        stack.pop();
        stack.pop();
        System.out.println("After remove");
        System.out.println(stack);
    }
}