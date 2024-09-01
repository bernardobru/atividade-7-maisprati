import task_manager.Node;
import task_manager.TaskManager;
import task_manager.Task;
import java.util.Objects;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        TaskManager taskList = new TaskManager();

        System.out.println("Add a new task: ");
        String taskTitle = sc.nextLine();
        String taskDate = sc.nextLine();

        Task task1 = new Task(taskTitle, taskDate);
        Task task2 = new Task("nao sei o que", "20/10/2022");
        Task task3 = new Task("sei o que la", "23/12/5312");

        taskList.addTask(task1);
        taskList.addTask(task2);
        taskList.addTask(task3);
        taskList.printTask(task1);
        System.out.println();
        taskList.printTask(task2);
        System.out.println();
        taskList.printTask(task3);

        System.out.println();

        System.out.println("Get a task by index: ");
        int index = sc.nextInt();
        taskList.printTask(taskList.getTask(index));

        System.out.println();

        System.out.println("Want to complete the task? ");
        String taskCompleted = sc.nextLine();

        System.out.println();

        if (Objects.equals(taskCompleted, "Yes")) {
            taskList.completeTask(task1);
            System.out.println("Completed task: ");
            taskList.printTask(task1);

            System.out.println();

        } else System.out.println("Task not completed");

        System.out.println();

        System.out.println("Want to remove the task? ");
        String removeTask = sc.nextLine();

        System.out.println();

        if (Objects.equals(removeTask, "yes") || Objects.equals(removeTask, "Yes")) {
            System.out.println("Removed task: ");
            Node removedTask = taskList.removeTask(0);
            taskList.printTask(removedTask.getData());
        }

    }
}