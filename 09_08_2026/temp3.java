/* create a class supplementary.
which has 2 member functions 1) input 2) display. The supplementary class is accessed by object s1 in the class temp.
kindly perform fibonacci series 
by taking the limit from the which is shown in input method and display is going to the show logic.  */

import java.util.*;

class suplymentry {
    int n;

    void input() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Fibbonacci Series : ");
        n = sc.nextInt();
    }

    void display() {
        int a = 0, b = 1, c = 0;
        for (int i = 1; i <= n; i++) {
            System.out.println(a + "\t ");
            c = a + b;
            a = b;
            b = c;

        }
    }

}

public class temp3 {
    public static void main(String args[]) {
        suplymentry s1 = new suplymentry();
        s1.input();
        s1.display();
    }
}
