package employeesystem;

public class ContractEmployee extends Employee {
    private double contractDuration;
    private double contractAmount;

    public ContractEmployee(String name, int employeeId, double contractDuration, double contractAmount){
        super.setName(name);
        super.setEmployeeId(employeeId);
        this.contractDuration = contractDuration;
        this.contractAmount = contractAmount;
    }

    @Override
    public double calculateSalary(){
        return contractAmount / contractDuration;
    }

    @Override
    public String toString() {
        String str = "********Contract Employee Information*******"+"\n" +
                    "Employee Name : "+super.getName()+"\n"+
                     "Employee Id : "+super.getEmployeeId()+"\n"+
                     "Contract Duration : "+this.contractDuration+"\n"+
                     "Contract Amount : "+this.contractAmount;
        return str;
    }

}
