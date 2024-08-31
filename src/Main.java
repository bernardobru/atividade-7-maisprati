import simply_linked_list.Node;
import simply_linked_list.TaskManager;
import simply_linked_list.Task;
import java.util.Objects;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        TaskManager taskList = new TaskManager();

        System.out.println("Add a new task: ");
        String taskTitle = sc.nextLine();
        String taskDate = sc.nextLine();

        Task task = new Task(taskTitle, taskDate);

        taskList.addTask(task);
        taskList.printTask(task);

        System.out.println("Want to complete the task? ");
        String taskCompleted = sc.nextLine();
        taskList.completeTask(task, taskCompleted);
        System.out.println("Completed task: ");
        taskList.printTask(task);

        System.out.println();

        System.out.println("Want to remove the task? ");
        String removeTask = sc.nextLine();
        if (Objects.equals(removeTask, "yes") || Objects.equals(removeTask, "Yes")) {
            Node removedTask = taskList.removeTask(0);
            System.out.println(removedTask.getData().getTitle());
            System.out.println(removedTask.getData().getDate());
            String taskDone = removedTask.getData().isDone() ? "Task is completed" : "Task is not completed";
            System.out.println(taskDone);
        }

        System.out.println("Add a new task: ");
        String task2Title = sc.nextLine();
        String task2Date = sc.nextLine();

        Task task2 = new Task(task2Title, task2Date);

        taskList.addTask(task2);
        taskList.printTask(task2);



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