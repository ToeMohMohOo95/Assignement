package assignment2.problem1;

public class QuadraticSolver {
    private double a;
    private double b;
    private double c;

    public QuadraticSolver(double a, double b, double c){
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public void solve(){
        double discriminant = (b * b) - (4 * a * c);

        if (discriminant > 0) {
            double x1 = (-b + Math.sqrt(discriminant)) / (2 * a);
            double x2 = (-b - Math.sqrt(discriminant)) / (2 * a);
            System.out.println("The solutions are: x1 = " + x1 + ", x2 = " + x2);
        } else if (discriminant == 0) {
            double x = -b / (2 * a);
            System.out.println("The solution is: x = " + x);
        } else {
            System.out.println("Real solutions do not exist.");
        }

    }

}
