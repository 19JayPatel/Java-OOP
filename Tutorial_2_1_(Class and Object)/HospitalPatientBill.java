
import java.util.Scanner;

class Patient {

    int patient_id;
    String patient_name;
    int age;
    double consultation_fee;

    Patient(int id, String name, int a, double fee) {
        patient_id = id;
        patient_name = name;
        age = a;
        consultation_fee = fee;
    }

    void display() {
        System.out.println("Patient ID: " + patient_id);
        System.out.println("Patient Name: " + patient_name);
        System.out.println("Age: " + age);
        System.out.println("Consultation Fee: " + consultation_fee);
    }
}

public class HospitalPatientBill {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        if (args.length == 0) {
            System.out.println("Please pass Patient ID through command-line argument.");
            return;
        }

        int id = Integer.parseInt(args[0]);

        Patient p1 = new Patient(id, "Jay", 22, 500);

        p1.display();

        System.out.print("\nEnter number of days admitted: ");
        int days = sc.nextInt();

        System.out.print("Enter room charges per day: ");
        double room_charges = sc.nextDouble();

        System.out.print("Enter medicine expenses: ");
        double medicine = sc.nextDouble();

        double room_total = days * room_charges;

        double total_bill = p1.consultation_fee + room_total + medicine;

        System.out.println("\n----- Hospital Bill -----");
        System.out.println("Patient Name: " + p1.patient_name);
        System.out.println("Patient ID: " + p1.patient_id);
        System.out.println("Age: " + p1.age);
        System.out.println("Consultation Fee: " + p1.consultation_fee);
        System.out.println("Room Charges: " + room_total);
        System.out.println("Medicine Expenses: " + medicine);
        System.out.println("Total Hospital Bill: " + total_bill);

        sc.close();
    }
}
