package de.pqtriick.Kap2.K2_6;

import java.util.Scanner;

public class NumberAnalyst {

    static int number = 0;

    static int readNumber() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Bitte int-wert eingeben:");
        return Integer.parseInt(scanner.next());
    }

    static int checkNegative(int number) {
        if (number < 0) {
            System.out.println("Zahl wird positiv gemacht...");
            return number*-1;
        }
        return number;
    }

    static void checkDivisions(int number) {
        System.out.println("Ausgabe der Teiler von " + number + ":");
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                System.out.print(i + "    ");
            }
        }
        System.out.println();
    }

    static void isPrimeNumber(int number) {
        int divisions = 0;
        System.out.println("Ist " + number + " eine Primzahl?");
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                divisions += 1;
            }
        }
        if (divisions <= 2) {
            System.out.println("Ja!");
        } else {
            System.out.println("Nein!");
        }
    }

    static void printSum(int number) {
        int sum = 0;
        String s = String.valueOf(number);
        for (int i = 0; i < s.length(); i++) {
            sum += Integer.parseInt(String.valueOf(s.charAt(i)));
        }
        System.out.println("Die Quersumme von " + number + " ist " + sum);
    }

    public static void main(String[] args) {
        number = readNumber();
        number = checkNegative(number);
        checkDivisions(number);
        isPrimeNumber(number);
        printSum(number);

    }
}
