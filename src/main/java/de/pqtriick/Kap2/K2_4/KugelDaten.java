package de.pqtriick.Kap2.K2_4;

import java.util.Scanner;

public class KugelDaten {

    public static void main(String[] args) {
        final double PI = 3.14;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Gebe den Radius der Kugel an:");
        double radius = scanner.nextDouble();
        double durchmesser = radius*2;
        //Math.round(int*100)/100.0 -> Auf 2 nachkommastellen runden
        double umfang = Math.round((2*PI*radius)*100)/100.0;
        double volumen = Math.round((0.75 * Math.pow(radius, 3) * PI)*100)/100.0;
        System.out.println("Durchmesser: " + durchmesser);
        System.out.println("Umfang: " + umfang);
        System.out.println("Volumen: " + volumen);
    }
}
