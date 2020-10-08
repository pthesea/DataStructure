package Queue;

public interface QueueProtocol {
    public void enqueue(Integer value);
    public Integer dequeue();

    public boolean isFull();
    public boolean isEmpty();

    public void print();
}
