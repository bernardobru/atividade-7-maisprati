package simply_linked_list;

public class Task {

    protected String title;

    protected String date;

    protected boolean done;


    public Task (String title, String date) {
        this.title = title;
        this.date = date;
        this.done = false;
    }

    public String getTitle () {
        return this.title;
    }

    public String getDate () {
        return this.date;
    }

    public boolean isDone () {
        return this.done;
    }
}
