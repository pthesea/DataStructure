package Stack;

public class Stack implements StackProtocol {
    private Integer[] stack = new Integer[5];
    private int pointer;

    public Stack() {
        pointer = -1;
    }

    public void push(Integer value) {
        if (isFull()) {
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
        if (isEmpty()) {
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

    public boolean isFull() {
        if (pointer == stack.length - 1) {
            return true;
        }
        return false;
    }

    public boolean isEmpty() {
        if (pointer == -1) {
            return true;
        }
        return false;
    }

    public void print() {
        if (isEmpty()) {
            System.out.println("Empty Stack.");
        }

        for (int i = 0; i <= pointer; i++) {
            System.out.print(stack[i] + "\t");
        }
        System.out.println();
    }
}
