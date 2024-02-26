import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ShapeTest {
    public static void main(String[] args) {
        List<Shape> shapes = new ArrayList<>();
        shapes.add(new Circle(5.0));
        shapes.add(new Rectangle(4.0, 5.0));
        shapes.add(new Triangle(2.0, 4.0, 6.0));
Shape circle = new Circle(5.0);
        AreaCalculator calculator = new AreaCalculator();
        double sumOfPerimeters = calculator.calculateTotalPerimeter(shapes);
        System.out.println("suma pól: " + sumOfPerimeters);

      double sumOfAreas = calculator.calculateTotalArea(shapes);
        System.out.println("suma obwodów: " + sumOfAreas);

    }
}
