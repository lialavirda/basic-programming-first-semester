package Week4.Experiment1;

import java.util.Scanner;

public class SelectionIfAttendance264107020177 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("--- Print KRS SIAKAD ---");
        System.out.print("Has the UKT been paid? (true/false): ");
        boolean uktPaid = sc.nextBoolean();

        String message = uktPaid 
            ? "UKT payment verified\nPlease print your KRS and ask your DPA to sign it" 
            : "Registration rejected. Please pay your UKT first";

        System.out.println(message);

        sc.close();
    }
}