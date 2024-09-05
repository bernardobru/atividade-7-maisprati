package undoredo;

public class ReversionController {

    private Node head;

    public ReversionController() {
        this.head = null;
    }

    public Node undo() {

    }

    public void store(String data) {

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