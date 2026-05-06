package de.pqtriick.Kap3.K3_1;

public class BookApp {

    public static void main(String[] args) {
        Book book1 = new Book();
        Book book2 = new Book("titel", 123456);

        book1.printState();
        book2.printState();
    }
}
