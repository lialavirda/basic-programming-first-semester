package Week4.Assignments;

import java.util.Scanner;

public class Parking {
    public static void main(String[] args) {
        Scanner inputScanner = new Scanner(System.in);
        
        int parkingDuration;
        int rate;

        System.out.println("Input your parking duration (hours): ");
        parkingDuration = inputScanner.nextInt();

        if (parkingDuration <= 2){
            rate = 2000;
        }else {
            rate = 2000 + (parkingDuration - 2) * 1000;
        }
        System.out.println("Parking rate: Rp" + rate);

    }
}
