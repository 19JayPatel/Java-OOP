/*
create  3x3 array and input elements 
Display elements in matrix form
Calaculate sum of all elements in the array
 */

import java.util.Scanner;

public class Demo2D4 {

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
        System.out.println("-----------------------------------");
        System.out.println("Elements in matrix form:");
        System.out.println("-----------------------------------");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(ary[i][j] + " \t ");
            }
            System.out.println();
        }

        // Calculate and display the sum of all elements
        int sum = 0;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                sum += ary[i][j];
            }
        }
        System.out.println("-----------------------------------");
        System.out.println("Sum of all elements in the array: " + sum);
    }
}
