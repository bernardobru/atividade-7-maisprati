package browserhistory;

public class History {

    private Node head;

    public final int size;

    public int count;

    public History (int size) {
        this.head = null;
        this.size = size;
        this.count = 0;
    }

    public void add (String url) {
        Node newNode = new Node(url);

        if (this.count == this.size) {
            removeOldestURL();
        }

        if (this.head == null) {
            this.head = newNode;
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
            this.head.next = this.head;
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

        for (int i = this.count; i >= 0; i--) {
            System.out.println(current.data);
            current = current.next;
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
