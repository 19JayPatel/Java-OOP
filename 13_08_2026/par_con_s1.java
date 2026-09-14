// create a program in java using the concept of class and object . The class
// name is square . take the data members using parameterise constructor. having
// a concept of scanner.the output should be square.

import java.util.*;

class square {
    square() // default constructor
    {
        System.out.println("Program of Square");
    }

    square(int a) // parameterize constructor
    {
        System.out.println("Square : " + (a * a));
    }
}

public class par_con_s1 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number : ");
        int s1 = sc.nextInt();
        square s = new square(s1);
    }
}
