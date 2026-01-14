package de.pqtriick.Kap2.K2_5;

public class SumOfMatrixElements {

    public static void main(String[] args) {
        int[][] matrix = {{12,14,25}, {3, 432, 52}, {61,7,82}, {9,10,11}, {2,3,14}};
        System.out.println("Folgende Matrix wurde eingelesen: ");
        int sum = 0;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(matrix[i][j] + "   ");
                sum += matrix[i][j];
            }
            System.out.println();
        }
        System.out.println("Summe der Matrixelemente: " + sum);
    }
}
