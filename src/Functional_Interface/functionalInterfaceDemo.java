package Functional_Interface;

@FunctionalInterface
interface BookAction{
    void perform();
}

// functional interface with parameter
@FunctionalInterface
interface operation{
    int add(int a, int b);
}

// parameter -> expression body
// () -> {}


public class functionalInterfaceDemo {
    static void main(String[] args) {
        // step 1
        BookAction action = new BookAction() {
            @Override
            public void perform() {
                System.out.println("Action performed");
            }
        };
        action.perform();

        //step 2

        BookAction action2 = () -> {
            System.out.println("Action performed");
        };
        action2.perform();

        // step 3
        BookAction action3 = () -> System.out.println("Action performed");
        action3.perform();

// functional interface with parameter
        operation calculate = new operation() {
            @Override
            public int add(int a, int b) {
                System.out.println(a+b);
                return 0;
            }
        };
        calculate.add(5,6);

        operation calculate2 = (int a , int b) -> {
            return a + b;
        };
        System.out.println(calculate2.add(5,7));

        // thread interface
        new Thread(() -> System.out.println("new thread created")).start();

    }
}
