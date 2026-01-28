package de.pqtriick.Kap2.K2_6;

public class WuerfelSpiel {

    static String spieler1 = "User";
    static String spieler2 = "Computer";
    static int ergebnis1 = 0; // User-Ergebnisse
    static int ergebnis2 = 0; // Computer-Ergebnisse

    static void wuerfel(String spieler) {
        int zahl = (int) (Math.random() * (6-1+1))+1;
        if (spieler.equals(spieler2)) {
            ergebnis2 += zahl;
            System.out.println("Der Computer würfelt eine: " + zahl);
        } else {
            ergebnis1 += zahl;
            System.out.println("Sie haben gewürfelt: " + zahl);
        }

    }

    static void auswerten() {
        if (ergebnis1 > ergebnis2) {
            System.out.println("Sie haben gewonnen mit " + ergebnis1 + " zu " + ergebnis2 + " Punkten");
        } else if (ergebnis1 == ergebnis2) {
            System.out.println("Es ist ein Unentschieden.");
        } else {
            System.out.println("Der Computer hat gewonnen mit " + ergebnis2 + " zu " + ergebnis1 + " Punkten");
        }
    }

    public static void main(String[] args) {
        System.out.println("Willkommen beim Wuerfelspiel!");
        for (int i = 0; i < 5; i++) {
            System.out.println("************************************");
            System.out.println("Runde " + (i+1));
            WuerfelSpiel.wuerfel("Computer");
            WuerfelSpiel.wuerfel("User");
        }
        System.out.println("*****************************");
        WuerfelSpiel.auswerten();
    }
}
