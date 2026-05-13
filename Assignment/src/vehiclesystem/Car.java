package vehiclesystem;

public class Car extends Vehicle{
    private int doors;


    public Car(String brand, String model, int doors) {
        super.setBrand(brand);
        super.setModel(model);
        this.doors = doors;
    }

    @Override
    public void displayInfo() {
        System.out.println("Car Information");
        System.out.println("Brand : " + super.getBrand());
        System.out.println("Model : " + super.getModel());
        System.out.println("Doors : " + doors);
    }
}
