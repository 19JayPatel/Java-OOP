public class LargestElement {

    public static void main(String[] args) {

        int[] number = {100, 50, 30, 80, 20, 40, 60};

        System.out.println("Array elements:");

        for (int i = 0; i < number.length; i++) {
            System.out.print(number[i] + "\t");
        }

        System.out.println();

        int largest = number[0];
        int secondLargest = number[0];

        for (int i = 0; i < number.length; i++) {

            if (number[i] > largest) {

                secondLargest = largest;
                largest = number[i];

            } else if (number[i] > secondLargest && number[i] != largest) {

                secondLargest = number[i];
            }
        }

        System.out.println("\nLargest element: " + largest);
        System.out.println("\nSecond largest element: " + secondLargest);

    }
}