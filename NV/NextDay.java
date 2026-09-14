import java.util.Scanner;

public class NextDay {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int day, month, year;

        System.out.print("Enter day: ");
        day = sc.nextInt();

        System.out.print("Enter month: ");
        month = sc.nextInt();

        System.out.print("Enter year: ");
        year = sc.nextInt();

        boolean leapYear = false;
        if (year % 4 == 0) {
            leapYear = true;
        }

        if (month < 1 || month > 12) {
            System.out.println("Invalid Month");
        } else {

            int daysInMonth = 31;

            if (month == 4 || month == 6 || month == 9 || month == 11) {
                daysInMonth = 30;
            } else if (month == 2) {
                if (leapYear) {
                    daysInMonth = 29;
                } else {
                    daysInMonth = 28;
                }
            }

            if (day < 1 || day > daysInMonth) {
                System.out.println("Invalid Day");
            } else {

                System.out.println("Current Date Is:");
                System.out.println(day + "/" + month + "/" + year);

                day++;

                if (day > daysInMonth) {
                    day = 1;
                    month++;

                    if (month > 12) {
                        month = 1;
                        year++;
                    }
                }

                System.out.println("Next Date Is:");
                System.out.println(day + "/" + month + "/" + year);
            }
        }
    }
}
