package queue.exercicio08;

public class Main {
    public static void main(String[] args) {
        ProcessQueue processQueue = new ProcessQueue();

        processQueue.enqueue("Intellij");
        processQueue.enqueue("Windows Terminal");
        processQueue.enqueue("Spotify");
        processQueue.enqueue("Foxit PDF Reader");
        processQueue.enqueue("Windows File Explorer");
        processQueue.enqueue("Google Chrome");

        System.out.println("Processos: ");
        processQueue.show();

        System.out.println();

        System.out.println("Removendo processos:");

        do {
            System.out.println("Executando " + processQueue.execute());
        } while (processQueue.peek() != null);
    }
}
