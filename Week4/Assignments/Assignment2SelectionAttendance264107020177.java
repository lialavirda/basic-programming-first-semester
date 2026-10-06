package Week4.Assignments;

import java.util.Scanner;

public class Assignment2SelectionAttendance264107020177 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter total credits (SKS): ");
        int totalCredits = sc.nextInt();

        if (totalCredits <= 24) {
            System.out.println("KRS is valid");
        } else {
            System.out.println("Exceeds the limit");
        }

        sc.close();
    }

    }
