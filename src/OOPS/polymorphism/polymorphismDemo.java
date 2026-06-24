package OOPS.polymorphism;

public class polymorphismDemo {
    static void main(String[] args) {
         Car c1 = new Car("Toyoto", 200, 5);
         c1.displayInfo();

         Bike b1  = new Bike("yamaha",120,true);
         b1.displayInfo();

         c1.start();
         b1.start();

         vehicle v1 = new vehicle("splendor",200);
         v1.start();

        vehicle v2 = new Car("bullet",150,5);
        v2.start();

        vehicle v3 = new Bike("nmsdcsj",70, true);
        v3.start();;
    }
}
