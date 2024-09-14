package queue.exercise06;

import java.util.NoSuchElementException;

public class BankQueue {

    private Costumer front;

    private Costumer rear;

    private int size;

    public BankQueue() {
        this.front = null;
        this.rear = null;
        this.size = 0;
    }

    public void enqueue(String name, String demand) {
        ++size;
        Costumer newCostumer = new Costumer(name, demand);

        if (isEmpty()) {
            this.front = this.rear = newCostumer;
            return;
        }

        if (this.front == this.rear) {
            this.rear = newCostumer;

            this.front.next = this.rear;

            this.rear.previous = this.front;

            return;
        }

        Costumer temp = this.rear;

        this.rear = newCostumer;

        temp.next = this.rear;

        this.rear.previous = temp;

        this.rear.next = null;
    }

    public Costumer dequeue() {

        if (isEmpty()) {
            throw new NoSuchElementException("A fila do banco está vazia!");
        }

        if (this.front == this.rear) {
            Costumer dequeued = this.front;

            this.front = this.rear = null;

            size--;

            return dequeued;
        }

        if (this.front != null && this.front.next == this.rear) {
            Costumer dequeued = this.front;

            this.front = this.rear;

            this.front.next = null;

            this.rear.previous = null;

            size--;

            return dequeued;
        }

        Costumer dequeued = this.front;

        this.front = this.front.next;

        this.front.previous = null;

        size--;

        return dequeued;
    }

    public Costumer peek() {
        if (this.front == null) {
            return null;
        }

        return this.front;
    }

    public void show() {
        Costumer current = this.front;

        for (int count = 0; count < this.size; count++) {
            System.out.println(current);
            current = current.next;
        }
    }

    private boolean isEmpty() {
        return this.front == null && this.rear == null;
    }
}
