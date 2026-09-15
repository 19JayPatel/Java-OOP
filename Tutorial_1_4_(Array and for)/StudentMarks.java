// Q4 - Accept marks of N students (user input size) and display the highest, lowest, and average marks.

import java.util.Scanner;

public class StudentMarks {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of students: ");
        int n = sc.nextInt();

        int[] marks = new int[n];

        System.out.println("Enter marks of " + n + " students:");

        for (int i = 0; i < n; i++) {
            marks[i] = sc.nextInt();
        }

        int highest = marks[0];
        int lowest = marks[0];
        int sum = 0;

        for (int i = 0; i < n; i++) {

            if (marks[i] > highest) {
                highest = marks[i];
            }

            if (marks[i] < lowest) {
                lowest = marks[i];
            }

            sum = sum + marks[i];
        }

        double average = (double) sum / n;

        System.out.println("\nHighest Marks: " + highest);
        System.out.println("Lowest Marks: " + lowest);
        System.out.println("Average Marks: " + average);
    }
}
