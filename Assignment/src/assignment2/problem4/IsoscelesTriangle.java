package assignment2.problem4;

public class IsoscelesTriangle {

     private double vertexAngle;

     public IsoscelesTriangle(double va){
         this.vertexAngle = va;
     }

     public void isoscelesCalculation(){
         double remainingSum = 180 - this.vertexAngle;
         double w = remainingSum / 2;

         System.out.println("(1) Sum of angles: " + this.vertexAngle + " + 2w = 180");
         System.out.println("(2) 2w = 180 - " + this.vertexAngle + " = " + remainingSum);
         System.out.println("(3) w = " + remainingSum + " / 2");

         System.out.println("The value of angle w is: " + w + " degrees.");
     }
}
