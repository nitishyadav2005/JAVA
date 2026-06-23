package three.inheritance;

public class InheritanceDemo {
    static void main(String[] args) {
         Car c1 = new Car("Toyoto", 200, 5);
         c1.displayInfo();

         Bike b1  = new Bike("yamaha",120,true);
         b1.displayInfo();
    }
}
