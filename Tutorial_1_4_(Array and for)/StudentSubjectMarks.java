/* Q2 - 3 students appeared in different numbers of subjects:
   Student 1 -> 2 subjects
   Student 2 -> 4 subjects
   Student 3 -> 3 subjects
   Use a jagged array to store marks and print each student's marks. */

import java.util.Scanner;

public class StudentSubjectMarks {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[][] marks = new int[3][];

        marks[0] = new int[2]; // Student 1 - 2 subjects
        marks[1] = new int[4]; // Student 2 - 4 subjects
        marks[2] = new int[3]; // Student 3 - 3 subjects

        for (int i = 0; i < marks.length; i++) {

            System.out.println("\nEnter marks for Student " + (i + 1) + " (" + marks[i].length + " subjects):");

            for (int j = 0; j < marks[i].length; j++) {
                System.out.print("Subject " + (j + 1) + ": ");
                marks[i][j] = sc.nextInt();
            }
        }

        System.out.println("\n--- Student Marks ---");

        for (int i = 0; i < marks.length; i++) {

            System.out.print("Student " + (i + 1) + ": ");

            for (int j = 0; j < marks[i].length; j++) {
                System.out.print(marks[i][j] + "\t");
            }

            System.out.println();
        }
    }
}