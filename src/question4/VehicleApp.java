package question4;

public class VehicleApp {
    public static void main(String[] args) {

        // (e) Car using the default constructor
        Car car = new Car();
        System.out.println("=== Car (Default Constructor) ===");
        car.displayVehicleDetails();
        System.out.println("calculateSpeed()    -> " + car.calculateSpeed() + " km/h");
        System.out.println("calculateSpeed(1.5) -> " + car.calculateSpeed(1.5) + " km/h");
        System.out.println();

        // (e) Bicycle using the parameterized constructor
        Bicycle bicycle = new Bicycle("Mountain Bike", 21, 35.0);
        System.out.println("=== Bicycle (Parameterized Constructor) ===");
        bicycle.displayVehicleDetails();
        System.out.println("calculateSpeed()    -> " + bicycle.calculateSpeed() + " km/h");
        System.out.println("calculateSpeed(1.5) -> " + bicycle.calculateSpeed(1.5) + " km/h");
    }
}
