package OOPS.constructors;

record Bike(String brand, int speed){}

public class recordDemo {
    public static void main(String[] args) {
        Bike bike = new Bike("BMW", 220);
        System.out.println("Brand: " + bike.brand());
        System.out.println("speed: " + bike.speed());
        System.out.println(bike);
    }
}
