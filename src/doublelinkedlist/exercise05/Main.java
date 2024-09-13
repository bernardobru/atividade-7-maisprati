package doublelinkedlist.exercise05;

import java.util.Objects;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Deck deck = new Deck();

        Scanner sc = new Scanner(System.in);

        String picking, suit, value, discard, continueDiscard;

        System.out.println("Pegando cartas do baralho");
        do {
            System.out.println();

            System.out.println("Naipe: ");
            suit = sc.nextLine();

            System.out.println("Valor: ");
            value = sc.nextLine();

            deck.add(new Card(suit, value));

            System.out.println();

            System.out.println("Quer pegar mais cartas?");
            picking = sc.nextLine();

            System.out.println();
        } while (Objects.equals(picking, "sim"));

        System.out.println("Sua mão: ");
        deck.show();

        do {
            System.out.println("Descartar cartas");

            System.out.println("Você quer descartar alguma carta? ");
            discard = sc.nextLine();
            if (Objects.equals(discard, "sim")) {
                System.out.println("Selecione o índice da carta em sua mão: ");
                int index = sc.nextInt();
                sc.nextLine();
                deck.discard(index);
            }
            System.out.println();

            System.out.println("Quer descartar mais alguma carta? ");
            continueDiscard = sc.nextLine();

        } while(Objects.equals(continueDiscard, "sim"));

        System.out.println();

        System.out.println("Organizando o baralho: ");
        deck.arrange();
        deck.show();
    }
}
