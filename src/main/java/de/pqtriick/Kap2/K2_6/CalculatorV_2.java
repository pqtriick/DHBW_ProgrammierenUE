package de.pqtriick.Kap2.K2_6;

import java.util.Scanner;

//Parameterbehaftetet Prozedur mit genau einem Parameter ohne manipulation globaler Variablen
//Bedeutet wir nutzen nur Variablen die in Parameter übergeben werden aber keine globalen wie zahlenFeld
public class CalculatorV_2 {

    // Globale Variable
    static int[] zahlenFeld;

    static int add(int a, int b) {
        return a+b;
    }

    static int sub(int a, int b) {
        return a-b;
    }

    static int mult(int a, int b) {
        return a*b;
    }

    static int div(int a, int b) {
        return b != 0 ? a/b : -1;
    }

    static int[] input2Ints() {
        int[] eingaben = new int[2];
        Scanner sc = new Scanner(System.in);
        System.out.println("Bitte 1. Summand eingeben: ");
        eingaben[0] = sc.nextInt();
        System.out.println("Bitte 2. Summand eingeben: ");
        eingaben[1] = sc.nextInt();
        return eingaben;
    }

    static void printResults(int[] param) {
        System.out.println(param[0] + " + " + param[1] +
                " = " + CalculatorV_2.add(param[0], param[1]));
        System.out.println(param[0] + " - " + param[1] +
                " = " + CalculatorV_2.sub(param[0], param[1]));
        System.out.println(param[0] + " * " + param[1] +
                " = " + CalculatorV_2.mult(param[0], param[1]));
        System.out.println(param[0] + " / " + param[1] +
                " = " + CalculatorV_2.div(param[0], param[1]));
    }

    public static void main(String[] args) {
        zahlenFeld = CalculatorV_2.input2Ints();
        printResults(zahlenFeld);

    }
}
