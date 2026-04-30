package assignment2.problem3;

public class Problem3 {
    public static void main(String[] args) {

        Hypotenuse h1 = new Hypotenuse(3, 4);
        h1.calculateHypotenuse();

        Hypotenuse h2 = new Hypotenuse(4, 5);
        h2.calculateHypotenuse();

        Hypotenuse.displayCount();
    }
}
