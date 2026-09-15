// Q2 - Find the second largest and second smallest element in an array without using sorting.

public class SecondLargestSmallest {

    public static void main(String[] args) {

        int[] number = {45, 20, 89, 33, 78, 12, 66};

        System.out.println("Array elements:");

        for (int i = 0; i < number.length; i++) {
            System.out.print(number[i] + "\t");
        }

        System.out.println();

        int largest = number[0];
        int secondLargest = number[0];

        int smallest = number[0];
        int secondSmallest = number[0];

        for (int i = 0; i < number.length; i++) {

            // Track largest and second largest
            if (number[i] > largest) {
                secondLargest = largest;
                largest = number[i];
            } else if (number[i] > secondLargest && number[i] != largest) {
                secondLargest = number[i];
            }

            // Track smallest and second smallest
            if (number[i] < smallest) {
                secondSmallest = smallest;
                smallest = number[i];
            } else if (number[i] < secondSmallest && number[i] != smallest) {
                secondSmallest = number[i];
            }
        }

        System.out.println("\nLargest element: " + largest);
        System.out.println("Second Largest element: " + secondLargest);
        System.out.println("Smallest element: " + smallest);
        System.out.println("Second Smallest element: " + secondSmallest);
    }
}
