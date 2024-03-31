package point;

public class Point {
    double x;
    double y;

    public Point() {
    }

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    public double distanceToOrigin() {
        return Math.sqrt((this.getX() * this.getX()) + (this.y * this.y));
    }
    public double distanceToOriginFromPoint(Point point) {
        return Math.sqrt((point.x * point.x) + (point.y * point.y));
    }

    public double distanceToOtherPoint(Point point) {
        double distanceX = point.getX() - this.getX();
        double distanceY = point.getY() - this.getY();
        return Math.sqrt((distanceX * distanceX) + (distanceY * distanceY));
    }

    public Point clone() {
        Point clonePoint = new Point(this.getX(), this.getY());
        return clonePoint;
    }

    public void move(double x, double y) {
        this.x += x;
        this.y += y;
    }
}
