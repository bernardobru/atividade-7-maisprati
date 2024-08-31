package simply_linked_list;

public class Node {

    protected Task data;

    protected Node next;

    public Node (Task data) {
        this.data = data;
        this.next = null;
    }

    public Task getData () {
        return this.data;
    }

}
