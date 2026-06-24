package OOPS.polymorphism;

public class overloading {

    static class calculator {

        static int add(int a, int b) {
            return a + b;
        }

        static double add(double a, double b) {
            return a + b;

        }


        static void main(String[] args) {
            calculator c1 = new calculator();
            System.out.println(c1.add(5, 6));
            System.out.println(c1.add(5.6, 7.1));
        }
    }
}
