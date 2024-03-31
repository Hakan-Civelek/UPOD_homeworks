package point;

public class PointTest {
    public static void main(String[] args) {
        Point firstPoint = new Point(3,4);
        System.out.println("firstPoint's distance of origin: " + firstPoint.distanceToOrigin());

        Point clonePoint = firstPoint.clone();
        System.out.println("clonePoint's distance of origin: " + clonePoint.distanceToOrigin());

        Point secondPoint = new Point(8,16);
        System.out.println("secondPoint's distance to point1: " + secondPoint.distanceToOtherPoint(firstPoint));

        Point thirdPoint = new Point();
        thirdPoint.setX(6);
        thirdPoint.setY(8);
        System.out.println("thirdPoint's distance of origin: " + thirdPoint.distanceToOrigin());

        thirdPoint.move(2,7);
        System.out.println("thirdPoint's first coordinates after move: x = " + thirdPoint.getX() + " y = " + thirdPoint.getY());
        System.out.println("thirdPoint's distance of origin after first move: " + thirdPoint.distanceToOrigin());

        thirdPoint.move(-2,-7);
        System.out.println("thirdPoint's second coordinates after move: x = " + thirdPoint.getX() + " y = " + thirdPoint.getY());
        System.out.println("thirdPoint's distance of origin after second move: " + thirdPoint.distanceToOrigin());

    }
}
