// 2=0+1+1
// 4 =1+1+2
// 7 =1+2+4
// 13 =2+4+7

/*0 1 1 2 4 7 13.....
give me logic then perform the program.
*/

import java.util.*;

class supplementary {
    int n;

    void input() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Fibbonacci Series : ");
        n = sc.nextInt();
    }

    void display() {
        int a = 0, b = 1, c = 1, d = 0;
        for (int i = 1; i <= n; i++) {
            System.out.println(a + "\t ");
            d = a + b + c;
            a = b;
            b = c;
            c = d;
        }
    }

}

public class series {
    public static void main(String args[]) {
        supplementary s1 = new supplementary();
        s1.input();
        s1.display();
    }
}