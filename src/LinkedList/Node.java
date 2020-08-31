package LinkedList;

public class Node<E> {
    private E value;
    private Node<E> next;

    public Node(E value, Node<E> next) {
        this.value = value;
        this.next = null;
    }

    public E getValue() {
        return this.value;
    }
    public void setValue(E value) {
        this.value = value;
    }
    public Node<E> getNext() {
        return this.next;
    }
    public void setNext(Node<E> next) {
        this.next = next;
    }
}
