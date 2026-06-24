package OOPS.encapsulation;

 class Car {
    private String brand;
   private String color;
     private int speed;

    public Car(String brand, String color, int speed){
        System.out.println("contructor called");
        this.brand = brand;
        this.speed = speed;
        this.color = color;
    }

    public Car(String brand) {
        this.brand = brand;
    }

    public void drive(){

        System.out.println(brand+ " is driving at " + speed);
    }


}


public class encapsulationDemo {
    static void main(String[] args) {
        Car car1 = new Car("Toyota", "Red", 150);
        car1.drive();
    }

}
