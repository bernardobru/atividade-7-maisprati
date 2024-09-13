package queue.exercise07;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Printer printer = new Printer();

        Scanner sc = new Scanner(System.in);

        printer.enqueue(5, "lorem ipsum dolor sit amet", "fulano ipsum da silva");
        printer.enqueue(3, "rhgwegrh eghdn sg nteh ae e", "qwerty asgwaer");

        printer.print();
        printer.print();
    }
}
