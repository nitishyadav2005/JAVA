package Functional_Interface.inbuilt;

import java.util.function.Function;

public class FunctionInterface {

    public static Function<Integer,Integer> addFunction = (a) -> a + 3;

    public static Function<Integer, Integer> subFunction = (a) -> a-10;

    public static Function<Integer, Integer> combinedFunction = addFunction.andThen(subFunction);

    static void main(String[] args) {
        System.out.println(addFunction.apply(10));
        System.out.println(subFunction.apply(20));
        System.out.println(combinedFunction.apply(15));
    }
}
