package three.constructors;

public class Car {
    String brand;
    String color;
    int speed;

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

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }
}
