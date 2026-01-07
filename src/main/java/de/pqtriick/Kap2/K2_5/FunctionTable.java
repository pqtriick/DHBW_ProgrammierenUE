package de.pqtriick.Kap2.K2_5;

import java.util.Scanner;

public class FunctionTable {

    public static void main(String[] args) {
        int a,b,c,d;
        long result;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Einlesen der 4 Koeffizienten!");
        System.out.println("Koeffizient a: "); a = scanner.nextInt();
        System.out.println("Koeffizient b: "); b = scanner.nextInt();
        System.out.println("Koeffizient c: "); c = scanner.nextInt();
        System.out.println("Koeffizient d: "); d = scanner.nextInt();
        System.out.println("Funktionstabelle der Funktion y = ax³ + bx² + cx +d");
        System.out.println("Eingelesene Koeffizienten: a = " + a + " b = " + b + " c = " + c + " d = " + d);
        for (int x = 0; x < 20; x++) {
            result = (long) (a*Math.pow(x, 3) + b*Math.pow(x,2) + c*x + d);
            System.out.println(x + "|" + result);
        }
    }
}
