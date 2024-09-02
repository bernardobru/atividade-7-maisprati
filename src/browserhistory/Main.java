package browserhistory;

public class Main {
    public static void main (String[] args) {

        History browserHistory = new History(5);

        String firstURL = "https://www.github.com";

        String secondURL = "http://joaozinhogameplay.net";

        String thirdURL = "http://www.baixefilmesgratisnaoevirus.com.br";

        String fourthURL = "https://www.netflix.com";

        String fifthURL = "https://github.com";

        browserHistory.add(firstURL);
        browserHistory.add(secondURL);
        browserHistory.add(thirdURL);
        browserHistory.add(fourthURL);
        browserHistory.add(fifthURL);

    }
}
