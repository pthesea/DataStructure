package LinkedList;

public class Node implements LinkedList<Object> {
    public Object value;
    public Node next;
    public Node previous;

    public Node(Object value, Node previous) {
        this.value = value;
        this.next = null;
        this.previous = previous;
    }

    public Node get(int index) {
        Node current = this.getHead();
        for (int i = 1; i <= index; i++) {
            if (current.next != null) {
                current = current.next;
            } else {
                return null;
            }
        }
        return current;
    }

    public void set(Object value) {
        this.value = value;
    }

    public Node getHead() {
        Node head = this;
        if (head.previous != null) {
            do {
                head = head.previous;
            } while (head.previous != null);
        }
        return head;
    }

    public Node addNext(Object value) {
        Node node = new Node(value, this);

        if (this.next == null) {
            this.next = node;
        } else {
            node.next = this.next;
            this.next = node;
        }

        return node;
    }

    public Node addPrevious(Object value) {
        Node node = new Node(value, this.previous);

        if (this.previous == null){
            this.previous = node;
        } else {
            this.previous.next = node;
        }
        node.next = this;

        return node;
    }

    public Node remove() {
        this.previous.next = this.next;
        this.next.previous = this.previous;
        return this;
    }

    public int count() {
        Node current = this;
        int count = 1;
        do {
            if (current.previous != null) {
                count++;
                current = current.previous;
            }
        }   while (current.previous != null);

        current = this;
        do {
            if (current.next != null) {
                count++;
                current = current.next;
            }
        }   while (current.next != null);

        return count;
    }

    public void print() {
        Node current = this.getHead();
        do {
            if (current.next != null) {
                System.out.print(current.value + "\t");
                current = current.next;
            }
        } while (current.next != null);
        System.out.println(current.value);
    }
}
