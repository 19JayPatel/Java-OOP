// Q5 - Implement matrix addition and multiplication using 2D arrays.

import java.util.Scanner;

public class MatrixOperations {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of rows: ");
        int row = sc.nextInt();

        System.out.print("Enter number of columns: ");
        int col = sc.nextInt();

        int[][] a = new int[row][col];
        int[][] b = new int[row][col];

        System.out.println("\nEnter elements of Matrix A:");

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                a[i][j] = sc.nextInt();
            }
        }

        System.out.println("Enter elements of Matrix B:");

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                b[i][j] = sc.nextInt();
            }
        }

        // Matrix Addition
        int[][] sum = new int[row][col];

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                sum[i][j] = a[i][j] + b[i][j];
            }
        }

        System.out.println("\n--- Matrix Addition ---");

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.print(sum[i][j] + "\t");
            }
            System.out.println();
        }

        // Matrix multiplication needs columns of A to equal rows of B.
        // Since both matrices here are row x col, multiplication only
        // works when row == col (square matrices).
        if (row != col) {
            System.out.println("\nMatrix Multiplication is not possible (rows must equal columns).");
            return;
        }

        int[][] product = new int[row][col];

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {

                int value = 0;

                for (int k = 0; k < col; k++) {
                    value = value + a[i][k] * b[k][j];
                }

                product[i][j] = value;
            }
        }

        System.out.println("\n--- Matrix Multiplication ---");

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.print(product[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
