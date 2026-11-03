package question3;

public class ShapeApp {
    public static void main(String[] args) {

        // (e) Rectangle using the default constructor
        Rectangle rectangle = new Rectangle();
        System.out.println("=== Rectangle (Default Constructor) ===");
        rectangle.displayShapeDetails();
        System.out.println("calculateArea()    -> " + rectangle.calculateArea());
        System.out.println("calculateArea(2.0) -> " + rectangle.calculateArea(2.0));
        System.out.println();

        // (e) Triangle using the parameterized constructor
        Triangle triangle = new Triangle("Triangle", 10.0, 5.0);
        System.out.println("=== Triangle (Parameterized Constructor) ===");
        triangle.displayShapeDetails();
        System.out.println("calculateArea()    -> " + triangle.calculateArea());
        System.out.println("calculateArea(2.0) -> " + triangle.calculateArea(2.0));
    }
}
