package doublelinkedlist.exercise05;

public class Main {
    public static void main(String[] args) {

        Deck deck = new Deck();

        deck.add(new Card("copas", "3"));
        deck.add(new Card("espadas", "A"));
        deck.add(new Card("paus", "2"));
        deck.add(new Card("ouros", "Q"));
        deck.add(new Card("copas", "7"));
        deck.add(new Card("paus", "K"));
        deck.add(new Card("paus", "4"));
        deck.add(new Card("paus", "5"));
        deck.add(new Card("paus", "2"));
        deck.add(new Card("paus", "9"));
        deck.add(new Card("paus", "6"));
        deck.add(new Card("paus", "7"));
        deck.add(new Card("paus", "8"));
        deck.add(new Card("paus", "j"));

        deck.arrange();

        deck.print();
    }
}
