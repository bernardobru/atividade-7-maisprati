package taskmanager;

public class Task {

    protected String title;

    protected String date;

    protected boolean done;


    public Task (String title, String date) {
        this.title = title;
        this.date = date;
        this.done = false;
    }

    public boolean isDone () {
        return this.done;
    }
}
