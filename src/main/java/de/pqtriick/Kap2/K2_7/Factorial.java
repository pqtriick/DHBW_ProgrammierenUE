package de.pqtriick.Kap2.K2_7;

import java.util.Scanner;

public class Factorial {

    static int num = 0;


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Gebe Zahl an:");
        num = scanner.nextInt();
        System.out.println("Die Fakultät von " + num + " ist " + fact(num));
    }

    static int fact(int num) {
        int result;
        if (num == 0) {
            result = 1;
            System.out.println("***REKURSIONSABBRUCH***");
        } else {
            System.out.println("Sichere RSA von fact(" + num + ")");
            result = num * fact(num-1);
            System.out.println("Restauriere RSA von fact(" + num + ")");
        }
        return result;
    }

}
