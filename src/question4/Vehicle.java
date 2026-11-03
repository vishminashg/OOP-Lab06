package question4;

/** SE1020 Lab 06 - Q4: Vehicle Speed Calculation System (base class). */
public class Vehicle {

    private String vehicleName;

    // Default constructor
    public Vehicle() {
        this.vehicleName = "N/A";
    }

    // Parameterized constructor
    public Vehicle(String vehicleName) {
        this.vehicleName = vehicleName;
    }

    public String getVehicleName() { return vehicleName; }
    public void setVehicleName(String vehicleName) { this.vehicleName = vehicleName; }

    // (a) Print the vehicle name
    public void displayVehicleDetails() {
        System.out.println("Vehicle Name: " + vehicleName);
    }

    // (b) Default speed
    public double calculateSpeed() {
        return 0.0;
    }

    // (b) Speed scaled by a factor (uses the speed from calculateSpeed())
    public double calculateSpeed(double factor) {
        return calculateSpeed() * factor;
    }
}
