package employeesystem;

public class FulltimeEmployee {
    private String name;
    private int employeeId;
    private double basicSalary;
    private double allowance;
    private double bonus;

   public FulltimeEmployee(String name, int id , double basicSalary, double allowance, double bonus){
       this.name = name;
       this.employeeId = id;
       this.basicSalary = basicSalary;
       this.allowance = allowance;
       this.bonus = bonus;
   }

   public double calculateSalary(){
       return basicSalary + bonus + allowance;
   }
}
