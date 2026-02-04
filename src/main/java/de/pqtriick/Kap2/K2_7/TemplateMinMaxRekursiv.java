package de.pqtriick.Kap2.K2_7;

import java.lang.reflect.Array;
import java.util.Arrays;

/**
 * @author C. Frese DHBW Stuttgart
 * Vorlesung Programmieren1 
 * Aufgabengerüst zur Aufgabe 2.7.7
 */
public class TemplateMinMaxRekursiv {

	static int[] arrInts = new int[50]; // globale Variable
	
	// TODO: Unterprogramme

	public static void main(String[] args) {
		arrInts = inputIntArray();
		printArr(arrInts);
		System.out.println("Das Maximum lautet: " + maxRek(arrInts, 0));
		System.out.println("Das Minimum lautet: " + minRek(arrInts, 0));
	}

	static int[] inputIntArray() {
		int array[] = new int[50];
		for (int i = 0; i < array.length; i++) {
			array[i] = (int) (Math.random() * (1000 +1));
		}
		return array;
	}

	static void printArr(int[] array) {
		System.out.println(Arrays.toString(array));
	}

	static int maxRek(int[] array, int index) {
		int max = Integer.MIN_VALUE;
		if (index == array.length -1) {
			return max;
		}
		int maxOfRest = maxRek(array, index+1);
		if (array[index] > maxOfRest) {
			return array[index];
		} else {
			return maxOfRest;
		}
	}

	static int minRek(int[] array, int index) {
		int min = Integer.MAX_VALUE;
		if (index == array.length -1) {
			return min;
		}
		int minOfRest = minRek(array, index+1);
		if (array[index] > minOfRest) {
			return minOfRest;
		} else {
			return array[index];
		}
	}

}