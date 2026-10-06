package Week5.Assignments;

import java.util.Scanner;

public class Task2AssistantSelectionAttendance26410720177 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Student name: ");
        String name = input.nextLine();
        System.out.print("Is the student active? (true/false): ");
        boolean isActiveStudent = input.nextBoolean();
        System.out.print("Is the student under academic sanction? (true/false): ");
        boolean isAcademicallySanctioned = input.nextBoolean();

        System.out.println("\n===== SELECTION RESULT: " + name + " =====");

        // Stage 1: administrative requirements
        if (isActiveStudent && !isAcademicallySanctioned) {
            System.out.print("Basic Programming grade (0-100): ");
            double grade = input.nextDouble();
            System.out.print("Has a programming competency certificate? (true/false): ");
            boolean hasCertificate = input.nextBoolean();

            // Stage 2: academic requirements
            if (grade >= 80 || hasCertificate) {
                System.out.println("Stage 2 passed. Called for an interview!");
                System.out.print("Interview score (0-100): ");
                double interview = input.nextDouble();

                // Stage 3: interview
                if (interview >= 75) {
                    System.out.println("RESULT: ACCEPTED as lab assistant.");
                } else {
                    System.out.println("RESULT: REJECTED as lab assistant.");
                    System.out.println("Reason: interview score " + interview
                            + " is below the minimum requirement of 75.");
                }
            } else {
                System.out.println("RESULT: NOT ELIGIBLE for an interview.");
                System.out.println("Reason: Basic Programming grade is below 80 and no programming competency certificate.");
            }
        } else {
            System.out.println("RESULT: NOT ELIGIBLE to take part in the selection.");
            if (!isActiveStudent && isAcademicallySanctioned) {
                System.out.println("Reason: Student is not active and is under academic sanction!");
            } else if (!isActiveStudent) {
                System.out.println("Reason: Student is not active!");
            } else {
                System.out.println("Reason: Student is currently under academic sanction!");
            }
        }

        input.close();
    }
}