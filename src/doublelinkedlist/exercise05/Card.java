package doublelinkedlist.exercise05;

public class Card {

    protected String suit;

    protected String value;

    protected int id;

    public Card(String suit, String value) {
        this.suit = suit;

        this.value = value;

        switch (value) {
            case "A", "a":
                this.id = 1;
                break;
            case "1":
                this.id = 2;
                break;
            case "2":
                this.id = 3;
                break;
            case "3":
                this.id = 4;
                break;
            case "4":
                this.id = 5;
                break;
            case "5":
                this.id = 6;
                break;
            case "6":
                this.id = 7;
                break;
            case "7":
                this.id = 8;
                break;
            case "8":
                this.id = 9;
                break;
            case "9":
                this.id = 10;
                break;
            case "10":
                this.id = 11;
                break;
            case "J", "j":
                this.id = 12;
                break;
            case "Q", "q":
                this.id = 13;
                break;
            case "K", "k":
                this.id = 14;
                break;
        }
    }

    @Override
    public String toString() {
        return "Naipe: " + this.suit + "\n" + "Valor: " + this.value;
    }
}
