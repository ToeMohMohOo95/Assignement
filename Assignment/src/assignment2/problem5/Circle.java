package assignment2.problem5;

public class Circle {
    private double radius;

    public Circle (double radius){
        this.radius = radius;
    }

    public void calculateArea(){
        double area = Math.PI * this.radius * this.radius;
        System.out.println("Calculate Area is " + area);

    }

    public void calculatePerimeter() {
        double perimeter = 2 * Math.PI * this.radius;
        System.out.println("The Perimeter (Circumference) is: " + perimeter);
    }
}
