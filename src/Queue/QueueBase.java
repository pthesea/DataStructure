package Queue;

public interface QueueBase {
    public void enqueue(Integer value);
    public Integer dequeue();

    public boolean full();
    public boolean empty();

    public void print();
}
