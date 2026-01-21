package de.pqtriick.Kap2.K2_6;

import java.util.Scanner;

/**
 * @author C. Frese DHBW Stuttgart - Vorlesung Programmieren 1 
 * Programmgeruest zur Aufgabe 2.6.2 Matrixaddition
 * @info Eine Typische Klausuraufgabe!
 */
public class SumOfMat {

	static int[][] matrix1; // Eingangsmatrix 1
	static int[][] matrix2; // Eingangsmatrix 2
	static int[][] resultMatrix; // Resultatsmatrix
	static int dimRows;  // Zeilendimension
	static int dimColumns; // Spaltendimension

	// TODO: Fehlende Unterprogramme codieren

	static int inputDim() {
		Scanner scanner = new Scanner(System.in);
		return scanner.nextInt();
	}

	static int[][] inputMatrix(int rows, int columns) {
		System.out.println("Bitte " + (rows*columns) + " Ganzzahlen getrennt durch ENTER eingeben:");
		Scanner scanner = new Scanner(System.in);
		int[][] matrix = new int[rows][columns];
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < columns; j++) {
				matrix[i][j] = scanner.nextInt();
			}
		}
		return matrix;
	}

	static void printMatrix(int[][] matrix) {
		for (int i = 0; i < matrix[0].length; i++) {
			for (int j = 0; j < matrix[1].length; j++) {
				System.out.print(matrix[i][j] + " ");
			}
			System.out.print("\n");
		}
	}

	static int[][] sumMatrices(int[][] matrix1, int[][] matrix2) {
		int[][] result = new int[matrix1[0].length][matrix1[1].length];
		for (int i = 0; i < matrix1[0].length; i++) {
			for (int j = 0; j < matrix1[1].length; j++) {
				result[i][j] = matrix1[i][j] + matrix2[i][j];
			}
		}
		return result;
	}
	
	// Vorgegebenes Hauptprogramm
	public static void main(String[] args) {
		System.out.println("Eingabe Zeilendimension:");
		dimRows = inputDim();
		System.out.println("Eingabe Spaltendimension:");
		dimColumns = inputDim();
		matrix1 = inputMatrix(dimRows, dimColumns);
		printMatrix(matrix1);
		System.out.println("*******************");
		matrix2 = inputMatrix(dimRows, dimColumns);
		printMatrix(matrix2);
		System.out.println("*******************");
		resultMatrix = sumMatrices(matrix1, matrix2);
		System.out.println("Ergebnis nach Matrizenaddition:");
		printMatrix(resultMatrix);
	}

}
