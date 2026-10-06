//Name : Liala Virdausi
//NIM : 264107020177

package Quiz1;

import java.util.Scanner;

public class fuelConsumption {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //Declare Variables
        double motorcycleSpeed;
        int motorcycleDuration;
        double engineCapacity;

        double totalDistance;

        double fuel_consum_city;
        double fuel_consum_high;
        double fuel_consum_mount;

        double totalFuel;
        double average;

        double dailyFuelTarget;
        double percentageTarget;

        double cityRoads = 0.5;
        double highways = 0.3;
        double mountainousAreas = 0.7;

        //Input data from user
        System.out.println("Input Motorcycle speed (in km): ");
         motorcycleSpeed = input.nextDouble();
        System.out.println("Input the Motorcycle duration (in hours): ");
         motorcycleDuration = input.nextInt();
        System.out.println("Input engine capacity (in liters/km): ");
         engineCapacity = input.nextDouble();
        System.out.println("Input daily fuel target: ");
         dailyFuelTarget = input.nextDouble();

        //Calculate the speed and duration
        totalDistance = motorcycleSpeed * motorcycleDuration / 0.001;

        //Calculate the fuel consumption
        fuel_consum_city = totalDistance * engineCapacity * cityRoads;
        fuel_consum_high = totalDistance * engineCapacity * highways;
        fuel_consum_mount = totalDistance * engineCapacity * mountainousAreas;

        // Total fuel consumption
        totalFuel = fuel_consum_city + fuel_consum_high + fuel_consum_mount;

        //Calculate the average of fuel consumption
        average =  totalFuel / totalDistance;

        //Percentage of daily fuel target consumed
        percentageTarget = totalFuel / dailyFuelTarget * 100;

        //Output result
        System.out.println("-------------------------------------------");
        System.out.println("Motorcycle Speed: " + motorcycleSpeed);
        System.out.println("Motorcycle duration: " + motorcycleDuration);
        System.out.println("-------------------------------------------");
        System.out.println("Fuel Consumption in City Roads: " + fuel_consum_city);
        System.out.println("Fuel Consumption in Highways: " + fuel_consum_high);
        System.out.println("Fuel Consumption in Mountainous Areas: " + fuel_consum_mount);
        System.out.println("-------------------------------------------");
        System.out.println("Total Fuel Consumption: " + totalFuel);
        System.out.println("Average Fuel Consumption: " + average);
        System.out.println("Percentage of rider's daily and target consumed:" + percentageTarget);

    }
}