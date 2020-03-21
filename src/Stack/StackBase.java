package Stack;

public interface StackBase {
    public void push(Integer value);
    public Integer pop();

    public boolean full();
    public boolean empty();

    public void print();
}
