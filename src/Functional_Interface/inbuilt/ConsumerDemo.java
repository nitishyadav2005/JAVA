package Functional_Interface.inbuilt;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class ConsumerDemo {
    static void main(String[] args) {
//        Consumer<String> consumer1 = (str) -> System.out.println(str);
        Consumer<String> consumer1 = System.out::println;

        Consumer<String> consumer2 = str -> System.out.println("Length: "+str.length());

        consumer1.accept("Hello!");
        consumer2.accept("Hello!");

        List<Integer>   numbers = Arrays.asList(1, 2, 3, 4, 5);
        Consumer<Integer>  multiplyBy2 = n -> System.out.println(n*2);
        numbers.forEach(multiplyBy2);
    }
}
