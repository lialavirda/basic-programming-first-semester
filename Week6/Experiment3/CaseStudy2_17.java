package Experiment3;

import java.util.Scanner;

public class CaseStudy2_17 {
    public static void main(String[] args) {
        Scanner input =  new Scanner(System.in);

                System.out.print("Student Name: ");
        String name = input.nextLine();

        System.out.print("Type of Activity (BELMAWA/BAKORMA/Mandiri/PKM/Lainnya): ");
        String type = input.nextLine().trim();

        boolean isCompetition = type.equalsIgnoreCase("BELMAWA")
                || type.equalsIgnoreCase("BAKORMA")
                || type.equalsIgnoreCase("Mandiri");
        boolean isPKM = type.equalsIgnoreCase("PKM");

        System.out.println();
        System.out.println("=== AWARD FUND ===");
        System.out.println("Student: " + name);
        System.out.println("Activity: " + type);

        if (isCompetition) {
            System.out.print("Competition rank (1/2/3, 0 if not a winner): ");
            int rank = input.nextInt();

            if (rank >= 1 && rank <= 3) {
                System.out.print("Number of documents uploaded (0-4): ");
                int documents = input.nextInt();

                if (documents == 4) {
                    System.out.println("Status   : ELIGIBLE for award funds");
                    System.out.println("Reason   : Rank " + rank
                            + " winner and all 4 documents are complete.");
                } else {
                    System.out.println("Status   : NOT ELIGIBLE for award funds");
                    System.out.println("Reason   : Winner, but documents are incomplete.");
                    System.out.println("Missing  : " + (4 - documents) + " document(s)");
                }
            } else {
                System.out.println("Status   : NOT ELIGIBLE for award funds");
                System.out.println("Reason   : Only 1st, 2nd, and 3rd place receive funds.");
            }

        } else if (isPKM) {
            System.out.print("PKM funding status (1 = approved, 0 = not approved): ");
            int pkmStatus = input.nextInt();

            if (pkmStatus == 1) {
                System.out.print("Number of documents uploaded (0-4): ");
                int documents = input.nextInt();

                if (documents == 4) {
                    System.out.println("Status   : ELIGIBLE for award funds");
                    System.out.println("Reason   : PKM proposal approved and all 4 documents are complete.");
                } else {
                    System.out.println("Status   : NOT ELIGIBLE for award funds");
                    System.out.println("Reason   : PKM approved, but documents are incomplete.");
                    System.out.println("Missing  : " + (4 - documents) + " document(s)");
                }
            } else {
                System.out.println("Status   : NOT ELIGIBLE for award funds");
                System.out.println("Reason   : PKM proposal was not approved for funding.");
            }

        } else {
            System.out.println("Status   : NOT ELIGIBLE for award funds");
            System.out.println("Reason   : Other activities do not receive award funds.");
        }

        input.close();
    }
}