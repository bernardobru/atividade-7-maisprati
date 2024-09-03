package browserhistory;

public class History {

    private Node head;

    private final int size;

    private int count;

    public History (int size) {
        this.head = null;
        this.size = size;
        this.count = 0;
    }

    public void add (String url) {
        Node newNode = new Node(url);

        if (this.isFull()) {
            this.removeOldestURL();
        }

        if (this.head == null) {
            this.head = newNode;
            this.count++;
        } else {
            Node current = this.head;

            while (current.next != null) {
                current = current.next;
            }

            this.count++;

            current.next = newNode;
        }
    }

    public Node remove (int index) {

        Node current = this.head;

        if (isEmpty()) throw new IndexOutOfBoundsException("The history is empty");

        if (index == 0) {
            this.head = this.head.next;
            return current;
        }

        int count = 0;

        Node previous = null;

        while (current.next != null && count < index) {
            previous = current;
            current = current.next;
            count++;
        }

        if (previous != null) {
            previous.next = current.next;
        }

        this.count--;

        return current;
    }

    public void print () {
        Node current = this.head;

        for (int i = 0; i <= this.count; i++) {
            if (current != null) {
                System.out.println((i + 1) + "ª URL: " + current.data);
                current = current.next;
            }
        }
    }

    private boolean isEmpty () {
        return this.head == null;
    }

    private boolean isFull () {
        return this.count == this.size;
    }

    private void removeOldestURL () {
        if (!isEmpty()) {
            this.head = this.head.next;
            count--;
        }
    }
}
