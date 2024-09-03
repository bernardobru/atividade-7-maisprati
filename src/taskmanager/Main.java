package taskmanager;

import java.util.Objects;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        TaskManager taskManager = new TaskManager();

        Scanner sc = new Scanner(System.in);

        System.out.println("Adicionar tarefas");

        System.out.println("Quantas tarefas quer adicionar? ");
        int quantity = sc.nextInt();
        sc.nextLine();

        Task newTask;

        for (int i = 0; i < quantity; i++) {
            System.out.println("Adicione uma nova tarefa: ");

            System.out.println("Tarefa: ");
            String task = sc.nextLine();

            System.out.println();

            System.out.println("Data: ");
            String date = sc.nextLine();

            newTask = new Task(task, date);
            taskManager.addTask(newTask);
        }

        System.out.println();

        System.out.println("Você concluiu alguma tarefa? ");
        String doneTask = sc.nextLine();

        if (Objects.equals(doneTask, "sim")) {
            System.out.println("Índice da tarefa: ");
            int index = sc.nextInt();
            sc.nextLine();

            Node completedTask = taskManager.completeTask(index);

            if (completedTask.getData().isDone()) {
                System.out.println("Tarefa " + index + " concluída!");
                taskManager.printTask(completedTask.getData());
            }
        } else {
            System.out.println("Nenhuma tarefa foi concluída");
        }

        System.out.println();

        System.out.println("Você quer remover alguma tarefa? ");
        String removeTask = sc.nextLine();

        if (Objects.equals(removeTask, "sim")) {
            System.out.println("Ìndice da tarefa: ");
            int index = sc.nextInt();
            sc.nextLine();

            Node removedTask = taskManager.removeTask(index);
            System.out.println("Tarefa removida: ");
            taskManager.printTask(removedTask.getData());
        } else {
            System.out.println("Nenhuma tarefa foi removida");
        }
    }
}