package de.pqtriick.Kap3.K3_1;

public class Book {

    private String title;
    private int isbn;

    public Book() {

    }

    public Book(String title, int isbn) {
        this.title = title;
        this.isbn = isbn;
    }

    public void printState() {
        System.out.println("Titel: " + title + " | " + "ISBN: " + isbn);
    }
}
