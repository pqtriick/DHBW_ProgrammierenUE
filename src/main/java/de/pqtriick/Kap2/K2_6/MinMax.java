package de.pqtriick.Kap2.K2_6;

import java.util.Arrays;
import java.util.Scanner;

public class MinMax {

	static int[] arrInts; // das Array
	static int arrDim; // Kapazität des Arrays
	

	// liest die Kapazität des Arrays ein
	static int inputDim() {
		Scanner scanner = new Scanner(System.in);
		int num = scanner.nextInt();
		while(num == 0) {
			num = scanner.nextInt();
		}
		return num;

    }
	// liest arrDim-viele Zufallszahlen >= 0 und <= 1000 in ein Array ein
	static int[] inputIntArray(int dim) {
		int array[] = new int[dim];
		for (int i = 0; i < array.length; i++) {
			array[i] = (int) (Math.random() * (1000 +1));
		}
		return array;
    }
	// Gibt das Array aus
	static void printArr(int[] array) {
		System.out.println(Arrays.toString(array));
    }
	// Berechnet das Maximum
	static int max(int[] array) {
		int max = array[0];
		for (int i = 0; i < array.length; i++) {
			if (array[i] > max) {
				max = array[i];
			}
		}
		return max;
    }
	// Berechnet das Minimum
	static int min(int[] array) {
		int min = array[0];
		for (int i = 0; i < array.length; i++) {
			if (array[i] < min) {
				min = array[i];
			}
		}
		return min;
    }
	// Hauptprogramm
	public static void main(String[] args) {
		System.out.println("Eingabe Speicherkapazität:");
		arrDim = inputDim();
		arrInts = MinMax.inputIntArray(arrDim);
		MinMax.printArr(arrInts); 
		System.out.println("Das Maximum lautet: " + MinMax.max(arrInts));
		System.out.println("Das Minimum lautet: " + MinMax.min(arrInts));
	}

}



