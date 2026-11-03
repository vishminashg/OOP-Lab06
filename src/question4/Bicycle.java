package question4;

public class Bicycle extends Vehicle {

    private int gearCount;
    private double maxPedalSpeed;   // km/h

    // Default constructor
    public Bicycle() {
        super();
        this.gearCount = 0;
        this.maxPedalSpeed = 0.0;
    }

    // Parameterized constructor
    public Bicycle(String vehicleName, int gearCount, double maxPedalSpeed) {
        super(vehicleName);
        this.gearCount = gearCount;
        this.maxPedalSpeed = maxPedalSpeed;
    }

    public int getGearCount() { return gearCount; }
    public void setGearCount(int gearCount) { this.gearCount = gearCount; }

    public double getMaxPedalSpeed() { return maxPedalSpeed; }
    public void setMaxPedalSpeed(double maxPedalSpeed) { this.maxPedalSpeed = maxPedalSpeed; }

    // (d) Return the bicycle's maximum pedaling speed
    @Override
    public double calculateSpeed() {
        return maxPedalSpeed;
    }

    // (d) Display including speed and gear count
    @Override
    public void displayVehicleDetails() {
        super.displayVehicleDetails();
        System.out.println("Gear Count: " + gearCount);
        System.out.println("Speed: " + calculateSpeed() + " km/h");
    }
}
