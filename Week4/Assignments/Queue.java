package Week4.Assignments;

import java.util.Scanner;

public class Queue {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter service code (1-4): ");
        int code = input.nextInt();

        switch (code){
            case 1:
                System.out.println("Academic Concultation");
                break;
            case 2:
                System.out.println("Course registration");
                break;
            case 3:
                System.out.println("Transcript Request");
                break;
            case 4: 
                System.out.println("Student Card Service");
                break;
            default:
                System.out.println("Service code is not available");
        
        }
    }
}
