package assignment2.problem6;

public class problem6 {
    public static void main(String[] args) {
        Cylinder c1 = new Cylinder(5, 9);
        c1.calculateSurfaceArea();
        Cylinder c2 = new Cylinder(7, 15);
        c2.calculateSurfaceArea();
        Cylinder.displayCount();
    }
}
