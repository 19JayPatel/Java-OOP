import java.util.Scanner;

public class ArrayInput {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[] number = new int[7];
        int temp;

        System.out.println("Enter 7 elements:");

        for (int i = 0; i < 7; i++) {
            number[i] = sc.nextInt();
        }

        System.out.println("\nOriginal elements:");

        for (int i = 0; i < 7; i++) {
            System.out.print(number[i] + " ");
        }

        for (int i = 0; i < 7; i++) {

            for (int j = i + 1; j < 7; j++) {

                if (number[i] > number[j]) {
                    temp = number[i];
                    number[i] = number[j];
                    number[j] = temp;
                }
            }
        }

        System.out.println();
        System.out.println("\nSorted elements:");

        for (int i = 0; i < 7; i++) {
            System.out.print(number[i] + " ");
        }

        sc.close();
    }
}