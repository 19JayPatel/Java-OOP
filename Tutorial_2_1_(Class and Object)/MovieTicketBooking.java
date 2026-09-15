
import java.util.Scanner;

class Movie {

    int movie_id;
    String movie_name;
    double ticket_price;
    int available_seats;

    Movie(int id, String name, double price, int seats) {
        movie_id = id;
        movie_name = name;
        ticket_price = price;
        available_seats = seats;
    }

    void display() {
        System.out.println("Movie ID: " + movie_id);
        System.out.println("Movie Name: " + movie_name);
        System.out.println("Ticket Price: " + ticket_price);
        System.out.println("Available Seats: " + available_seats);
    }
}

public class MovieTicketBooking {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        if (args.length == 0) {
            System.out.println("Please pass Movie ID through command-line argument.");
            return;
        }

        int id = Integer.parseInt(args[0]);

        Movie m1 = new Movie(id, "Avatar", 200, 50);

        m1.display();

        System.out.print("\nEnter number of tickets: ");
        int tickets = sc.nextInt();

        if (tickets <= 0 || tickets > m1.available_seats) {
            System.out.println("Invalid number of tickets.");
        } else {
            double total = tickets * m1.ticket_price;
            double discount = 0;

            // Apply discount for multiple tickets
            if (tickets >= 5) {
                discount = total * 0.10;
            } else if (tickets >= 3) {
                discount = total * 0.05;
            }

            double final_amount = total - discount;

            m1.available_seats = m1.available_seats - tickets;

            System.out.println("\n----- Booking Information -----");
            System.out.println("Movie Name: " + m1.movie_name);
            System.out.println("Tickets Booked: " + tickets);
            System.out.println("Total Amount: " + total);
            System.out.println("Discount: " + discount);
            System.out.println("Final Amount: " + final_amount);
            System.out.println("Remaining Seats: " + m1.available_seats);
        }

        sc.close();
    }
}
