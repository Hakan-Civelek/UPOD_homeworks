public class Circle {
    final double pi = 3.14;
    double radius;
    double circumference;
    double area;

    public Circle(){
    }

    public Circle(double radius){
        this.radius = radius;
    }

    double calculateArea(double radius) {
        return pi * Math.pow(radius, 2);
    }

    double calculateCircumference(double radius) {
        return 2 * pi * radius;
    }

    double calculateRadiusFromArea(double area) {
        return Math.sqrt(area / pi);
    }

    double calculateRadiusFromCircumference(double circumference) {
        return circumference / (2 * pi);
    }
}
