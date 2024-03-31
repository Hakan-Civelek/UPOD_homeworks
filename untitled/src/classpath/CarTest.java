package classpath;

public class CarTest{
    public static void main(String[] args) {
        Car car1 = new Car();
        car1.model = "Dacia Logan";
        car1.speed = 170;
        System.out.println("Car: " + car1.model + "\nSpeed: " + car1.speed);
    }
}
