/*
Q3 - Create a jagged array and find the maximum
     element from the entire jagged array.
 */

import java.util.Scanner;

public class JaggedArrayMaximum {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[][] jaggedArray = new int[3][];

        jaggedArray[0] = new int[2];
        jaggedArray[1] = new int[3];
        jaggedArray[2] = new int[4];

        // Input values row wise
        for (int i = 0; i < jaggedArray.length; i++) {

            System.out.println("\nEnter " + jaggedArray[i].length
                    + " elements for row " + (i + 1) + ":");

            for (int j = 0; j < jaggedArray[i].length; j++) {
                jaggedArray[i][j] = sc.nextInt();
            }
        }

        // Display jagged array
        System.out.println("\nJagged Array:");

        for (int i = 0; i < jaggedArray.length; i++) {

            for (int j = 0; j < jaggedArray[i].length; j++) {
                System.out.print(jaggedArray[i][j] + "\t");
            }

            System.out.println();
        }

        // Find maximum element
        int max = jaggedArray[0][0];

        for (int i = 0; i < jaggedArray.length; i++) {

            for (int j = 0; j < jaggedArray[i].length; j++) {

                if (jaggedArray[i][j] > max) {
                    max = jaggedArray[i][j];
                }
            }
        }

        System.out.println("\nMaximum element = " + max);
    }
}
