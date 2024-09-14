package queue.exercicio08;

public class Process {
    protected String name;

    protected Process previous;

    protected Process next;

    public Process(String name) {
        this.name = name;
        this.previous = null;
        this.next = null;
    }

    @Override
    public String toString() {
        return "Processo: " + this.name;
    }
}
