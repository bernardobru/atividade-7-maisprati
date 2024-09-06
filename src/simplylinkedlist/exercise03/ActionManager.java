package simplylinkedlist.exercise03;

public class ActionManager {

    private Node head;

    public ActionManager() {
        this.head = null;
    }

    public Node undo() {
        if (this.isEmpty()) return null;

        Node head = this.head;

        this.head = this.head.next;

        this.head.next = null;

        return head;
    }

    public void store(String data) {
        Node node = new Node(data);

        if (isEmpty()) {
            this.head = node;
            return;
        }

        Node temp = this.head;

        this.head = node;

        this.head.next = temp;
    }

    public String getData(Node node) {
        return node.data;
    }

    private boolean isEmpty() {
        return this.head == null;
    }

    public boolean hasNext() {
        return this.head.next != null;
    }
}
