package LinkedList;

public class LLMain {
    public static void main(String[] args) {
        LinkedList<String> lls = new LinkedList<String>();

        System.out.println("Empty List? " + lls.isEmpty());
        lls.appendFirst("head");
        lls.print();

        lls.appendLast("tail");
        lls.print();

        lls.appendAt(1, "middle");
        lls.print();

        String removed = lls.removeAt(0);
        System.out.println("Node removed: " + removed);
        lls.print();

        lls.appendLast("new end");
        lls.print();

        lls.clear();
        lls.print();

        lls.appendLast("grape");
        lls.appendLast("apple");
        lls.appendLast("mango");
        lls.appendLast("avocado");
        lls.appendLast("banana");
        lls.print();

        lls.removeIfHas("o");
        lls.print();

        LinkedList<Integer> lli = new LinkedList<Integer>();

        lli.appendLast(1);
        lli.appendLast(2);
        lli.appendLast(4);
        lli.appendLast(7);
        lli.appendLast(9);
        lli.print();

        lli.insertOrdered(3);
        lli.insertOrdered(5);
        lli.insertOrdered(5);
        lli.print();
    }
}
