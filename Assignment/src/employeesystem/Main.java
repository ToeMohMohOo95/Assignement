package employeesystem;

public class Main {
  public static void main(String[] args) {
        PartTimeEmployee ptEmployee = new PartTimeEmployee("Maung Maung", 0001, 5,5000);
        System.out.println("Employee Name: "+ ptEmployee.getName());
        System.out.println("Employee Hours Worked: "+ ptEmployee.getHoursWorked());
        System.out.println("Employee Hourly Rate: "+ ptEmployee.getHourlyRate());
        System.out.println("Total Salary for PartTimeEmployee : " + ptEmployee.calculateSalary());
        ptEmployee.toString();
        ContractEmployee contractEmployee = new ContractEmployee("Aung Aung", 0002, 300000, 1, 50000);
        System.out.println("Total Salary for ContractEmployee : " + contractEmployee.calculateSalary());

        FulltimeEmployee fulltimeEmployee = new FulltimeEmployee("Kyaw Kyaw", 0003, 400000, 30000, 100000);
        System.out.println("Total Salary for FulltimeEmployee : " + fulltimeEmployee.calculateSalary());
    }
}
