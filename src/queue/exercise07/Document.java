package queue.exercise07;

public class Document {
    protected int pages;

    protected String content;

    protected String author;

    protected Document previous;

    protected Document next;

    public Document(int pages, String content, String author) {
        this.pages = pages;
        this.content = content;
        this.author = author;
        this.previous = null;
        this.next = null;
    }

    @Override
    public String toString() {
        return "";
    }
}
