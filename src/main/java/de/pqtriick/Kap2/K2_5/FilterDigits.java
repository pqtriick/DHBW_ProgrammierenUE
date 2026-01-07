package de.pqtriick.Kap2.K2_5;

public class FilterDigits {

    public static void main(String[] args) {
        System.out.println("Folgende Zahlen sind durch 3,4,5 und 7 teilbar:");
        for (int i = 1; i < 5000; i++) {
            if (i%3 == 0 && i%4 == 0 && i%5 == 0 && i%7 == 0) {
                System.out.println(i);
            }
        }
    }
}
