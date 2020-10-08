package List;

public class List implements ListProtocol<Object> {
    private Object[] list = new Object[5];
    private int pointer;

    public List() { pointer = -1; }

    public void set(int index, Object o) {
        if (index > pointer + 1 || index < 0) {
            System.out.println("Index out of bounds.");
            return;
        }

        list[index] = o;
    }

    public void addFirst(Object o) {
        if (full()) {
            System.out.println("Full List");
            return;
        }

        if (empty()) {
            list[0] = o;
            pointer++;
            return;
        }

        for (int i = pointer; i >= 0; i--) {
            list[i + 1] = list[i];
        }

        pointer++;
        list[0] = o;
    }

    public void addLast(Object o) {
        if (full()) {
            System.out.println("Full List.");
            return;
        }

        list[++pointer] = o;
    }

    public void addBefore(int index, Object o) {
        if (full()) {
            System.out.println("Full List.");
            return;
        }

        if (empty()) {
            list[0] = o;
            pointer++;
            return;
        }

        if (index >= 0 && index > pointer + 1) {
            System.out.println("Index out of bounds.");
            return;
        }

        for (int i = pointer; i >= index - 1; i--) {
            list[i + 1] = list[i];
        }
        list[index - 1] = o;
        pointer++;
    }

    public void addAfter(int index, Object o) {
        if (full()) {
            System.out.println("Full List");
            return;
        }

        if (empty()) {
            list[0] = o;
            pointer++;
            return;
        }

        if (index > pointer || index < 0) {
            System.out.println("Index out of bounds.");
            return;
        }

        for (int i = pointer; i > index; i--) {
            list[i + 1] = list[i];
        }

        list[index + 1] = o;
        pointer++;
    }

    public Object get(int index) {
        if (empty()) {
            System.out.println("Empty List");
            return null;
        }

        if (index > pointer || index < 0) {
            System.out.println("Index out of bounds.");
            return null;
        }

        return list[index];
    }

    public Object getFirst() {
        if (empty()) {
            System.out.println("Empty List");
            return null;
        }

        return list[0];
    }

    public Object getLast() {
        if (empty()) {
            System.out.println("Empty List");
            return null;
        }

        return list[pointer];
    }

    public Object getBefore(int index) {
        if (empty()) {
            System.out.println("Empty List");
            return null;
        }

        if (index > pointer + 1 || index < 0) {
            System.out.println("Index out of bounds.");
            return null;
        }

        return list[index - 1];
    }

    public Object getAfter(int index) {
        if (empty()) {
            System.out.println("Empty List");
            return null;
        }

        if (index > pointer - 1 || index < 0) {
            System.out.println("Index out of bounds.");
            return null;
        }

        return list[index + 1];
    }

    public void remove(Object o) {
        if (empty()) {
            System.out.println("Empty List.");
            return;
        }

        for (int i = 0; i <= pointer; i++) {
            if (list[i] == o) {
                for (int j = i; j < pointer; j++) {
                    list[j] = list[j + 1];
                }
                break;
            }
        }

        list[pointer--] = null;
    }

    public void remove(int index) {
        if (empty()) {
            System.out.println("Empty List");
        }

        if (index > pointer || index < 0) {
            System.out.println("Index out of bounds.");
            return;
        }

        for (int i = index; i < pointer; i++) {
            list[i] = list[i + 1];
        }

        list[pointer--] = null;
    }

    public void removeLast() {
        if (empty()) {
            System.out.println("Empty List.");
            return;
        }

        list[pointer--] = null;
    }

    public void removeFirst() {
        if (empty()) {
            System.out.println("Empty List.");
            return;
        }

        for (int i = 0; i < pointer; i++) {
            list[i] = list[i + 1];
        }

        list[pointer--] = null;
    }

    public void print() {
        if (empty()) {
            System.out.println("Empty List.");
            return;
        }

        for (int i = 0; i <= pointer; i++) {
            System.out.print(list[i] + "\t");
        }
        System.out.println();
    }

    public boolean full() { return pointer == list.length - 1; }
    public boolean empty() { return pointer == -1; }

    public void clear() {
        for (int i = 0; i <= pointer; i++) {
            list[i] = null;
        }
        pointer = -1;
    }
}
