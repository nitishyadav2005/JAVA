package Functional_Interface.inbuilt;

import java.util.function.BiConsumer;
import java.util.function.BiPredicate;
import java.util.function.Predicate;

public class predicateDemo {
    static void main(String[] args) {
        Predicate<Integer> isEven = n -> n%2 == 0;
        System.out.println(isEven.test(10));
        System.out.println(isEven.test(13));

        BiPredicate<Integer, Integer> isSumEven = (a,b) -> (a+b)%2 == 0;
        System.out.println(isSumEven.test(10,20));
        System.out.println(isSumEven.test(10,21));
    }

}
