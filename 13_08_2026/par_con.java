// parameterize constructor

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

public class par_con {
    public static void main(String args[]) {
        square s = new square(4);
    }
}
