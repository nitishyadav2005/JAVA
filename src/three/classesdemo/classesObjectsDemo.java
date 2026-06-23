package three.classesdemo;

public class classesObjectsDemo {
   public static void main(String[] args) {
        Car car1 = new Car();
        car1.speed = 100;
        car1.brand = "Toyoto";
        car1.color = "Red";
        car1.drive();

        Car car2 = new Car();
        car2.speed = 500;
        car2.brand = "BMW";
        car2.color = "Blue";
        car2.drive();
    }
}
