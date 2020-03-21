package LinkedList;

public interface LinkedList<E> {
    public abstract void set(E e);
    public abstract E getHead();

    public abstract E addNext(E e);
    public abstract E addPrevious(E e);

    public abstract E remove();

    public abstract int count();
    public abstract void print();
}
