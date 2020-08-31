package LinkedList;

public interface LinkedListProtocol<E> {
    public void appendStart(E value);
    public void appendAt(int index, E value);
    public void appendEnd(E value);

    public abstract E removeAt(int index);
    public abstract void removeIfHas(E value);

    public abstract boolean isEmpty();
    public abstract void clear();
    public abstract void print();
}
