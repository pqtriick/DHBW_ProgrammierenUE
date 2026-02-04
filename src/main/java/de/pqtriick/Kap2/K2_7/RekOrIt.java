package de.pqtriick.Kap2.K2_7;

import java.util.Scanner;

public class RekOrIt {

    static int num = 0;


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Gebe Zahl an:");
        num = scanner.nextInt();
        fact(num);
        System.out.println("Die Fakultät von " + num + " ist " + calcFactRek(num) + " | rekursiv");
        System.out.println("Die Fakultät von " + num + " ist " + calcFactIterative(num) + " | iterativ");
    }

    static void fact(int num) {
        if (num == 0) {
            System.out.println("***REKURSIONSABBRUCH***");
        } else {
            System.out.println("Sichere RSA von fact(" + num + ")");
            fact(num-1);
            System.out.println("Restauriere RSA von fact(" + num + ")");
        }
    }

    static int calcFactRek(int num) {
        if (num == 0) {
            return 1;
        }
        return num * calcFactRek(num-1);
    }

    static int calcFactIterative(int num) {
        int sum = 1;
        for (int i = 1; i <= num; i++) {
            sum *= i;
        }
        return sum;
    }
}
