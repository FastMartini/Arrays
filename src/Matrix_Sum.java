import java.util.Scanner;

public class Matrix_Sum {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        System.out.println("Enter the number of rows: ");
        int rows = scnr.nextInt();
        System.out.println("Enter the number of columns: ");
        int cols = scnr.nextInt();

        int[][] matrix = new int[rows][cols];

        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print("Element [" + i + "][" + j + "]: ");
                matrix[i][j] = scnr.nextInt();
            }
        }

        for (int[] row : matrix) {
            for (int value : row) {
                System.out.print(value + " ");
            }
            System.out.println();
        }

            int sum = 0;
            for (int[] row : matrix) {
                for (int value : row) {
                    sum += value;
                }
            }
            System.out.println("Sum: " + sum);

            scnr.close();
    }
}
