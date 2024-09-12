package doublelinkedlist.exercise05;

public class Main {
    public static void main(String[] args) {

        Deck deck = new Deck();

        deck.add(new Card("copas", "3"));
        deck.add(new Card("espadas", "A"));
        deck.add(new Card("paus", "1"));
        deck.add(new Card("ouros", "q"));
        deck.add(new Card("copas", "7"));
        deck.add(new Card("paus", "j"));

        deck.arrange();

        deck.print();
    }
}
