package Queue;

public class QueueMain {
    public static void main(String[] args) {
        Queue queue = new Queue();
        queue.print();

        for (int i = 0; i <= 5; i++) {
            queue.enqueue(i);
            queue.print();
        }

        for (int i = 0; i <= 5; i++) {
            queue.dequeue();
            queue.print();
        }
    }
}
