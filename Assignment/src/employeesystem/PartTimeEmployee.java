package employeesystem;

public class PartTimeEmployee {
    private String name;
    private int employeeId;
    private double basicSalary;
    private double hoursWorked;
    private double hourlyRate;

    public PartTimeEmployee(String name, int id , double basicSalary, double hoursWorked, double hourlyRate){
        this.name = name;
        this.employeeId = id;
        this.basicSalary = basicSalary;
        this.hoursWorked = hoursWorked;
        this.hourlyRate = hourlyRate;
    }

    public double calculateSalary(){
        double totalSalary = this.hoursWorked * this.hourlyRate;
        return totalSalary;
    }
}
