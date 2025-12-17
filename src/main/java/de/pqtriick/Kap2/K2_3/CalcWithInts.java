package de.pqtriick.Kap2.K2_3;

import java.util.Scanner;

public class CalcWithInts {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num1, num2;
        System.out.println("Bitte erste Ganzzahl eingeben:");
        num1 = scanner.nextInt();
        System.out.println("Bitte zweite Ganzzahl eingeben:");
        num2 = scanner.nextInt();
        System.out.println("Eingegeben wurden " + num1 + " und " + num2);
        System.out.println("Die Summe ergibt: " + (num1+num2));
        System.out.println("Die Differenz ergibt: " + (num1-num2));
        System.out.println("Das Produkt ergibt: " + (num1*num2));
        System.out.println("Die Ganzzahldivision ergibt: " + (num1/num2));
    }

}
