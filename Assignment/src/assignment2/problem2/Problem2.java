package assignment2.problem2;

import java.util.Scanner;

public class Problem2 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter a: ");
        double a = s.nextDouble();
        System.out.print("Enter b: ");
        double b= s.nextDouble();
        System.out.print("Enter c: ");
        double c = s.nextDouble();
        TriangleAngles ta = new TriangleAngles(3, 4, 5);
        ta.calculateAngle();
    }
}
