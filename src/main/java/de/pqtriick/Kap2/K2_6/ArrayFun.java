package de.pqtriick.Kap2.K2_6;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayFun {
	
	// Globale Variablen
	static int[] arrInts = new int[20];
	static int searchNumber;
	
	// Liest solange einen ganzzahligen Suchwert von der Konsole ein
	// bis er zwischen 100 und 135 (je inklusive) liegt.
	static int inputSearchNum() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Gebe die Zahl ein die im Array gesucht werden soll");
		int num = scanner.nextInt();
		while (num < 100 || num > 135) {
			num = scanner.nextInt();
		}
		return num;
	}
	
	// initialisiert ein int-Array mit 20 Zufallszahlen >= 100 und <= 135
	// und gibt es an den Aufrufer der Methode zurück
	static int[] initArray(){
		int[] arr = new int[20];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = (int) (Math.random() * (135-100+1)+100);
		}
		return arr;
	}
	
	// Ausgabe der Array-Werte des übergebenen Arrays
	// v. links nach rechts
	// nebeneinander mit zwei Leerzeichen Abstand
	static void print(int[] parr) {
		for (int i = 0; i < parr.length; i++) {
			System.out.print(parr[i] + "  ");
		}
	}
	
	// Hauptprogramm
	public static void main(String[] args) {
		arrInts = initArray();
		//TODO
		print(arrInts);
		//TODO
		Arrays.sort(arrInts);
		//TODO
		System.out.println("Das Array wurde sortiert:");
		print(arrInts);
		//TODO
		searchNumber = inputSearchNum();
		// TODO
		// Binäre Suche	mittels java.util.binarySearch(int[], int)
		// durchführen, mit entsprechender Konsolenausgabe, die im 
		// Erfolgsfalle auch die Index-Position des Suchwerts ausgibt
		int index = Arrays.binarySearch(arrInts, searchNumber);
		if (index >= 0) {
			System.out.println("Nummer gefunden an Index : " + index);
		} else {
			System.out.println(searchNumber + " ist nicht im Array vorhanden!");
		}
	}
}

