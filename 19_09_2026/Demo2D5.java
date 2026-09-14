
import java.util.Scanner;

/*
create  3x3 array and input elements 
Display elements in matrix form
Find the maximum and minimum elements in the array
 */
public class Demo2D5 {

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

        // Find maximum and minimum elements
        int max = ary[0][0];
        int min = ary[0][0];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (ary[i][j] > max) {
                    max = ary[i][j];
                }
                if (ary[i][j] < min) {
                    min = ary[i][j];
                }
            }
        }
        System.out.println("-----------------------------------");
        System.out.println("Maximum element in the array: " + max);
        System.out.println("Minimum element in the array: " + min);
    }
}
