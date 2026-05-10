package employeesystem;

public class FulltimeEmployee extends Employee {
    private double allowance;
    private double bonus;
    private double basicSalary;

   public FulltimeEmployee(String name, int id , double basicSalary, double allowance, double bonus){
       this.basicSalary = basicSalary;
       this.allowance = allowance;
       this.bonus = bonus;
   }

   public double calculateSalary(){
       return basicSalary + bonus + allowance;
   }
}
