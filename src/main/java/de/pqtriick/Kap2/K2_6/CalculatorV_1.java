package de.pqtriick.Kap2.K2_6;

import java.util.Scanner;

//Parameterlose Prozedur mit Manipulator globaler Variablen
public class CalculatorV_1 {

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

    static void printResults() {
        System.out.println(zahlenFeld[0] + " + " + zahlenFeld[1] +
                " = " + CalculatorV_0.add(zahlenFeld[0], zahlenFeld[1]));
        System.out.println(zahlenFeld[0] + " - " + zahlenFeld[1] +
                " = " + CalculatorV_0.sub(zahlenFeld[0], zahlenFeld[1]));
        System.out.println(zahlenFeld[0] + " * " + zahlenFeld[1] +
                " = " + CalculatorV_0.mult(zahlenFeld[0], zahlenFeld[1]));
        System.out.println(zahlenFeld[0] + " / " + zahlenFeld[1] +
                " = " + CalculatorV_0.div(zahlenFeld[0], zahlenFeld[1]));
    }

    public static void main(String[] args) {
        zahlenFeld = CalculatorV_1.input2Ints();
        printResults();

    }
}
