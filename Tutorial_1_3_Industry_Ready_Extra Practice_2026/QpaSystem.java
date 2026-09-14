
import java.util.Scanner;

public class QpaSystem {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // Taking four course grade points
        System.out.print("Enter grade point for course 1: ");
        float gradePoint1 = scanner.nextFloat();

        System.out.print("Enter grade point for course 2: ");
        float gradePoint2 = scanner.nextFloat();

        System.out.print("Enter grade point for course 3: ");
        float gradePoint3 = scanner.nextFloat();

        System.out.print("Enter grade point for course 4: ");
        float gradePoint4 = scanner.nextFloat();

        // Completed credits
        System.out.print("Enter completed credits: ");
        byte completedCredits = scanner.nextByte();

        // Retake status
        System.out.print("Is this a retake? (true/false): ");
        boolean isRetake = scanner.nextBoolean();

        // Calculate total grade points
        float totalGradePoints
                = gradePoint1 + gradePoint2 + gradePoint3 + gradePoint4;

        // Calculate average GPA
        float gpa = totalGradePoints / 4.0f;

        System.out.println("\n--- Academic Report ---");
        System.out.println("Completed Credits: " + completedCredits);
        System.out.println("Retake Status: " + isRetake);

        // Display GPA with exactly 2 decimal places
        System.out.printf("GPA: %.2f%n", gpa);

        scanner.close();
    }
}
