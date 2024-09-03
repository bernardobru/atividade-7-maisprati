package taskmanager;

public class TaskManager {

    private Node head;

    public TaskManager() {
        this.head = null;
    }

    public void addTask (Task task) {
        Node newTask = new Node(task);

        if (isEmpty()) {
            this.head = newTask;
        } else {
            Node current = this.head;

            while (current.next != null) {
                current = current.next;
            }

            current.next = newTask;
        }
    }

    public Node removeTask (int index) {
        Node current = this.head;

        if (isEmpty()) throw new IndexOutOfBoundsException("Não há tarefas!");

        if (index == 0) {
            Node removedTask = this.head;
            this.head = this.head.next;
            return removedTask;
        }

        int count = 0;

        Node previous = null;

        while (current.next != null && count < index) {
            previous = current;

            current = current.next;

            count++;
        }

        if (previous != null) {
            previous.next = current.next;
        }

        return current;
    }

    public void completeTask (Task task) {
        if (task != null) task.done = true;
    }

    public Task getTask (int index) {

        Node current = this.head;

        if (current == null) throw new IllegalArgumentException("Tarefa não pode ser null");

        int count = 0;

        while (current.next != null) {

            if (count == index) return current.data;

            count++;

            current = current.next;
        }

        throw new IndexOutOfBoundsException("Não tem índice " + count);

    }

    public void printTask (Task task) {
        if (task != null) {
            System.out.println("Tarefa: " + task.title);
            System.out.println("Data: " + task.date);
            String taskDone = task.done ? "Concluída" : "Não concluída";
            System.out.println(taskDone);
        }
        else throw new IllegalArgumentException("Tarefa não pode ser null");
    }

    private boolean isEmpty () {
        return head == null;
    }

}
