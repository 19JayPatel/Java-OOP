/* create a class simple interest which is using the concept of 
command line argument, use parameter constructor and member function, even use 
the concept of this keyword and demonstrate the program.*/

class SimpleInterest {
    int p, r, t;
    float si;

    // Parameterized Constructor
    SimpleInterest(int p, int r, int t) {
        this.p = p;
        this.r = r;
        this.t = t;
    }

    // Member Function
    void display() {
        si = (p * r * t) / 100.0f;

        System.out.println("Principal : " + p);
        System.out.println("Rate      : " + r);
        System.out.println("Time      : " + t);
        System.out.println("Simple Interest : " + si);
    }
}

public class SimpleInterest_Parameter {
    public static void main(String a[]) {
        int p = Integer.parseInt(a[0]);
        int r = Integer.parseInt(a[1]);
        int t = Integer.parseInt(a[2]);

        SimpleInterest s1 = new SimpleInterest(p, r, t);

        s1.display();
    }
}
