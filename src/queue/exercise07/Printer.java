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

    public void enqueue(int pages, String content, String author) {
        ++size;
        Document document = new Document(pages, content, author);

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
            throw new NoSuchElementException("Não tem mais documentos a imprimir!");
        }

        if (this.front == this.rear) {
            Document printed = this.front;

            this.front = this.rear = null;

            size--;

            System.out.println(printed.content);

            return;
        }

        if (this.front != null && this.front.next == this.rear) {
            Document printed = this.front;

            this.front = this.rear;

            this.front.next = null;

            this.rear.previous = null;

            size--;

            System.out.println(printed.content);

            return;
        }

        Document printed = this.front;

        this.front = this.front.next;

        this.front.previous = null;

        size--;

        System.out.println(printed.content);
    }

    public Document peek() {
        if (this.front == null) {
            throw new NoSuchElementException("Não há mais documentos a imprimir!");
        }

        return this.front;
    }

    public void show() {
        Document current = this.front;

        for (int count = 0; count < this.size; count++) {
            System.out.println(current);
            current = current.next;
        }
    }

    private boolean isEmpty() {
        return this.front == null && this.rear == null;
    }
}
