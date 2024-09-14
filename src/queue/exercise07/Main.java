package queue.exercise07;

import java.util.Objects;
import java.util.Scanner;

public class Main {
    private static final String YES = "sim";

    public static void main(String[] args) {
        Printer printer = new Printer();
        Scanner sc = new Scanner(System.in);
        String adding, name, content;

        System.out.println("Adicionando documentos para imprimir");
        do {
            System.out.println("Nome do arquivo: ");
            name = sc.nextLine();
            System.out.println("Conteudo: ");
            content = sc.nextLine();

            printer.enqueue(name, content);

            System.out.println("Adicionar mais documentos? ");
            adding = sc.nextLine();

            System.out.println();
        } while (Objects.equals(adding, YES));

        System.out.println();

        System.out.println("Imprimindo documentos");
        do {
            printer.print();
        } while(printer.peek() != null);
    }
}
