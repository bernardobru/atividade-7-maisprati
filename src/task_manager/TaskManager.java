package task_manager;

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

        if (isEmpty()) throw new IndexOutOfBoundsException("There is no task in the list");

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

    public void printTask (Task task) {
        if (task != null) {
            System.out.println(task.title);
            System.out.println(task.date);
            String taskDone = task.done ? "Task is completed" : "Task is not completed";
            System.out.println(taskDone);
        }
        else throw new IllegalArgumentException("Task is null");
    }

    private boolean isEmpty () {
        return head == null;
    }

}
