package vehiclesystem;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class VehicleRegisterService {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        ArrayList<Vehicle> vehicles = new ArrayList<>();
        String choice = "";
        System.out.println("**** Vehicle Registration System ****");
        do {
            System.out.println("--- Vehicles Menu ---");
            System.out.println("(1).Car");
            System.out.println("(2).Truck");
            System.out.println("(3).Motorcycle");
            System.out.print("Which Vehicle Type do you want to create (1/2/3) ?");
            int vehicleType = Integer.parseInt(br.readLine());
            Vehicle vehicle = null;
            switch (vehicleType) {
                case 1:
                    System.out.print("Enter Brand:");
                    String brand = br.readLine();
                    System.out.print("Enter Model:");
                    String model = br.readLine();
                    System.out.print("Enter Number of doors for car ?");
                    int doors = Integer.parseInt(br.readLine());
                    vehicle = new Car(brand, model, doors);
                    break;
                case 2:
                    System.out.print("Enter Brand:");
                    brand = br.readLine();
                    System.out.print("Enter Model:");
                    model = br.readLine();
                    System.out.print("Enter payload capacity in tons:");
                    double payloadCapacity = Double.parseDouble(br.readLine());
                    vehicle = new Truck(brand, model, payloadCapacity);
                    break;
                case 3:
                    System.out.print("Enter Brand:");
                    brand = br.readLine();
                    System.out.print("Enter Model:");
                    model = br.readLine();
                    System.out.print("Does it have a sidescar? true/false: ");
                    boolean hasSideCar = Boolean.parseBoolean(br.readLine());
                    vehicle = new Motorcycle(brand, model, hasSideCar);
                    break;
                default:
                    System.out.print("Invalid vehicle type.");

            }

            vehicle.displayInfo();
            vehicles.add(vehicle);
            System.out.print("Do you want to add another vehicle? yes/no: ");
            choice = br.readLine();

        }while (choice.equalsIgnoreCase("yes"));

        for (Vehicle vehicle : vehicles){
            vehicle.displayInfo();
        }
    }
}
