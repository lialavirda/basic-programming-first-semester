package Week5.Experiment3;

import java.util.Scanner;

public class NestedLabAccessAttendanceNo264107020177 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean isActiveStudent;
        boolean isSanctioned;
        boolean hasLecturerPermit;
        boolean isLabAssistant;

        System.out.print("Is the student is an active student (true/false): ");
        isActiveStudent = sc.nextBoolean();

        System.out.print("Is the user is sanctioned? (true/false)?: ");
        isSanctioned = sc.nextBoolean();

        System.out.print("Is the user has lecturer permit (true/false): ");
        hasLecturerPermit = sc.nextBoolean();

        System.out.print("Is the user is lab assistant (true/false): ");
        isLabAssistant = sc.nextBoolean();

        if (isActiveStudent && !isSanctioned) {
            if (hasLecturerPermit || isLabAssistant) {
                System.out.println("Laboratory access granted");
            } else {
                System.out.println("Access denied: Lecturer permission or lab assistant status required");
            }
        } else {
            System.out.println("Access denied: student status does not meet the requirement");
        }
    }
}
