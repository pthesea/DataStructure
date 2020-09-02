package LinkedList;

public class LinkedList<E> implements LinkedListProtocol<E> {
    private Node<E> head;
    private int size;

    public LinkedList() {
        this.head = null;
        this.size = 0;
    }

    public void appendFirst(E value) {
        Node<E> fresh = new Node<>(value, null);
        if (head != null) {
            fresh.setNext(this.head);
        }
        this.head = fresh;
        this.size++;
    }

    public void appendAt(int index, E value) {
        if (index == 0) {
            this.appendFirst(value);
            return;
        } else if (index == this.size) {
            this.appendLast(value);
            return;
        } else if (index < 0 || index > this.size) {
            System.out.println("Index out of bounds.");
            return;
        }

        Node<E> fresh = new Node<>(value, null);
        Node<E> current = this.head;
        for(int i = 0; i < index - 1; i++) {
            current = current.getNext();
        }

        fresh.setNext(current.getNext());
        current.setNext(fresh);
        this.size++;
    }

    public void appendLast(E value) {
        if (this.head == null) {
            this.appendFirst(value);
            return;
        }

        Node<E> fresh = new Node<>(value, null);
        Node<E> current = this.head;
        while (current.getNext() != null) {
            current = current.getNext();
        }
        current.setNext(fresh);
        this.size++;
    }

    public void insertOrdered(E value) throws ClassCastException {
        if (this.isEmpty()) {
            this.appendFirst(value);
            return;
        }

        Node<E> fresh = new Node<E>(value, null);
        Node<E> current = this.head;
        Node<E> before = this.head;

        while (current.getNext() != null) {
            try {
                Integer number = (Integer) fresh.getValue();
                Integer currentNumber = (Integer) current.getValue();
                if (currentNumber > number) {
                    fresh.setNext(current);
                    before.setNext(fresh);
                    this.size++;
                    return;
                }
                before = current;
                current = current.getNext();
            } catch (Error e) {
                System.out.println("This method cannot be used into a non-Integer list.");
                throw e;
            }
        }
    }

    public E removeAt(int index) {
        if (this.isEmpty()) {
            System.out.println("Empty List.");
            return null;
        } else if (index < 0 || index > this.size) {
            System.out.println("Index out of bounds.");
            return null;
        }

        Node<E> removed;
        if (index == 0) {
            removed = this.head;
            head = removed.getNext();
        } else {
            Node<E> current = this.head;
            for (int i = 0; i < index; i++) {
                current = current.getNext();
            }
            removed = current.getNext();
            current.setNext(removed.getNext());
        }
        this.size--;
        return removed.getValue();
    }

    public void removeIfHas(E value) {
        if (this.isEmpty()) {
            System.out.println("Empty List.");
            return;
        }

        int count = 0;
        Node<E> current = this.head;
        Node<E> before = this.head;
        for (int i = 0; i < this.size; i++) {
            String str = current.getValue().toString();
            if (str.contains(value.toString())) {
                count++;
                if (current.equals(this.head)) {
                    this.head = this.head.getNext();
                    before = this.head;
                } else {
                    before.setNext(current.getNext());
                }
            } else {
                before = current;
            }
            current = current.getNext();
        }
        this.size = this.size - count;
    }


    public boolean isEmpty() {
        return this.size == 0;
    }

    public void clear() {
        this.head = null;
        this.size = 0;
    }

    public void print() {
        if (this.isEmpty()) {
            System.out.println("Empty List.");
        } else {
            Node<E> current = this.head;
            System.out.print("[");
            for (int i = 0; i < this.size; i++) {
                System.out.print(current.getValue());
                if (current.getNext() != null) {
                    System.out.print(", ");
                    current = current.getNext();
                } else {
                    System.out.print("]\n");
                }
            }
        }
    }
}
