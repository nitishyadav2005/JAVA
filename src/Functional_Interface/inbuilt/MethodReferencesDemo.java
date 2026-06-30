package Functional_Interface.inbuilt;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class MethodReferencesDemo {
    static void main(String[] args) {
        // ::
        // method 1
        List<String> names = Arrays.asList("Alice", "Charlie", "Bob");
        for (int i = 0; i < names.size(); i++) {
            System.out.print(" "+ names.get(i));
        }
        System.out.println();
        // using enhanced for loop
        for(String name : names){
            System.out.print(" "+name);
        }

       /* names.forEach(new Consumer<String>() {
            @Override
            public void accept(String name) {
                System.out.println(" "+name);
            }
        });*/

       /* names.forEach((String name) -> {
            System.out.println(name);
        });*/

        /*names.forEach(( name) -> {
            System.out.println(name);
        });*/

        /* names.forEach((String name) -> {
            System.out.println(name);
        });*/

        /*names.forEach((name) -> System.out.println(name));*/

        names.forEach(System.out::println);


    }
}
