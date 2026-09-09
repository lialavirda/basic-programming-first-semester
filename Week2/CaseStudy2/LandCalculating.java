package Week2.CaseStudy2;

import java.util.Scanner;

public class LandCalculating {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double width, length, diameter, side;
        double landArea, circleArea, squareArea, grassArea;

        System.out.println("Input the width of the land: ");
        width = sc.nextDouble();
        System.out.println("Input the length of the land: ");
        length = sc.nextDouble();
        System.out.println("Input the diameter of the circle: ");
        diameter =  sc.nextDouble();
        System.out.println("Input the side of the square: ");
        side = sc.nextDouble();

        landArea = width * length;
        circleArea = Math.PI * (diameter / 2) * (diameter / 2);
        squareArea = side * side;
        grassArea = landArea - circleArea - squareArea;
        
        System.out.println("Land Area: " + landArea);
        System.out.println("Circle Area: " + circleArea);
        System.out.println("Square Area: " + squareArea);
        System.out.println("Grass Area: " + grassArea);
    }
}
