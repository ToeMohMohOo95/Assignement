package vehiclesystem;

public class Motorcycle extends Vehicle{
    private boolean hasSidecar;

    public Motorcycle(String brand, String model, boolean hasSidecar){
        super.setBrand(brand);
        super.setModel(model);
        this.hasSidecar = hasSidecar;
    }

    @Override
    public void displayInfo() {
        System.out.println("Motorcyle Information");
        System.out.println("Brand : " + super.getBrand());
        System.out.println("Model : " + super.getModel());
        System.out.println("hasSidecar : " + this.hasSidecar);
    }
}
