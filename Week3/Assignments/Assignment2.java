package Week3.Assignments;

import java.util.Scanner;

public class Assignment2 {
    public static void main(String args[]){
        Scanner input = new Scanner(System.in);
        
        double distance;
        double fuelNeeded;
        double totalCost;

        System.out.print("Enter the distance from Malang to Surabaya (in km): ");
        distance = input.nextDouble();

        fuelNeeded = distance / 2;
        totalCost = fuelNeeded * 10000;

        System.out.println("Fuel needed: " + fuelNeeded + " liters");
        System.out.println("Total fuel cost: Rp " + totalCost);
        input.close();
    }
}
