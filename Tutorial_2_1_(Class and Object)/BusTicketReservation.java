
import java.util.Scanner;

class Bus {

    int bus_number;
    String source;
    String destination;
    double ticket_price;
    int available_seats;

    Bus(int number, String s, String d, double price, int seats) {
        bus_number = number;
        source = s;
        destination = d;
        ticket_price = price;
        available_seats = seats;
    }

    void display() {
        System.out.println("Bus Number: " + bus_number);
        System.out.println("Source: " + source);
        System.out.println("Destination: " + destination);
        System.out.println("Ticket Price: " + ticket_price);
        System.out.println("Available Seats: " + available_seats);
    }
}

public class BusTicketReservation {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        if (args.length == 0) {
            System.out.println("Please pass Bus Number through command-line argument.");
            return;
        }

        int number = Integer.parseInt(args[0]);

        Bus b1 = new Bus(number, "Rajkot", "Ahmedabad", 250, 40);

        b1.display();

        System.out.print("\nEnter passenger name: ");
        String passenger_name = sc.nextLine();

        System.out.print("Enter number of seats required: ");
        int seats = sc.nextInt();

        if (seats <= 0 || seats > b1.available_seats) {
            System.out.println("Seats are not available.");
        } else {
            double total = seats * b1.ticket_price;

            b1.available_seats = b1.available_seats - seats;

            System.out.println("\n----- Reservation Details -----");
            System.out.println("Passenger Name: " + passenger_name);
            System.out.println("Bus Number: " + b1.bus_number);
            System.out.println("Source: " + b1.source);
            System.out.println("Destination: " + b1.destination);
            System.out.println("Seats Booked: " + seats);
            System.out.println("Total Ticket Amount: " + total);
            System.out.println("Remaining Seats: " + b1.available_seats);
        }

        sc.close();
    }
}
