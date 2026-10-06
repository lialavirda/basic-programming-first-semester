package Week3.Assignments;

import java.util.Scanner;

public class Assignment1 {

    public static void main(String[] args) {
       new Scanner(System.in);
       Scanner input = new Scanner(System.in);
       
       //Declare Variables
       double MotorcyclePrice;
       double DownPayment;
       int MonthAmount;
       double RemainingPrincipal;
       double TotalInterest;
       double TotalLoan;
       double MonthlyPayment;

       //Input Data from User
       System.out.println("Input the price of the Motorcycle (Rp. x): ");
         MotorcyclePrice = input.nextDouble();

       System.out.println("Input the down payment (DP) (Rp. y): ");
         DownPayment = input.nextDouble();
       
       System.out.println("Input the amount of months (z): ");
         MonthAmount = input.nextInt();
       
       //Calculate Remaining Principal
         RemainingPrincipal = MotorcyclePrice - DownPayment;
         TotalInterest = 0.01 * RemainingPrincipal * MonthAmount;
       // Interest 1% permonth
       TotalLoan = RemainingPrincipal + TotalInterest;
       MonthlyPayment = TotalLoan / MonthAmount;

       //Output result
       System.out.println("\n--- Motorcycle Loan Details ---");
            System.out.println("Motorcycle Price    : Rp. " + MotorcyclePrice);
            System.out.println("Down Payment (DP)   : Rp. " + DownPayment);
            System.out.println("Amount of Months    : " + MonthAmount);
            System.out.println("-------------------------------");
            System.out.println("Remaining Principal : Rp. " + RemainingPrincipal);
            System.out.println("Total Interest      : Rp. " + TotalInterest);
            System.out.println("Total Loan          : Rp. " + TotalLoan);
            System.out.println("Monthly Payment     : Rp. " + MonthlyPayment);
            System.out.println("Remaining Principal : Rp. " + RemainingPrincipal);
            System.out.println("Total Interest      : Rp. " + TotalInterest);
            System.out.println("Total Loan          : Rp. " + TotalLoan);
            System.out.println("Monthly Payment     : Rp. " + MonthlyPayment);
            
            input.close();
    }
}