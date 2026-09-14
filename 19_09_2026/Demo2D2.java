// Questions:
// 1. Declare an array of 3x3
// input elements using scanner
// Display elements in matrix form

import java.util.Scanner;

public class Demo2D2 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int[][] ary = new int[3][3];

        // Input elements using scanner
        System.out.println("-----------------------------------");
        System.out.println("Enter elements for the 3x3 array:");
        System.out.println("-----------------------------------");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print("Enter element at position [" + i + "][" + j + "]: ");
                ary[i][j] = scanner.nextInt();
            }
        }

        // Display elements in matrix form
        System.out.println("Elements in matrix form:");
        System.out.println("-----------------------------------");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(ary[i][j] + " \t ");
            }
            System.out.println();
        }
        scanner.close();
    }
}
