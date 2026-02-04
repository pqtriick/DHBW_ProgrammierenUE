package de.pqtriick.Kap2.K2_7;

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

}