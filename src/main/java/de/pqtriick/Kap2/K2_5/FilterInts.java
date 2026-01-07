package de.pqtriick.Kap2.K2_5;

import java.util.Scanner;

public class FilterInts {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int valid;
        do {
            System.out.println("Gebe eine gerade Zahl zwischen 300 und 5000 an, die durch 3,5 und 7 teilbar ist");
            valid = scanner.nextInt();
        } while ((valid % 2 != 0) || (valid < 300 || valid > 5000) || (valid %3 != 0)
        && (valid%5 != 0) || (valid%7 != 0));
        System.out.println("Die eingabe " + valid + " wurde akzeptiert.");
    }
}
