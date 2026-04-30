package assignment2.problem3;

public class Hypotenuse {
    private double base;
    private double height;
    private static int count;

    public Hypotenuse(double base, double height){
        this.base= base;
        this.height = height;
        count = count + 1;
    }

    public void calculateHypotenuse(){
        double hypotenuse = Math.hypot(this.base, this.height);
        System.out.println("The hypotenuse is :" + hypotenuse);
    }

    public static void displayCount(){
        System.out.println("Display count is :" + count);

    }
}
