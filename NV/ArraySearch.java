import java.util.Scanner;

public class ArraySearch {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Declare an array of 10 elements
        int[] arr = new int[10];

        // Enter elements using Scanner
        System.out.println("Enter 10 elements:");

        for (int i = 0; i < arr.length; i++) {
            System.out.print("Enter element " + (i + 1) + ": ");
            arr[i] = sc.nextInt();
        }

        // Enter any one element to search
        System.out.print("\nEnter element to search: ");
        int search = sc.nextInt();

        // Search element
        boolean found = false;

        for (int i = 0; i < arr.length; i++) {

            if (arr[i] == search) {
                found = true;
                break;
            }
        }

        // Display result
        if (found) {
            System.out.println("Element " + search + " is found.");
        } else {
            System.out.println("Element " + search + " is not found.");
        }
    }
}
