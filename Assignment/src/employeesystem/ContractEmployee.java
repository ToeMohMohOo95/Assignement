package employeesystem;

public class ContractEmployee {
    private String name;
    private int employeeId;
    private double basicSalary;
    private double contractDuration;
    private double contractAmount;

    public ContractEmployee(String name, int id , double basicSalary, double contractDuration, double contractAmount){
        this.name = name;
        this.employeeId = id;
        this.basicSalary = basicSalary;
        this.contractDuration = contractDuration;
        this.contractAmount = contractAmount;
    }

    public double calculateSalary(){

        return contractAmount / contractDuration;
    }
}
