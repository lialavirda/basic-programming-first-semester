package Experiment2;

import java.util.Scanner;

public class CaseStudy1_17 {
 public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

        int coffeePriceEachCup = 18000;
        int cupQuantity, moneyPaid, totalPrice, discount, change, notEnoughMoney;
        int totalPriceAfterDiscount;

        System.out.print("Enter the number of cups you want to order: ");
        cupQuantity = sc.nextInt();
        totalPrice = coffeePriceEachCup * cupQuantity;
        discount = totalPrice >= 100000 ? totalPrice * 10 / 100 : 0;
        totalPriceAfterDiscount = totalPrice - discount;

        System.out.println("Total price: " + totalPrice);
        System.out.println("Discount: " + discount);
        System.out.println("Total price after discount: " + totalPriceAfterDiscount);

        System.out.print("Enter the amount of money you are paying: ");
        moneyPaid = sc.nextInt();

        if (moneyPaid >= totalPriceAfterDiscount) {
            change = moneyPaid - totalPriceAfterDiscount;
            System.out.println("Change: " + change);
        } else {
            notEnoughMoney = totalPriceAfterDiscount - moneyPaid;
            System.out.println("Not enough money: " + notEnoughMoney);
        }

        sc.close();
    }
}
