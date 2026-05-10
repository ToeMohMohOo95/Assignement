package employeesystem;

public class ContractEmployee extends Employee {
    private double contractDuration;
    private double contractAmount;

    public ContractEmployee(String name, int id , double basicSalary, double contractDuration, double contractAmount){
        this.contractDuration = contractDuration;
        this.contractAmount = contractAmount;
    }

    public double calculateSalary(){

        return contractAmount / contractDuration;
    }
}
