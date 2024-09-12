package doublelinkedlist.exercise05;

public class Node {

    protected Node previous;

    protected Card data;

    protected Node next;

    public Node(Card data) {
        this.previous = null;

        this.data = data;

        this.next = null;
    }
}
