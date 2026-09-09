package Week2.CaseStudy1;

 import java.util.Scanner;

public class Salary {
    public static void main(String[] args){
      Scanner sc = new Scanner (System.in);
      int basicSalary, allowance, children, child_allowance;
      double pension, totalSalary;

        System.out.println("Input your basic salary: ");
        basicSalary = sc.nextInt();
        System.out.println("Input child allowance: ");
        child_allowance = sc.nextInt();
        System.out.println("Input number of children: ");
        children = sc.nextInt();

        children = children * child_allowance;
        pension = basicSalary * 0.05;

        totalSalary = basicSalary + children - pension;
        System.out.println("Net salary: " + totalSalary);
    }
}
