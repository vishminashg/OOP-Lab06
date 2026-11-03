package question4;

public class Car extends Vehicle {

    private int engineCapacity;   // CC
    private double topSpeed;      // km/h

    // Default constructor
    public Car() {
        super();
        this.engineCapacity = 0;
        this.topSpeed = 0.0;
    }

    // Parameterized constructor
    public Car(String vehicleName, int engineCapacity, double topSpeed) {
        super(vehicleName);
        this.engineCapacity = engineCapacity;
        this.topSpeed = topSpeed;
    }

    public int getEngineCapacity() { return engineCapacity; }
    public void setEngineCapacity(int engineCapacity) { this.engineCapacity = engineCapacity; }

    public double getTopSpeed() { return topSpeed; }
    public void setTopSpeed(double topSpeed) { this.topSpeed = topSpeed; }

    // (c) Return the car's top speed
    @Override
    public double calculateSpeed() {
        return topSpeed;
    }

    // (c) Display including speed and engine capacity
    @Override
    public void displayVehicleDetails() {
        super.displayVehicleDetails();
        System.out.println("Engine Capacity: " + engineCapacity + " CC");
        System.out.println("Speed: " + calculateSpeed() + " km/h");
    }
}
