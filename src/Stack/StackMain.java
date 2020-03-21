package Stack;

public class StackMain {
    public static void main(String[] args) {
        Stack stack = new Stack();
        stack.print();

        for (int i = 0; i <= 5; i++) {
            stack.push(i);
            stack.print();
        }

        for (int i = 0; i <= 5; i++) {
            stack.pop();
            stack.print();
        }
    }
}
