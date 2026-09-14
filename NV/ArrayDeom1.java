
import java.util.Scanner;

public class ArrayDeom1 {

    public static void main(String[] args) {
        //declaration of array

        // int[] array = new int[5];
        // int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        // int sum = 0;
        // // initialization of elements
        // //element wise by using aasignment operator
        // array[1] = 5;
        // array[2] = 10;
        // array[3] = 15;
        // array[4] = 20;
        // for (int i = 0; i < 10; i++) {
        //     System.out.print(" " + array[i] + "\t");
        //     sum = sum + array[i];
        // }
        // System.out.println("Array elements:");
        // System.out.println("First element: " + array[0]);
        // System.out.println("Fourth element: " + array[4]);
        // System.out.println("\n Sum of array: " + sum);
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter array size: ");
        int n = sc.nextInt();

        int[] array = new int[n];

        System.out.println("Enter " + n + " elements:");

        for (int i = 0; i < array.length; i++) {
            array[i] = sc.nextInt();
        }

        for (int i = 0; i < array.length; i++) {
            System.out.print("" + array[i] + "\t");
        }

        int max = array[0];

        for (int i = 0; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }

        System.out.println("\n Maximum element: " + max);
    }
}
