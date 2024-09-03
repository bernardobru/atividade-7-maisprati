package browserhistory;

import java.util.Objects;
import java.util.Scanner;

public class Main {
    public static void main (String[] args) {

        History browserHistory = new History(5);

        Scanner sc = new Scanner(System.in);

        System.out.println("Adicionar URLs no histórico");
        for (int i = 0; i < 5; i++) {
            System.out.println("Adicionar " + (i + 1) + "ª URL: ");
            String url = sc.nextLine();
            browserHistory.add(url);
        }

        System.out.println();

        System.out.println("Histórico: ");
        browserHistory.print();

        System.out.println();

        System.out.println("Quer remover alguma URL? ");
        String removeURL = sc.nextLine();

        if (Objects.equals(removeURL, "sim") || Objects.equals(removeURL, "Sim")) {

            System.out.println("Qual URL você deseja remover? ");
            int index = sc.nextInt();
            sc.nextLine();

            Node removedURL = browserHistory.remove(index);

            System.out.println();

            System.out.println("URL removida: ");
            System.out.println(removedURL.data);

            System.out.println();

            System.out.println("Histórico sem a URL removida: ");
            browserHistory.print();
        } else {
            System.out.println("Nada a ser removido");
        }

        System.out.println();

        System.out.println("Quer adicionar URLs? ");
        String continueAdding = sc.nextLine();

        while (Objects.equals(continueAdding, "sim") || Objects.equals(continueAdding, "Sim")) {
            System.out.println("Adicionar nova URL: ");
            String url = sc.nextLine();
            browserHistory.add(url);

            System.out.println();

            System.out.println("Quer adicionar URLs? ");
            continueAdding = sc.nextLine();
        }

        System.out.println();

        System.out.println("Histórico depois de adicionar mais que cinco URLs: ");
        browserHistory.print();
    }
}