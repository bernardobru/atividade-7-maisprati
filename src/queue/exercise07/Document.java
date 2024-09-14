package queue.exercise07;

public class Document {
    protected String name;

    protected String content;

    protected Document previous;

    protected Document next;

    public Document(String name, String content) {
        this.name = name;
        this.content = content;
        this.previous = null;
        this.next = null;
    }

    @Override
    public String toString() {
        return "Nome do arquivo: " + this.name + "\n" +
               "Conteúdo: " + this.content + "\n";
    }
}
