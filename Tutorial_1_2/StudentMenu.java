
import java.util.Scanner;

public class StudentMenu {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String studentName = "";
        int rollNumber = 0;
        boolean recordAvailable = false;

        while (true) {

            System.out.println();
            System.out.println("--------- STUDENT MENU ---------");
            System.out.println("1. Add Record");
            System.out.println("2. View Record");
            System.out.println("3. Delete Record");
            System.out.println("4. Exit");

            System.out.print("Enter your choice: ");
            int choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {

                case 1:

                    System.out.print("Enter student name: ");
                    studentName = sc.nextLine();

                    System.out.print("Enter roll number: ");
                    rollNumber = sc.nextInt();

                    recordAvailable = true;

                    System.out.println("Record added successfully.");
                    break;

                case 2:

                    if (recordAvailable) {
                        System.out.println();
                        System.out.println("Student Name: " + studentName);
                        System.out.println("Roll Number: " + rollNumber);
                    } else {
                        System.out.println("No record available.");
                    }

                    break;

                case 3:

                    if (recordAvailable) {
                        studentName = "";
                        rollNumber = 0;
                        recordAvailable = false;

                        System.out.println("Record deleted successfully.");
                    } else {
                        System.out.println("No record available.");
                    }

                    break;

                case 4:

                    System.out.println("Thank you for using the application.");
                    sc.close();
                    return;

                default:

                    System.out.println("Invalid choice.");

            }
        }
    }
}
