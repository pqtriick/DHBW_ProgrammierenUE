package de.pqtriick.Kap2.K2_5;

import java.util.Scanner;

public class KaffeSpender {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Gebe deine Auswahl an : ");
        int x = scanner.nextInt();
        switch (x) {
            case 1 -> System.out.println("Kaffe Schwarz");
            case 5 -> System.out.println("Espresso");
            case 6 -> System.out.println("Kaffee mit Rum");
            case 7 -> System.out.println("Rum mit Kaffee");
            case 8 -> System.out.println("Rum mit einer XXL Kaffeetaste");
            case 2,3,4 -> System.out.println("Aktuell nicht verfügbar");
            default -> System.out.println("Ungültige Auswahl angegeben");
        }
    }
}
