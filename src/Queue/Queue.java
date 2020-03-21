package Queue;

public class Queue implements QueueBase {
    public Integer[] queue = new Integer[5];
    public int pointer;

    public Queue() {
        pointer = -1;
    }

    public void enqueue(Integer value) {
        if (full()) {
            System.out.println("Full Queue");
            return;
        }

        queue[++pointer] = value;
    }

    public Integer dequeue() {
        if (empty()) {
            System.out.println("Empty Queue.");
            return null;
        }
        int value = queue[0];
        for (int i = 1; i < pointer; i++) {
            queue[i] = queue[i + 1];
        }
        queue[pointer--] = null;

        return value;
    }

    public boolean full() {
        return pointer == (queue.length - 1);
    }

    public boolean empty() {
        return pointer == -1;
    }

    public void print() {
        if (empty()) {
            System.out.println("Empty Queue.");
        }

        for (int i = 0; i <= pointer; i++) {
            System.out.print(queue[i] + "\t");
        }
        System.out.println();
    }
}
