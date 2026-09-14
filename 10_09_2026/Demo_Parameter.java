/* create a class bank which is having the concept of parameterized and member functions. It has few data meaning bank id bnm bank branch. use the concept of scanner class and demo started it.*/

import java.util.*;

class Bank {
    int bid;
    String bnm;
    String branch;

    // Parameterized Constructor
    Bank(int id, String name, String br) {
        this.bid = id;
        this.bnm = name;
        this.branch = br;
    }

    // Member Function
    void display() {
        System.out.println("Bank ID   : " + bid);
        System.out.println("Bank Name : " + bnm);
        System.out.println("Branch    : " + branch);
    }
}

public class Demo_Parameter {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Bank ID : ");
        int id = sc.nextInt();

        sc.nextLine();

        System.out.print("Enter Bank Name : ");
        String name = sc.nextLine();

        System.out.print("Enter Branch : ");
        String br = sc.nextLine();

        // Parameterized Constructor Calling
        Bank b1 = new Bank(id, name, br);

        // Member Function Calling
        b1.display();
    }
}
