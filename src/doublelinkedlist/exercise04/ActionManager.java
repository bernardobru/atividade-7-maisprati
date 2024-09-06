package doublelinkedlist.exercise04;

import java.util.NoSuchElementException;

public class ActionManager {

    private Node head;

    private Node tail;

    public ActionManager() {
        this.head = null;
        this.tail = null;
    }

    public Node redo() {
        if (isEmpty()) {
            throw new NoSuchElementException("Não existe nenhuma ação para ser refeita ou desfeita!");
        }

        if (!hasNext()) {
            throw new NoSuchElementException("Não existe nenhuma ação para ser refeita!");
        }

        Node temp = this.head;

        this.head = temp.next;

        return this.head;
    }

    public Node undo() {
        if (this.isEmpty()) {
            throw new NoSuchElementException("Não existe nenhuma ação para ser refeita ou desfeita!");
        }

        Node temp = this.head;

        this.head = temp.previous;

        return temp;
    }

    public void store(String data) {
        Node newAction = new Node(data);

        if (this.isEmpty()) {
            this.head = newAction;

            this.tail = this.head;

            return;
        }

        if (this.head == this.tail) {
            Node temp = this.head;

            this.head = newAction;

            this.head.previous = temp;

            this.tail.next = this.head;

            return;
        }

        Node temp = this.head;

        this.head = newAction;

        this.head.previous = temp;

        this.head.previous.next = this.head;
    }

    //@Override
    //public String toString() {
    //    return "A cabeça da lista: " + this.head.data + "\n"
    //            + "O próximo da cabeça: " + this.head.next.data + "\n"
    //            + "O anterior da cabeça: " + this.head.previous.data;
    //}

    private boolean isEmpty() {
        return this.head == null;
    }

    public boolean hasNext() {
        return this.head.next != null;
    }

    public boolean hasPrevious() {
        return this.head.previous != null;
    }
}