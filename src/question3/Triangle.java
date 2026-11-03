package question3;

public class Triangle extends Shape {

    private double base;
    private double height;

    // (d) Default constructor
    public Triangle() {
        super();
        this.base = 0.0;
        this.height = 0.0;
    }

    // (d) Parameterized constructor
    public Triangle(String shapeName, double base, double height) {
        super(shapeName);
        this.base = base;
        this.height = height;
    }

    public double getBase() { return base; }
    public void setBase(double base) { this.base = base; }

    public double getHeight() { return height; }
    public void setHeight(double height) { this.height = height; }

    // Area = (base x height) / 2
    @Override
    public double calculateArea() {
        return (base * height) / 2;
    }

    @Override
    public void displayShapeDetails() {
        super.displayShapeDetails();
        System.out.println("Base: " + base);
        System.out.println("Height: " + height);
        System.out.println("Area: " + calculateArea());
    }
}
