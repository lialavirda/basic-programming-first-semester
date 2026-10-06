package Week3.Experiment3;

import java.util.Scanner;

public class CalculateTotalPaymentLiala {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double price;
        double discount;
        double discountCode = 0.15;
        double totalPayment;

        System.out.print("Enter the price of the clothes (Rp): ");
        price = input.nextDouble();

        discount = price * discountCode;
        totalPayment = price - discount;

        System.out.println("original price: Rp " + price);
        System.out.println("Discount (15%): Rp " + discount);
        System.out.println("Total to be paid: Rp " + totalPayment);
        input.close();

    }
}
