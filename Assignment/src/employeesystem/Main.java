package employeesystem;

public class Main {
  public static void main(String[] args) {
        PartTimeEmployee ptEmployee = new PartTimeEmployee("Maung Maung", 0001, 5,5000);
        System.out.println(ptEmployee);
        ContractEmployee contractEmployee = new ContractEmployee("Aung Aung", 0002, 1, 50000);
        System.out.println(contractEmployee);
        FulltimeEmployee fulltimeEmployee = new FulltimeEmployee("Kyaw Kyaw", 0003, 400000, 30000, 100000);
        System.out.println(fulltimeEmployee);
  }
}
