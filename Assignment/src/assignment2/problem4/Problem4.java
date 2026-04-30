package assignment2.problem4;

import java.util.Scanner;

public class Problem4 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the vertex angle: ");
        double vertexAngle = s.nextDouble();
        IsoscelesTriangle it = new IsoscelesTriangle(vertexAngle);
        it.isoscelesCalculation();
    }
}
