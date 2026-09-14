import java.util.Scanner;

public class CafeDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int choice = 0, subchoice = 0, qty = 0;
        double total = 0.0;
        boolean ordering = true;

        while (ordering) {
            System.out.println("\nWelcome to the JS Cafe Demo Application!");
            System.out.println("Select from the menu:");
            System.out.println("Press 1 for Starters");
            System.out.println("Press 2 for Main Course");
            System.out.println("Press 3 for Desserts");
            System.out.println("Press 4 for Bill Generation");

            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            switch (choice) {

                case 1:
                    System.out.println("1 for Spring Rolls...200 Rs.");
                    System.out.println("2 for Manchurian...250 Rs.");
                    System.out.println("3 for Soup...150 Rs.");
                    System.out.print("Enter your choice: ");
                    subchoice = sc.nextInt();

                    System.out.print("Enter quantity: ");
                    qty = sc.nextInt();

                    if (subchoice == 1) {
                        total += 200 * qty;
                        System.out.println("After addition of Spring Rolls, your total is: Rs. " + total);
                    } else if (subchoice == 2) {
                        total += 250 * qty;
                        System.out.println("After addition of Manchurian, your total is: Rs. " + total);
                    } else if (subchoice == 3) {
                        total += 150 * qty;
                        System.out.println("After addition of Soup, your total is: Rs. " + total);
                    } else {
                        System.out.println("Invalid choice for Starters.");
                    }
                    break;

                case 2:
                    System.out.println("1 for Pizza...500 Rs.");
                    System.out.println("2 for Burger...300 Rs.");
                    System.out.println("3 for Pasta...400 Rs.");
                    System.out.print("Enter your choice: ");
                    subchoice = sc.nextInt();

                    System.out.print("Enter quantity: ");
                    qty = sc.nextInt();

                    if (subchoice == 1) {
                        total += 500 * qty;
                        System.out.println("After addition of Pizza, your total is: Rs. " + total);
                    } else if (subchoice == 2) {
                        total += 300 * qty;
                        System.out.println("After addition of Burger, your total is: Rs. " + total);
                    } else if (subchoice == 3) {
                        total += 400 * qty;
                        System.out.println("After addition of Pasta, your total is: Rs. " + total);
                    } else {
                        System.out.println("Invalid choice for Main Course.");
                    }
                    break;

                case 3:
                    System.out.println("1 for Ice Cream...100 Rs.");
                    System.out.println("2 for Brownie...150 Rs.");
                    System.out.println("3 for Cake...200 Rs.");
                    System.out.print("Enter your choice: ");
                    subchoice = sc.nextInt();

                    System.out.print("Enter quantity: ");
                    qty = sc.nextInt();

                    if (subchoice == 1) {
                        total += 100 * qty;
                        System.out.println("After addition of Ice Cream, your total is: Rs. " + total);
                    } else if (subchoice == 2) {
                        total += 150 * qty;
                        System.out.println("After addition of Brownie, your total is: Rs. " + total);
                    } else if (subchoice == 3) {
                        total += 200 * qty;
                        System.out.println("After addition of Cake, your total is: Rs. " + total);
                    } else {
                        System.out.println("Invalid choice for Desserts.");
                    }
                    break;

                case 4:
                    System.out.println("\n------------------------------");
                    System.out.println("Your total bill is: Rs. " + total);
                    System.out.println("Thank you for visiting JS Cafe!");
                    System.out.println("------------------------------");

                    ordering = false;
                    break;

                default:
                    System.out.println("Invalid choice.");
                    break;
            }
        }

        sc.close();
    }
}