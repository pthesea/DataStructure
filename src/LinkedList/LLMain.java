package LinkedList;

public class LLMain {
    public static void main(String[] args) {
        LinkedList<String> ll = new LinkedList<String>();

        System.out.println("Empty List? " + ll.isEmpty());
        ll.appendStart("head");
        ll.print();

        ll.appendEnd("tail");
        ll.print();

        ll.appendAt(1, "middle");
        ll.print();

        String removed = ll.removeAt(0);
        System.out.println("Node removed: " + removed);
        ll.print();

        ll.appendEnd("new end");
        ll.print();

        ll.clear();
        ll.print();

        ll.appendEnd("grape");
        ll.appendEnd("apple");
        ll.appendEnd("mango");
        ll.appendEnd("avocado");
        ll.appendEnd("banana");
        ll.print();

        ll.removeIfHas("o");
        ll.print();

    }
}
