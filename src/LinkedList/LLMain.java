package LinkedList;

public class LLMain {
    public static void main(String[] args) {
        Node head = new Node(0, null);
        System.out.println("O valor da Head é: " + head.value);
        head.print();

        Node loop = head;
        for (int i = 1; i <= 9; i++) {
            loop.addNext(i);
            head.print();
            loop = loop.next;
        }
        System.out.println("Existem " + head.count() + " nós.");
        head.print();

        System.out.println("Adicionando um novo nó com o valor 100.");
        Node novo = head.next.next.next.addNext(100);

        System.out.println("Existem " + novo.count() + " nós.");
        head.print();

        loop = head;
        for (int i = 0; i <= 9; i++) {
            loop.addPrevious(i + 100);
            loop = loop.previous;
        }
        System.out.println("Existem " + head.count() + " nós.");
        head.print();

        head = novo.getHead();

        System.out.println("O novo valor da Head é: " + head.value);

        System.out.println("Removendo o nó com a mesma referência que o nó com valor 100 adicionado anteriormente.");
        novo.remove();
        head.print();
    }
}
