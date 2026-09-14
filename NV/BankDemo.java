import java.util.Scanner;

public class BankDemo {
    public static void main(String[] args) {
        System.out.println("Welcome to the Bank Demo Application!");

        boolean isRunning = true;

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter initial balance in account: ");
        double Balance = sc.nextDouble();

        while (isRunning) {
            System.out.println("\nPlease select an option:");
            System.out.println("Choose 1 for Check Balance");
            System.out.println("Choose 2 for Deposit");
            System.out.println("Choose 3 for Withdraw");
            System.out.println("Choose 4 for Exit");

            System.out.print("Enter your choice: ");
            int choice = sc.nextInt();

            switch (choice) {

                case 1:
                    System.out.println("Your current balance is: " + Balance);
                    break;

                case 2:
                    System.out.print("Enter amount to deposit: ");
                    double depositAmount = sc.nextDouble();

                    if (depositAmount <= 0) {
                        System.out.println("Deposit amount must be greater than zero.");
                        break;
                    }

                    Balance += depositAmount;
                    System.out.println("Deposit successful! New balance is: " + Balance);
                    break;

                case 3:
                    System.out.print("Enter amount to withdraw: ");
                    double withdrawAmount = sc.nextDouble();

                    if (withdrawAmount <= 0) {
                        System.out.println("Withdrawal amount must be greater than zero.");
                        break;
                    }

                    if (withdrawAmount <= Balance) {
                        Balance -= withdrawAmount;
                        System.out.println("Withdrawal successful! New balance is: " + Balance);
                    } else {
                        System.out.println("Insufficient funds! Current balance is: " + Balance);
                    }
                    break;

                case 4:
                    System.out.println("Exiting the application. Thank you!");
                    isRunning = false;
                    break;

                default:
                    System.out.println("Invalid choice! Please select a valid option.");
                    break;
            }
        }

        sc.close();
    }
}