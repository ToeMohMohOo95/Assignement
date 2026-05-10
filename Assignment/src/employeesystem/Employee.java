package employeesystem;

public class Employee {
    public static void main(String[] args) {
        PartTimeEmployee ptEmployee = new PartTimeEmployee("Maung Maung", 0001, 200000, 5,5000);
        System.out.println("Total Salary for PartTimeEmployee : " + ptEmployee.calculateSalary());

        ContractEmployee contractEmployee = new ContractEmployee("Aung Aung", 0002, 300000, 1, 50000);
        System.out.println("Total Salary for ContractEmployee : " + contractEmployee.calculateSalary());

        FulltimeEmployee fulltimeEmployee = new FulltimeEmployee("Kyaw Kyaw", 0003, 400000, 30000, 100000);
        System.out.println("Total Salary for FulltimeEmployee : " + fulltimeEmployee.calculateSalary());
    }
}
