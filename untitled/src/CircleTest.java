import java.util.Scanner;
import test.TestClass;

public class CircleTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Circle circle = new Circle();
        Circle circle2 = new Circle(1.7);
        System.out.print("Radius of the circle: ");
        circle.radius = scanner.nextDouble();
        circle.area = circle.calculateArea(circle.radius);
        circle2.area = circle2.calculateArea(circle2.radius);
        circle.circumference = circle.calculateCircumference(circle.radius);
        circle2.circumference = circle2.calculateCircumference(circle2.radius);

        double radiusFromArea = circle.calculateRadiusFromArea(circle.area);
        double radiusFromArea2 = circle2.calculateRadiusFromArea(circle2.area);
        double radiusFromCircumference = circle.calculateRadiusFromCircumference(circle.circumference);
        double radiusFromCircumference2 = circle2.calculateRadiusFromCircumference(circle2.circumference);

        System.out.println("area: " + circle.area);
        System.out.println("circumference: " + circle.circumference);
        System.out.println("calculateRadiusFromArea's result: " + radiusFromArea);
        System.out.println("calculateRadiusFromCircumference's result: " + radiusFromCircumference);

        System.out.println("\n************************************************");
        System.out.println("area: " + circle2.area);
        System.out.println("circumference: " + circle2.circumference);
        System.out.println("calculateRadiusFromArea's result: " + radiusFromArea2);
        System.out.println("calculateRadiusFromCircumference's result: " + radiusFromCircumference2);

        System.out.println(TestClass.testProperty);
    }
}
