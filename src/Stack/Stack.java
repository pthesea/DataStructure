package Stack;

public class Stack implements StackBase {
    private Integer[] stack = new Integer[5];
    private int pointer;

    public Stack() {
        pointer = -1;
    }

    public void push(Integer value) {
        if (full()) {
            System.out.println("Full stack.");
            return;
        }

        for (int i = pointer; i >= 0; i--) {
            stack[i + 1] = stack[i];
        }

        stack[0] = value;
        pointer++;
    }

    public Integer pop() {
        if (empty()) {
            System.out.println("Empty Stack.");
            return null;
        }

        Integer value = stack[0];
        for (int i = 0; i < pointer; i++) {
            stack[i] = stack[i + 1];
        }
        stack[pointer--] = null;

        return value;

    }

    public boolean full() {
        if (pointer == stack.length - 1) {
            return true;
        }
        return false;
    }

    public boolean empty() {
        if (pointer == -1) {
            return true;
        }
        return false;
    }

    public void print() {
        if (empty()) {
            System.out.println("Empty Stack.");
        }

        for (int i = 0; i <= pointer; i++) {
            System.out.print(stack[i] + "\t");
        }
        System.out.println();
    }
}
