package LinkedList;

import java.util.ArrayList;
import java.util.List;

public class LinkedList<String> implements LinkedListProtocol<String> {
    private Node<String> head;
    private int size;

    public LinkedList() {
        this.head = null;
        this.size = 0;
    }

    public void appendStart(String value) {
        Node<String> fresh = new Node<>(value, null);
        if (head != null) {
            fresh.setNext(this.head);
        }
        this.head = fresh;
        size++;
    }

    public void appendAt(int index, String value) {
        if (index == 0) {
            this.appendStart(value);
            return;
        } else if (index == this.size) {
            this.appendEnd(value);
            return;
        } else if (index < 0 || index > size) {
            System.out.println("Index out of bounds.");
            return;
        }

        Node<String> fresh = new Node<>(value, null);
        Node<String> current = this.head;
        for(int i = 0; i < index - 1; i++) {
            current = current.getNext();
        }

        fresh.setNext(current.getNext());
        current.setNext(fresh);
        size++;
    }

    public void appendEnd(String value) {
        if (this.head == null) {
            this.appendStart(value);
            return;
        }

        Node<String> fresh = new Node<>(value, null);
        Node<String> current = this.head;
        while (current.getNext() != null) {
            current = current.getNext();
        }
        current.setNext(fresh);
        size++;
    }

    public String removeAt(int index) {
        if (this.isEmpty()) {
            System.out.println("Empty List.");
            return null;
        } else if (index < 0 || index > size) {
            System.out.println("Index out of bounds.");
            return null;
        }

        Node<String> removed;
        if (index == 0) {
            removed = this.head;
            head = removed.getNext();
        } else {
            Node<String> current = this.head;
            for (int i = 0; i < index; i++) {
                current = current.getNext();
            }
            removed = current.getNext();
            current.setNext(removed.getNext());
        }
        size--;
        return removed.getValue();
    }

    public void removeIfHas(String value) {
        if (this.isEmpty()) {
            System.out.println("Empty List.");
            return;
        }

        int count = 0;
        Node<String> current = this.head;
        Node<String> before = this.head;
        for (int i = 0; i < this.size; i++) {
            String str = current.getValue();
            if (str.toString().contains(value.toString())) {
                count++;
                if (current.equals(this.head)) {
                    this.head = this.head.getNext();
                    before = this.head;
                } else {
                    before.setNext(current.getNext());
                }
                current = current.getNext();
            } else {
                before = current;
                current = current.getNext();
            }
        }
        size = size - count;
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
            Node<String> current = this.head;
            System.out.print("[");
            for (int i = 0; i < size; i++) {
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
