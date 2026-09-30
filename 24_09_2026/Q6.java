
class Fact {

    public int calculate(int number) {
        int result = 1;

        for (int i = 1; i <= number; i++) {
            result = result * i;
        }

        return result;
    }
}

public class Q6 {

    public static void main(String[] args) {
        Fact f = new Fact();

        int targetNumber = 5;
        int a1 = f.calculate(targetNumber);

        System.out.println("Factorial of " + targetNumber + " is: " + a1);
    }
}
