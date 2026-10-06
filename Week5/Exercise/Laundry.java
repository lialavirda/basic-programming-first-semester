package Week5.Exercise;

import java.util.Scanner;

public class Laundry {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the weight of the laundry (in kg): ");
        double weight = input.nextDouble();
        double pricePerKg;

        if (weight < 3) {
            pricePerKg = 7000;
        } else if (weight >= 3 && weight <= 6) {
            pricePerKg = 6000;
        } else {
            pricePerKg = 5000;
        }

        double totalCost = weight * pricePerKg;
        System.out.println("The total cost for the laundry is Rp. " + totalCost);
        input.close();
    }
}
