public class MinimumElement {

    public static void main(String[] args) {

        int[] number = {10, 50, 30, 80, 20, 40, 60};

        System.out.println("Array elements:");

        for (int i = 0; i < number.length; i++) {
            System.out.print(number[i] + "\t");
        }

        System.out.println();

        int Min_value = Integer.MAX_VALUE;

        for (int i = 0; i < number.length; i++) {

            if (number[i] < Min_value) {
                Min_value = number[i];
            }
        }

        System.out.println("Minimum element: " + Min_value);

    }
}