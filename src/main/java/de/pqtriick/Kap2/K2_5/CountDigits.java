package de.pqtriick.Kap2.K2_5;

import java.util.Scanner;

//Man könnte das hier viel besser Lösen, if-else ist in der Aufgabe jedoch gefordert.
public class CountDigits {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Bitte positive max. 5-Stellige Ganzzahl eingeben: ");
        int input = scanner.nextInt();
        if (input < 0 || input > 99999) {
            System.out.println("Error!");
        } else if (input / 10000 > 0) {
            System.out.println("Ihre Zahl hat 5 Stellen!");
        } else if (input / 1000 > 0) {
            System.out.println("Ihre Zahl hat 3 Stellen!");
        } else if (input / 100 > 0) {
            System.out.println("Ihre Zahl hat 3 Stellen!");
        } else if (input / 10 > 0) {
            System.out.println("Ihre Zahl hat 2 Stellen!");
        } else {
            System.out.println("Ihre Zahl hat 1 Stelle!");
        }
    }
}
