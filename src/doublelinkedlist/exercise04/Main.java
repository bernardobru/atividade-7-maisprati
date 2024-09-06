package doublelinkedlist.exercise04;

import com.sun.security.jgss.GSSUtil;

import java.util.Objects;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ActionManager actMng = new ActionManager();

        Scanner sc = new Scanner(System.in);

        String addActions;
        String undoActions;
        String redoActions;

        do {
            System.out.println("Adicione ações: ");
            String action = sc.nextLine();

            System.out.println("Ação adicionada: " + action);
            actMng.store(action);

            System.out.println();

            System.out.println("Quer adicionar mais ações? ");
            addActions = sc.nextLine();

            System.out.println();
        } while (Objects.equals(addActions, "sim"));

        do {
            System.out.println("Desfaça ações: ");
            System.out.println("Ação desfeita: " + Node.getData(actMng.undo()));

            System.out.println();

            System.out.println("Quer desfazer mais ações? ");
            undoActions = sc.nextLine();

            if (!actMng.hasPrevious()) {
                System.out.println("Nada a ser desfeito!");

                System.out.println();
                break;
            }

            System.out.println();
        } while (Objects.equals(undoActions, "sim"));

        do {
            System.out.println("Refazendo ações: ");
            System.out.println("Ação refeita: " + Node.getData(actMng.redo()));

            System.out.println();

            System.out.println("Quer refazer as ações? ");
            redoActions = sc.nextLine();

            if (!actMng.hasNext()) {
                System.out.println("Nada a ser refeito!");

                System.out.println();
                break;
            }

            System.out.println();
        } while (Objects.equals(redoActions, "sim"));

    }
}
