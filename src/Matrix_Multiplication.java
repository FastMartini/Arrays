import java.util.Scanner;

public class Matrix_Multiplication {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        System.out.println("Let m equal the row(s) for A. Enter number for m : ");
        int m = scnr.nextInt();
        System.out.println("let n equal the column(s) for A & the row(s) for B. Enter number for n: ");
        int n = scnr.nextInt();
        System.out.println("Let p equal the column(s) for B. Enter number for b:");
        int p = scnr.nextInt();
//-------------------------------------------------------------------------------------------------------
        int[][] A = new int[m][n];
        int[][] B = new int[n][p];
//-------------------------------------------------------------------------------------------------------
        int[][] C = new int [m][p];

        System.out.println("Enter the elements of A:");
        for (int i = 0; i < m; i++) {
            for (int k = 0; k < n; k++) {
                System.out.print("Element [" + i + "][" + k + "]: ");
                A[i][k] = scnr.nextInt();
            }
        }

        System.out.println("Enter the elements of B:");
        for (int k = 0; k < n; k++) {
            for (int j = 0; j < p; j++) {
                System.out.print("Element [" + k + "][" + j + "]: ");
                B[k][j] = scnr.nextInt();
            }
        }

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < p; j++) {
                for (int k = 0; k < n; k++) {
                    C[i][j] += A[i][k] * B[k][j];
                }
            }
        }

//-------------------------------------------------------------------------------------------------------

        System.out.println("Matrix A: ");
        for (int[] row : A) {
            for (int value : row) {
                System.out.print(value + " ");
            }
            System.out.println();
        }

        System.out.println("Matrix B: ");
        for (int[] row : B) {
            for (int value : row) {
                System.out.print(value + " ");
            }
            System.out.println();
        }

        System.out.println("Product of A and B:");
        for (int[] row : C) {
            for (int value : row) {
                System.out.print(value + " ");
            }
            System.out.println();
        }

        scnr.close();
    }
}
