package OOPS.constructors;

public class ConstructorsDemo {
    public static void main(String[] args) {
        Car car1 = new Car("Toyota", "Red", 200);
//        car1.speed = 100;
//        car1.brand = "Toyoto";
//        car1.color = "Red";
        car1.drive();

        Car car2 = new Car("kia",  "blue", 150);
//        car2.speed = 500;
//        car2.brand = "BMW";
//        car2.color = "Blue";
        car2.drive();

        Car car3 = new Car("bmw");
        car3.drive();

        System.out.println(car2.getSpeed());
        car2.setSpeed(500);
        System.out.println(car2.getSpeed());

    }
}
