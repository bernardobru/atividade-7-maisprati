package undoredo;

public class Node {

    protected String data;

    protected Node next;

    protected Node previous;

    public Node (String data) {
        this.data = data;
        this.next = null;
        this.previous = null;
    }
}
