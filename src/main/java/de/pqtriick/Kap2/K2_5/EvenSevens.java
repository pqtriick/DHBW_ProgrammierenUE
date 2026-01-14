package de.pqtriick.Kap2.K2_5;

import java.util.Scanner;

public class EvenSevens {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Gebe eine Ganzzahl an, welche auch durch 7 Teilbar ist:");
        String s = scanner.next();
        if (Integer.parseInt(s) % 7 != 0 || Integer.parseInt(s) < 7) {
            System.out.println("Diese Zahl ist nicht durch 7 Teilbar.");
            return;
        }
        int sum = 0;
        for (int i = 0; i < s.length(); i++) {
            sum += Integer.parseInt(String.valueOf(s.charAt(i)));
        }
        System.out.println("Die Quersumme von " + s + " ist " + sum);
    }
}
