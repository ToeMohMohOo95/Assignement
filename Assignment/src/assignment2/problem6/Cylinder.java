package assignment2.problem6;

public class Cylinder {
    private double radius;
    private double height;
    public static int count = 0;

    public Cylinder(double radius, double height){
        this.radius = radius;
        this.height = height;
        count = count + 1;
    }

    public void calculateSurfaceArea() {
        double surfaceArea = 2 * Math.PI * this.radius * (this.radius + this.height);
        System.out.println("The Total Surface Area of the Cylinder is: " + surfaceArea);
    }

    public static void displayCount(){
        System.out.println("Count is " + count);
    }
}
