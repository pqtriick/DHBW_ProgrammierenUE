package de.pqtriick.Kap2.K2_7;

public class CompareFibo {

    public static void main(String[] args) {
        System.out.println("Die ersten 40 fibonacci-Zahlen rekursiv berechnet:");
        long start = System.currentTimeMillis();
        for (int i = 0; i < 40; i++) {
            System.out.print(fibonacciRek(i)+ "  ");
        }
        long end = System.currentTimeMillis();
        System.out.println("\n**********************************");
        System.out.println("Das Programm hat " + (end-start) + "ms gebraucht");
        System.out.println("**********************************");
        start = System.currentTimeMillis();
        System.out.println("Die ersten 40 fibonacci-Zahlen iterativ berechnet:");
        for (int i = 0; i < 40; i++) {
            System.out.print(fibonacciItr(i) + "  ");
        }
        end = System.currentTimeMillis();
        System.out.println("\n**********************************");
        System.out.println("Das Programm hat " + (end-start) + "ms gebraucht");
        System.out.println("**********************************");
    }

    static int fibonacciRek(int i) {
        if (i <= 1) {
            return 1;
        }
        return fibonacciRek(i-1) + fibonacciRek(i-2);
    }

    static int fibonacciItr(int i) {
        if (i <= 1) return 1;
        int fib = 2;
        int prevFib = 1;
        for (int j = 2; j < i; j++) {
            int temp = fib;
            fib += prevFib;
            prevFib = temp;
        }
        return fib;
    }
}
