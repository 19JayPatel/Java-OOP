public class FrequencyElement {

    public static void main(String[] args) {

        int[] number = {60,46,60,45,10,25,60};

        boolean[] visited = new boolean[number.length];

        System.out.println("Array elements:");

        for (int i = 0; i < number.length; i++) {
            System.out.print(number[i] + "\t");
        }

        System.out.println();

        for (int i = 0; i < number.length; i++) {

            if (visited[i]) {
                continue;
            }

            int count = 1;

            for (int j = i + 1; j < number.length; j++) {

                if (number[i] == number[j]) {
                    count++;
                    visited[j] = true;
                }
            }

            System.out.println("Element "+number[i] + " Occurs " + count + " times.");
        }
    }
}