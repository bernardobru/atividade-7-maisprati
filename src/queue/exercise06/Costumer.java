package queue.exercise06;

public class Costumer {

    protected String name;

    protected String demand;

    protected Costumer previous;

    protected Costumer next;

    public Costumer(String name, String demand) {
        this.name = name;
        this.demand = demand;
        this.next = null;
        this.previous = null;
    }

    @Override
    public String toString() {
        return "Nome: " + this.name + "\n" +
               "Demanda: " + this.demand + "\n";
    }
}
