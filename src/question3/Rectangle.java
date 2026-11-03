package question3;

public class Rectangle extends Shape {

    private double length;
    private double width;

    // (c) Default constructor
    public Rectangle() {
        super();
        this.length = 0.0;
        this.width = 0.0;
    }

    // (c) Parameterized constructor
    public Rectangle(String shapeName, double length, double width) {
        super(shapeName);
        this.length = length;
        this.width = width;
    }

    public double getLength() { return length; }
    public void setLength(double length) { this.length = length; }

    public double getWidth() { return width; }
    public void setWidth(double width) { this.width = width; }

    // Area = length x width
    @Override
    public double calculateArea() {
        return length * width;
    }

    @Override
    public void displayShapeDetails() {
        super.displayShapeDetails();
        System.out.println("Length: " + length);
        System.out.println("Width: " + width);
        System.out.println("Area: " + calculateArea());
    }
}
