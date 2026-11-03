package question3;

/** SE1020 Lab 06 - Q3: Shape Area Calculation System (base class). */
public class Shape {

    private String shapeName;

    // (a) Default constructor
    public Shape() {
        this.shapeName = "N/A";
    }

    // (a) Parameterized constructor
    public Shape(String shapeName) {
        this.shapeName = shapeName;
    }

    public String getShapeName() { return shapeName; }
    public void setShapeName(String shapeName) { this.shapeName = shapeName; }

    // (a) Print the shape name
    public void displayShapeDetails() {
        System.out.println("Shape Name: " + shapeName);
    }

    // (b) Default area
    public double calculateArea() {
        return 0.0;
    }

    // (b) Area scaled by a factor (uses the area from calculateArea())
    public double calculateArea(double factor) {
        return calculateArea() * factor;
    }
}
