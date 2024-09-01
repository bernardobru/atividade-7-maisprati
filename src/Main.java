import task_manager.Node;
import task_manager.TaskManager;
import task_manager.Task;
import java.util.Objects;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        String continueAddingTask;

        Scanner sc = new Scanner(System.in);

        do {

            TaskManager taskList = new TaskManager();

            System.out.println("Add a new task: ");
            String taskTitle = sc.nextLine();
            String taskDate = sc.nextLine();

            Task task = new Task(taskTitle, taskDate);

            taskList.addTask(task);
            taskList.printTask(task);

            System.out.println();

            System.out.println("Want to complete the task? ");
            String taskCompleted = sc.nextLine();

            System.out.println();

            if (Objects.equals(taskCompleted, "Yes")) {
                taskList.completeTask(task);
                System.out.println("Completed task: ");
                taskList.printTask(task);

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

            System.out.println("Want to add a new task? ");
            continueAddingTask = sc.nextLine();

        } while (Objects.equals(continueAddingTask, "yes") || Objects.equals(continueAddingTask, "Yes"));


//        System.out.println();

//        System.out.println("Completed Task: ");
//        taskList.completeTask(task);
//        taskList.printTask(task);

//        System.out.println();
//
//        System.out.println("Removed Task:");
//        Node removedTask = taskList.removeTask(0);
//        System.out.println(removedTask.getData().getTitle());
//        System.out.println(removedTask.getData().getDate());

    }
}