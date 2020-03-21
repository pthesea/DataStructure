package List;

public class ListMain {
    public static void main(String[] args) {
        List list = new List();
        list.print();

        System.out.println("Preenchendo lista.");
        for (int i = 0; i <= 5; i++) {
            list.addFirst(i);
            list.print();
        }

        System.out.println("Removendo o último.");
        list.removeLast();
        list.print();

        System.out.println("Adicionando após indice 2 (posição 3 do vetor).");
        list.addAfter(2, 10);
        list.print();

        System.out.println("Removendo o primeiro.");
        list.removeFirst();
        list.print();

        System.out.println("Adicionando antes do indice 2.");
        list.addBefore(2, 20);
        list.print();

        System.out.println("Removendo no indice 0.");
        list.remove(0);
        list.print();

        System.out.println("Adicionando na última posição.");
        list.addLast(30);
        list.print();

        System.out.println("Removendo no indice 0.");
        list.remove(0);
        list.print();

        System.out.println("Adicionando o primeiro.");
        list.addFirst(40);
        list.print();

        System.out.println("Substituindo o valor do indice 0.");
        list.set(0, 50);
        list.print();

        System.out.println("Removendo no indice 3.");
        list.remove(3);
        list.print();

        System.out.println("Adicionando o objeto \"int a = 60\" como primeiro.");
        Integer a = 60;
        list.addFirst(a);
        list.print();

        System.out.println("Removendo o objeto \"a\"");
        list.remove(a);
        list.print();

        System.out.println("Removendo no indice 0.");
        list.remove(0);
        list.print();

        System.out.println("Adicionando como primeiro.");
        list.addFirst(70);
        list.print();

        System.out.println("Recebendo o valor do indice 0: " + list.get(0));
        System.out.println("Recebendo o valor após o indice 0: " + list.getAfter(0));
        System.out.println("Recebendo o valor antes do indice 1: " + list.getBefore(1));
        System.out.println("Recebendo o primeiro valor: " + list.getFirst());
        System.out.println("Recebendo o ultimo valor: " + list.getLast());

        System.out.println("Limpando o vetor.");
        list.clear();
        list.print();
    }
}
