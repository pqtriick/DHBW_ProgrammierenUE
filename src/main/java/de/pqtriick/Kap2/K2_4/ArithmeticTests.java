package de.pqtriick.Kap2.K2_4;

import java.util.Scanner;

public class ArithmeticTests {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Double1:");
        double input1 = scanner.nextDouble();
        System.out.println("Double2:");
        double input2 = scanner.nextDouble();
        System.out.println(" + " + (input1+input2));
        System.out.println(" - " + (input1-input2));
        System.out.println(" * " + (input1*input2));
        System.out.println(" / " + (input1/input2));
        System.out.println(" % " + (input1%input2));
    }
}
