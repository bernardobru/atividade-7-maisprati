package queue.exercise06;

import java.util.Objects;
import java.util.Scanner;

public class Main {
    private static final String YES = "sim";

    public static void main(String[] args) {
        BankQueue bankQueue = new BankQueue();
        Scanner sc = new Scanner(System.in);
        String adding, serving;

        System.out.println("ADICIONANDO CLIENTES NA FILA \n");
        do {
            System.out.println("Nome: ");
            String name = sc.nextLine();
            System.out.println("Demanda: ");
            String demand = sc.nextLine();

            bankQueue.enqueue(name, demand);

            System.out.println("Adicionar mais clientes? ");
            adding = sc.nextLine();
        } while (Objects.equals(adding, YES));

        System.out.println();

        System.out.println("PESSOAS NA FILA \n");
        bankQueue.show();

        System.out.println();

        System.out.println("ATENDENDO PESSOAS DA FILA \n");
        do {
            System.out.println("Cliente atendido: ");
            Costumer servedCostumer = bankQueue.dequeue();
            System.out.println(servedCostumer.toString());

            if (bankQueue.peek() == null) {
                System.out.println("A fila do banco está vazia!");
                break;
            } else {
                System.out.println("Próximo cliente: " + "\n" + bankQueue.peek().toString());
            }

            System.out.println("Atender " + bankQueue.peek().name + "? ");
            serving = sc.nextLine();
        } while (Objects.equals(serving, YES));

    }
}
