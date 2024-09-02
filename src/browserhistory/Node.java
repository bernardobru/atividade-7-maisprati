package browserhistory;

public class Node {

    protected String data;

    protected Node next;

    public Node (String url) {
        this.data = url;
        this.next = null;
    }

}
