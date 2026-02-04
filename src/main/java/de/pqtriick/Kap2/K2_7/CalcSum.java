package de.pqtriick.Kap2.K2_7;

import java.util.Scanner;

/**
 * @author C. Frese
 * DHBW Stuttgart - Vorlesung Programmieren 1
 * Aufgabengerüst zur Aufgabe 2.7.6 
 */
public class CalcSum {
	
	static int input; //globale Variable
	
		
	public static void main(String[] args) {
		input = inputInt();
		System.out.println("Ergebnis mit for-Schleife: "
				+ forSum(input));
		System.out.println("Ergebnis kleiner Gauss: "
				+ useGauss(input));
		System.out.println("Ergebnis rekursiv: "
				+ rekursiveSum(input));
	}

	static int inputInt() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Bitte int-wert angeben:");
		int num = scanner.nextInt();
		if (num < 0) {
			num = Math.abs(num);
			System.out.println("VZW wurde durchgeführt!");
		}
		return num;
	}

	static int forSum(int num) {
		int sum = 0;
		for (int i = 1; i <= num; i++) {
			sum += i;
		}
		return sum;
	}

	static int useGauss(int num) {
		int sum = 0;
		for (int i = 0; i < num; i++) {
			sum += (int) ((Math.pow(i, 2)+i)/2);
		}
		return sum;
	}

	static int rekursiveSum(int num) {
		int sum = 0;
		if (num == 0) {
			return sum;
		} else {
			sum += num;
			sum += rekursiveSum(num-1);
			return sum;
		}
	}

}