package de.pqtriick.Kap2.K2_5;

import java.util.Scanner;

public class MonthsChecker {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Gebe einen Monat an (Zahl): ");
        int i = scanner.nextInt();
        switch (i) {
            case 1, 3, 5, 7, 8, 10, 12 -> System.out.println("Dieser Monat hat 31 Tage");
            case 4, 6, 9, 11 -> System.out.println("Dieser Monat hat 30 Tage");
            case 2 -> System.out.println("Dieser Monat hat grundsätzlich 28 Tage, kann aber auch 29 Tage haben.");
            default -> System.out.println("Die Zahl muss zwischen 1 und 12 liegen!");
        }
    }
}
