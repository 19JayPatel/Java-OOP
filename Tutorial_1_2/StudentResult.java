
import java.util.Scanner;

public class StudentResult {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter student name: ");
        String name = sc.nextLine();

        System.out.print("Enter roll number: ");
        int rollNumber = sc.nextInt();

        System.out.print("Enter marks of Java: ");
        double javaMarks = sc.nextDouble();

        System.out.print("Enter marks of DBMS: ");
        double dbmsMarks = sc.nextDouble();

        System.out.print("Enter marks of Python: ");
        double pythonMarks = sc.nextDouble();

        double total = javaMarks + dbmsMarks + pythonMarks;
        double percentage = total / 3;

        char grade;

        if (percentage >= 90) {
            grade = 'A';
        } else if (percentage >= 80) {
            grade = 'B';
        } else if (percentage >= 70) {
            grade = 'C';
        } else if (percentage >= 60) {
            grade = 'D';
        } else if (percentage >= 50) {
            grade = 'E';
        } else {
            grade = 'F';
        }

        System.out.println();
        System.out.println("--------- STUDENT RESULT ---------");
        System.out.println("Name: " + name);
        System.out.println("Roll Number: " + rollNumber);
        System.out.println("Total Marks: " + total);
        System.out.println("Percentage: " + percentage);
        System.out.println("Grade: " + grade);
    }
}
