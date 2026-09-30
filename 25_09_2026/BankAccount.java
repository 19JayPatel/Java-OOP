
// class Bank {
//     String actno;
//     String actHolderName;
//     double balace;
//     Bank(String actno, String actholdername, double balance) {
//         this.actno = actno;
//         this.actHolderName = actholdername;
//         this.balace = balance;
//     }
//     void displaydata() {
//         System.out.println("Account no: " + actno);
//         System.out.println("Account holder name: " + actHolderName);
//         System.out.println("Balance is: " + balace);
//     }
// }
// public class BankAccount {
//     public static void main(String[] args) {
//         Bank b1 = new Bank("1111", "xyx", 1000.00); 
//         b1.displaydata();
//     }
// }
// // difference between method and constructor in java
// // actual arguments (often just called arguments) and formal parameters (often called parameters).
// class Bank {
//     String actno;
//     String actHolderName;
//     private double balace;
//     Bank(String actno, String actholdername, double balance) {
//         this.actno = actno;
//         this.actHolderName = actholdername;
//         this.balace = balance;
//     }
//     double getBalace() {
//         return balace;
//     }
//     public void setBalace(double balace) {
//         this.balace = balace;
//     }
//     void deposit(double amount) {
//         if (amount > 0) {
//             balace += amount;
//             System.out.println("Successfully deposited: " + amount);
//         } else {
//             System.out.println("Invalid deposit amount.");
//         }
//     }
//     void withdrawal(double amount) {
//         if (amount < balace) {
//             balace -= amount;
//             System.out.println("Successfully withdrew: " + amount);
//         } else {
//             System.out.println("Insufficient balance! Transaction failed.");
//         }
//     }
//     void displaydata() {
//         System.out.println("\n--- Account Details ---");
//         System.out.println("Account no: " + actno);
//         System.out.println("Account holder name: " + actHolderName);
//         System.out.println("Balance is: " + balace);
//         System.out.println("-----------------------\n");
//     }
// }
// public class BankAccount {
//     public static void main(String[] args) {
//         Bank b1 = new Bank("1111", "xyx", 1000.00);
//         b1.displaydata();
//         b1.deposit(500.00);
//         b1.displaydata();
//         b1.withdrawal(300.00);
//         b1.displaydata();
//         System.out.println("Last Updated balanace is: " + b1.getBalace());
//         System.out.println("Now add 100 RS. :  "+ b1.getBalace());
//     }
// }
class Bank {

    String actno;
    String actHolderName;
    private double balace;

    Bank(String actno, String actholdername, double balance) {
        this.actno = actno;
        this.actHolderName = actholdername;
        this.balace = balance;
    }

    double getBalace() {
        return balace;
    }

    void setBalace(double balace) {
        this.balace = balace;
    }

    void deposit(double amount) {
        if (amount > 0) {
            balace += amount;
            System.out.println(actHolderName + " successfully deposited: " + amount);
        } else {
            System.out.println("Invalid deposit amount.");
        }
    }

    void withdrawal(double amount) {

        if (amount <= balace) {
            balace -= amount;
            System.out.println(actHolderName + " successfully withdrew: " + amount);
        } else {
            System.out.println(actHolderName + " failed to withdraw. Insufficient balance!");
        }
    }

    void displaydata() {
        System.out.println("\n--- Account Details ---");
        System.out.println("Account no: " + actno);
        System.out.println("Account holder name: " + actHolderName);
        System.out.println("Balance is: " + balace);
        System.out.println("-----------------------\n");
    }
}

public class BankAccount {

    public static void main(String[] args) {

        Bank b1 = new Bank("1111", "Alice", 25000.00);
        Bank b2 = new Bank("2222", "Bob", 25000.00);

        System.out.println("--- Initial Status ---");
        b1.displaydata();
        b2.displaydata();

        System.out.println("--- Performing Transactions ---");
        b1.deposit(5000.00);
        b1.withdrawal(2000.00);

        b2.deposit(5000.00);
        b2.withdrawal(4000.00);
        System.out.println("--------------------------------\n");

        System.out.println("=== Big Account Holder ===");
        if (b1.getBalace() > b2.getBalace()) {
            b1.displaydata();
        } else if (b2.getBalace() > b1.getBalace()) {
            b2.displaydata();
        } else {
            System.out.println("Both accounts have the exact same balance of: " + b1.getBalace() + " RS.");
        }
    }
}
