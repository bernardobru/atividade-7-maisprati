package queue.exercicio08;

public class ProcessQueue {

    private Process front;

    private Process rear;

    private int size;

    public ProcessQueue() {
        this.front = null;
        this.rear = null;
        this.size = 0;
    }

    public void enqueue(String name) {
        ++size;
        Process newProcess = new Process(name);

        if (isEmpty()) {
            this.front = this.rear = newProcess;
            return;
        }

        if (this.front == this.rear) {
            this.rear = newProcess;

            this.front.next = this.rear;

            this.rear.previous = this.front;

            return;
        }

        Process temp = this.rear;

        this.rear = newProcess;

        temp.next = this.rear;

        this.rear.previous = temp;

        this.rear.next = null;
    }

    public Process execute() {

        if (isEmpty()) {
            System.out.println("Sem processos para executar!");
            return null;
        }

        if (this.front == this.rear) {
            Process processed = this.front;

            this.front = this.rear = null;

            size--;

            return processed;
        }

        if (this.front != null && this.front.next == this.rear) {
            Process processed = this.front;

            this.front = this.rear;

            this.front.next = null;

            this.rear.previous = null;

            size--;

            return processed;
        }

        Process processed = this.front;

        this.front = this.front.next;

        this.front.previous = null;

        size--;

        return processed;
    }

    public Process peek() {
        if (this.front == null) {
            return null;
        }

        return this.front;
    }

    public void show() {
        Process current = this.front;

        for (int count = 0; count < this.size; count++) {
            System.out.println(current);
            current = current.next;
        }
    }

    private boolean isEmpty() {
        return this.front == null && this.rear == null;
    }
}
