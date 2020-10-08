package Stack;

public interface StackProtocol {
    public void push(Integer value);
    public Integer pop();

    public boolean isFull();
    public boolean isEmpty();
    public void print();
}
