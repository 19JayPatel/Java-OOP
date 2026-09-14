
public class StringWrapperCompare {

    public static void main(String[] args) {

        System.out.println("----- String Comparison -----");

        String firstName = new String("Jay");
        String secondName = new String("Jay");

        System.out.println("firstName == secondName: " + (firstName == secondName));
        System.out.println("firstName.equals(secondName): " + firstName.equals(secondName));

        System.out.println();

        System.out.println("----- Integer Comparison -----");

        Integer number1 = Integer.valueOf(100);
        Integer number2 = Integer.valueOf(100);

        System.out.println("100 == 100: " + (number1 == number2));
        System.out.println("100 .equals() 100: " + number1.equals(number2));

        System.out.println();

        Integer number3 = Integer.valueOf(200);
        Integer number4 = Integer.valueOf(200);

        System.out.println("200 == 200: " + (number3 == number4));
        System.out.println("200 .equals() 200: " + number3.equals(number4));

    }
}
