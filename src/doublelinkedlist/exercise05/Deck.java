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

    public Node remove(int index) {
        Node current;

        try {
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

        } catch (IndexOutOfBoundsException e) {
            e.printStackTrace();
        }

        return null;
    }

    public void arrange() {
        Node current = this.head;

        Node index = current.next;

        while (current.next != null) {
            if (current.data.id > index.data.id) {
                current.data = index.data;

                current = current.next;

                index = index.next;
            }
            current = current.next;

            index = index.next;
        }
    }

    public void print() {
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
