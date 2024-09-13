package queue.exercise06;

public class Main {
    public static void main(String[] args) {
        BankQueue queue = new BankQueue();

        queue.enqueue("joao", "pegar emprestimo de R$10.000");
        queue.enqueue("paulo", "pagar divida de R$4.215,12");
        queue.enqueue("astor", "fazer uma conta no banco");
        queue.enqueue("antonio", "fazer uma conta no banco");

        queue.show();

        System.out.println(queue.peek().name);
        System.out.println("retirado da fila: " + queue.dequeue().name);
        System.out.println(queue.peek().name);
        System.out.println("retirado da fila: " + queue.dequeue().name);
        System.out.println(queue.peek().name);
        System.out.println("retirado da fila: " + queue.dequeue().name);
        System.out.println(queue.peek().name);
        System.out.println("retirado da fila: " + queue.dequeue().name);

    }
}
