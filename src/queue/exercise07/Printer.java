package queue.exercise07;

import java.util.NoSuchElementException;

public class Printer {
    private Document front;

    private Document rear;

    private int size;

    public Printer() {
        this.front = null;
        this.rear = null;
        this.size = 0;
    }

    public void enqueue(String name, String content) {
        ++size;
        Document document = new Document(name, content);

        if (isEmpty()) {
            this.front = this.rear = document;
            return;
        }

        if (this.front == this.rear) {
            this.rear = document;

            this.front.next = this.rear;

            this.rear.previous = this.front;

            return;
        }

        Document temp = this.rear;

        this.rear = document;

        temp.next = this.rear;

        this.rear.previous = temp;

        this.rear.next = null;
    }

    public void print() {
        if (isEmpty()) {
            System.out.println("Não tem mais documentos a imprimir!");
            return;
        }

        if (this.front == this.rear) {
            Document printed = this.front;

            this.front = this.rear = null;

            size--;

            System.out.println(printed);

            return;
        }

        if (this.front != null && this.front.next == this.rear) {
            Document printed = this.front;

            this.front = this.rear;

            this.front.next = null;

            this.rear.previous = null;

            size--;

            System.out.println(printed);

            return;
        }

        Document printed = this.front;

        this.front = this.front.next;

        this.front.previous = null;

        size--;

        System.out.println(printed);
    }

    public Document peek() {
        if (this.front == null) {
            System.out.println("Não há mais documentos a imprimir!");
            return null;
        }

        return this.front;
    }

    private boolean isEmpty() {
        return this.front == null && this.rear == null;
    }
}
