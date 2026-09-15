
import java.util.Scanner;

class Vehicle {

    String vehicle_number;
    String owner_name;
    String vehicle_type;
    double parking_rate;

    Vehicle(String number, String name, String type, double rate) {
        vehicle_number = number;
        owner_name = name;
        vehicle_type = type;
        parking_rate = rate;
    }

    void display() {
        System.out.println("Vehicle Number: " + vehicle_number);
        System.out.println("Owner Name: " + owner_name);
        System.out.println("Vehicle Type: " + vehicle_type);
        System.out.println("Parking Rate Per Hour: " + parking_rate);
    }
}

public class ParkingFeeManagement {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        if (args.length == 0) {
            System.out.println("Please pass Vehicle Number through command-line argument.");
            return;
        }

        String number = args[0];

        Vehicle v1 = new Vehicle(number, "Jay", "Car", 50);

        v1.display();

        System.out.print("\nEnter number of hours parked: ");
        int hours = sc.nextInt();

        double parking_fee = hours * v1.parking_rate;

        // Extra charge for parking more than 5 hours
        if (hours > 5) {
            parking_fee = parking_fee + 100;
        }

        System.out.println("\n----- Parking Receipt -----");
        System.out.println("Vehicle Number: " + v1.vehicle_number);
        System.out.println("Owner Name: " + v1.owner_name);
        System.out.println("Vehicle Type: " + v1.vehicle_type);
        System.out.println("Parking Hours: " + hours);
        System.out.println("Parking Rate: " + v1.parking_rate);
        System.out.println("Total Parking Fee: " + parking_fee);

        sc.close();
    }
}
