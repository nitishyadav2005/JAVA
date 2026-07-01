package Functional_Interface.inbuilt;

import java.util.function.BiFunction;

public class BiFunctionDemo {

    public static BiFunction<Integer, Integer, Integer> addFunction = (a,b) -> a+b;
    public static BiFunction<Integer, Integer, Integer> subFunction = (a,b) -> a-b;

    static void main(String[] args) {
        System.out.println(addFunction.apply(10,20));
        System.out.println(subFunction.apply(20,30));

    }
}
