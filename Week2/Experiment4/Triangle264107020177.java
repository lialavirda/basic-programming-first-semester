package Week2.Experiment4;

import java.util.Scanner;

public class Triangle264107020177 {
    public static void main(String[] args){
    // variable declaratioon
        byte height, base;
        float area;
    //get the input
        Scanner sc = new
        Scanner(System.in);
        System.out.println("Input height: ");
        height = sc.nextByte();
        System.out.println("Input base: ");
        base = sc.nextByte();
    //calculate the area
        area = 0.5f * height * base;
    //display the result
        System.out.println("Area of the triangle: " + area);
    }
}
