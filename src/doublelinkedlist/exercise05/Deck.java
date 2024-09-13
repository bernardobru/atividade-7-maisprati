package doublelinkedlist.exercise05;

public class Deck {

    private Node head;

    private Node tail;

    private int size;

    public Deck() {
        this.head = null;

        this.tail = null;

        this.size = 0;
    }

    public void add(Card card) {
        ++this.size;

        Node newNode = new Node(card);

        if (isEmpty()) {
            this.head = newNode;

            this.tail = this.head;

            return;
        }

        if (this.tail == this.head) {
            this.tail = newNode;

            this.head.next = this.tail;

            this.tail.previous = this.head;

            return;
        }

        Node temp = this.tail;

        this.tail = newNode;

        this.tail.previous = temp;

        this.tail.previous.next = this.tail;
    }

    public Node discard(int index) {
        Node current;

        if (index < 0) {
            throw new IndexOutOfBoundsException("Não pode existir índice negativo!");
        }

        if (index == 0) {
            this.head = this.head.next;
        }

        if (index == this.size - 1) {
            this.tail = this.tail.previous;

            Node removed = this.tail.next;

            this.tail.next = null;

            return removed;
        }

        current = this.head;

        int count = 0;

        while (current.next != null && count < index) {
            current = current.next;

            count++;
        }

        Node next = current.next;

        Node previous = current.previous;

        previous.next = next;

        if (next != null) {
            next.previous = previous;
        }

        this.size--;

        return current;
    }

    public void arrange() {
        if (isEmpty()) {
            throw new NullPointerException("A mão está vazia!");
        }

        boolean isArranged = false;

        Node current, next;

        while (!isArranged) {
            isArranged = true;

            current = this.head;

            next = this.head.next;

            while (current.next != null) {
                if (current.data.id > next.data.id) {
                    Card temp = current.data;

                    current.data = next.data;

                    next.data = temp;

                    isArranged = false;
                }
                current = current.next;

                next = next.next;
            }
        }
    }

    public void show() {
        Node current = this.head;

        int count = 0;

        while (count <= this.size - 1) {
            System.out.println(current.data.toString());
            System.out.println();
            current = current.next;
            count++;
        }
    }

    private boolean isEmpty() {
        return this.head == null && this.tail == null;
    }

}
