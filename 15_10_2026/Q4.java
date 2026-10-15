// 2D array demo: fetch values from user, print them,
// then print in ascending order.

import java.util.Scanner;

public class Q4 {
    void main() {
        Scanner sc = new Scanner(System.in);
        int arr[][] = new int[3][3];

        IO.println("Enter 9 elements:");

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        IO.println("Original Matrix:");

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                IO.print(arr[i][j] + " ");
            }
            IO.println();
        }

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                for (int k = i; k < 3; k++) {
                    for (int l = (k == i) ? j + 1 : 0; l < 3; l++) {
                        if (arr[i][j] > arr[k][l]) {
                            int temp = arr[i][j];
                            arr[i][j] = arr[k][l];
                            arr[k][l] = temp;
                        }
                    }
                }
            }
        }

        IO.println("Ascending Order Matrix:");

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                IO.print(arr[i][j] + " ");
            }
            IO.println();
        }

        sc.close();
    }
}
