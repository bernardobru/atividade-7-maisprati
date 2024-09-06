package simplylinkedlist.exercise03;

import java.util.Objects;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ActionManager undoFunction = new ActionManager();

        Scanner sc = new Scanner(System.in);

        String add;
        String undo;

        do {
            System.out.println("Adicione conteúdo para um texto: ");
            String content = sc.nextLine();

            undoFunction.store(content);

            System.out.println();

            System.out.println("Quer adicionar mais conteúdo? ");
            add = sc.nextLine();
        } while (Objects.equals(add, "sim"));

        System.out.println("Desfazendo as últimas ações: ");
        do {
            System.out.println();

            if (!undoFunction.hasNext()) {
                System.out.println("Nada a ser desfeito");
                break;
            }

            System.out.println("Ação que foi desfeita: ");
            System.out.println(undoFunction.getData(undoFunction.undo()));

            System.out.println();

            System.out.println("Quer continuar desfazendo as ações? ");
            undo = sc.nextLine();
        } while (Objects.equals(undo, "sim"));
}
}
