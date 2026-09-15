/*
Q4 - Print the below pattern using jagged array.

1
1 2
1 2 3
1 2 3 4
 */

public class JaggedArrayPattern {

    public static void main(String[] args) {

        int[][] jaggedArray = new int[4][];

        jaggedArray[0] = new int[1];
        jaggedArray[1] = new int[2];
        jaggedArray[2] = new int[3];
        jaggedArray[3] = new int[4];

        // Store values in jagged array
        for (int i = 0; i < jaggedArray.length; i++) {

            for (int j = 0; j < jaggedArray[i].length; j++) {
                jaggedArray[i][j] = j + 1;
            }
        }

        // Display pattern
        for (int i = 0; i < jaggedArray.length; i++) {

            for (int j = 0; j < jaggedArray[i].length; j++) {
                System.out.print(jaggedArray[i][j] + " ");
            }

            System.out.println();
        }
    }
}
