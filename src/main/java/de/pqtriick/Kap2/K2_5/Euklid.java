package de.pqtriick.Kap2.K2_5;

import java.util.Scanner;

public class Euklid {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a,b;
        System.out.println("Gebe die erste Zahl an: ");
        a = scanner.nextInt();
        System.out.println("Gebe die zweite Zahl an: ");
        b = scanner.nextInt();
        if (a <= 0 || b <= 0) {
            System.out.println("Die Zahl muss größer als 0 sein");
        }
        while (a != b) {
            if (a > b) {
                a -= b;
            } else {
                b -= a;
            }
        }
        System.out.println("Der ggt. ist : " + a);
    }
}
