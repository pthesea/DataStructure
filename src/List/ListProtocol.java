package List;

public interface ListProtocol<E> {

    public abstract void set(int index, E e);

    public abstract void addFirst(E e);
    public abstract void addLast(E e);
    public abstract void addBefore(int index, E e);
    public abstract void addAfter(int index, E e);

    public abstract E get(int index);
    public abstract E getFirst();
    public abstract E getLast();
    public abstract E getBefore(int index);
    public abstract E getAfter(int index);

    public abstract void remove(E e);
    public abstract void remove(int index);
    public abstract void removeFirst();
    public abstract void removeLast();

    public abstract void print();

    public  abstract boolean full();
    public abstract boolean empty();

    public abstract void clear();

}
