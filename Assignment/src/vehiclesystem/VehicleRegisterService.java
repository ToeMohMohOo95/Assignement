package vehiclesystem;

import java.util.ArrayList;
import java.util.Scanner;

public class VehicleRegisterService {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<Vehicle> vehicles = new ArrayList<>();

        for (Vehicle v : vehicles) {

            v.displayInfo();
        }

        scanner.close();
    }
}
