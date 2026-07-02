package Functional_Interface.inbuilt;

import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.Predicate;

public class RealExamples {
    static void main(String[] args) {
        // <title> costs $<Price>
        BiFunction<String, Double, String> formatter = (title, price) -> title + "costs $" + price;
        System.out.println(formatter.apply("Java basics ", 599.49));
        System.out.println(formatter.apply("python basics ", 199.49));
        System.out.println(formatter.apply("C++ basics ", 299.49));

        BiConsumer<String, Double> formatterConsumer = (title, price) -> System.out.println(title + "costs $" + price);
        formatterConsumer.accept("Java basics ", 599.49);
        formatterConsumer.accept("python basics ", 199.49);
        formatterConsumer.accept("C++ basics ", 299.49);

        // is Expensive
        Predicate<Double> isExpensive = price -> price > 500;
        System.out.println(isExpensive.test(900.0));



    }
}
