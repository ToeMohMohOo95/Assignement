package assignment2.problem2;

public class TriangleAngles {
    private double a;
    private double b;
    private double c;

    public TriangleAngles(double a, double b, double c){
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public void calculateAngle(){
        double angleA = Math.acos((this.b*this.b + this.c*this.c - this.a*this.a) / (2 * this.b * this.c));
        angleA = Math.toDegrees(angleA);
        System.out.println("Angle A is : " + angleA);

        double angleB = Math.acos((this.a*this.a + this.c*this.c - this.b*this.b) / (2 * this.a * this.c));
        angleB = Math.toDegrees(angleB);
        System.out.println("Angle B is : " + angleB);

        double angleC = Math.acos((this.a*this.a + this.b*this.b - this.c*this.c) / (2 * this.a * this.b));
        angleC = Math.toDegrees(angleC);
        System.out.println("Angle C is : " + angleC);

        System.out.println("The angles of the triangle are :" + angleA + ','+ angleB + ',' + angleC);
    }


}
