package vehiclesystem;

public class Truck extends Vehicle{
    private double payloadCapacity;

    public Truck(String brand, String model, double payloadCapacity){
        super.setBrand(brand);
        super.setModel(model);
        this.payloadCapacity = payloadCapacity;
    }

    @Override
    public void displayInfo() {
        System.out.println("Truck Information");
        System.out.println("Brand : " + super.getBrand());
        System.out.println("Model : " + super.getModel());
        System.out.println("payloadCapacity : " + this.payloadCapacity);
    }
}
