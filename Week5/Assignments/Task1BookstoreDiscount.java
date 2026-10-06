package Week5.Assignments;

import java.util.Scanner;

public class Task1BookstoreDiscount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Is today Wednesday? (1 = yes, 0 = no): ");
        int wednesday = sc.nextInt();

        System.out.println("Book type: 1 = Dictionary, 2 = Novel, 3 = Other");
        System.out.print("Enter book type: ");
        int type = sc.nextInt();

        System.out.print("Enter number of books: ");
        int qty = sc.nextInt();

        System.out.print("Enter price per book: ");
        double price = sc.nextDouble();

        double discountPercent = 0;

        // Logical operators: valid input AND it is Wednesday
        if (wednesday == 1 && qty > 0 && type >= 1 && type <= 3) {

            if (type == 1) {                    // Dictionary
                discountPercent = 10;
                if (qty > 2) {
                    discountPercent += 2;
                }
            } else if (type == 2) {             // Novel
                discountPercent = 7;
                if (qty > 3) {
                    discountPercent += 2;
                } else {
                    discountPercent += 1;
                }
            } else {                            // Other books
                if (qty > 3) {
                    discountPercent = 5;
                }
            }

        } else if (wednesday != 1 && qty > 0 && type >= 1 && type <= 3) {
            System.out.println("No discount: discounts only apply on Wednesday.");
        } else {
            System.out.println("Invalid input.");
            sc.close();
            return;
        }

        double subtotal = price * qty;
        double discountAmount = subtotal * discountPercent / 100;
        double totalPay = subtotal - discountAmount;

        System.out.println("Discount        : " + discountPercent + "%");
        System.out.println("Discount amount : " + discountAmount);
        System.out.println("Total to pay    : " + totalPay);

        sc.close();
    }
}