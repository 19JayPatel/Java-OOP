public class ViratScore {

    public static void main(String[] args) {

        int[] score = {74, 65, 5, 124, 23, 93, 65, 102, 135, 74};

        int highest = score[0];
        int lowest = score[0];

        int fiftyPlus = 0;
        int hundredPlus = 0;
        boolean duck = false;

        for (int i = 0; i < score.length; i++) {

            // Find highest score
            if (score[i] > highest) {
                highest = score[i];
            }

            // Find lowest score
            if (score[i] < lowest) {
                lowest = score[i];
            }

            // Count 50+
            if (score[i] >= 50) {
                fiftyPlus++;
            }

            // Count 100+
            if (score[i] >= 100) {
                hundredPlus++;
            }

            // Check for duck
            if (score[i] == 0) {
                duck = true;
            }
        }

        System.out.println("----- Virat Kohli ODI Score Report -----");

        System.out.println("Highest Score: " + highest);
        System.out.println("Lowest Score: " + lowest);
        System.out.println("Number of 50+: " + fiftyPlus);
        System.out.println("Number of 100+: " + hundredPlus);

        if (duck) {
            System.out.println("Out on 0: Yes");
        } else {
            System.out.println("Out on 0: No");
        }
    }
}