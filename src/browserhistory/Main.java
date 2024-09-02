package browserhistory;

public class Main {
    public static void main (String[] args) {

        History browserHistory = new History(5);

        String firstURL = "https://github.com";

        String secondURL = "http://joaozinhogameplay.net";

        String thirdURL = "http://www.baixefilmesgratisnaoevirus.com.br";

        String fourthURL = "https://www.netflix.com";

        String fifthURL = "https://www.gov.br";

        browserHistory.add(firstURL);
        browserHistory.add(secondURL);
        browserHistory.add(thirdURL);
        browserHistory.add(fourthURL);
        browserHistory.add(fifthURL);

        browserHistory.print();

        System.out.println();

        Node removedURL = browserHistory.remove(3);
        System.out.println("Removed url: " + removedURL.data);

        System.out.println();

        System.out.println("History without the fourth url");

        browserHistory.print();

        browserHistory.add(fourthURL);
        browserHistory.add("https://www.w3c.org");

        System.out.println();

        System.out.println("Browser history overloaded");
        System.out.println("size " + browserHistory.size);
        System.out.println("count " + browserHistory.count);
        browserHistory.print();


    }
}
