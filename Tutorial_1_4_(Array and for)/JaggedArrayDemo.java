/* Q1 - Create a jagged array of 3 rows where:
   1st row has 2 elements
   2nd row has 3 elements
   3rd row has 4 elements
   Fill values from the user and print the jagged array. */

import java.util.Scanner;

public class JaggedArrayDemo {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[][] jaggedArray = new int[3][];

        jaggedArray[0] = new int[2];
        jaggedArray[1] = new int[3];
        jaggedArray[2] = new int[4];

        // Input values row wise
        for (int i = 0; i < jaggedArray.length; i++) {

            System.out.println("\nEnter " + jaggedArray[i].length + " elements for row " + (i + 1) + ":");

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
    }
}
