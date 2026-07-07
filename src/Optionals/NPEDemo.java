package Optionals;

import java.util.Optional;

public class NPEDemo {
    static void main(String[] args) {
        String name = null;
        if(name != null){
            System.out.println(name.length());
        }
        else
            System.out.println("No name value");


        //  Creating OPTIONAL
        Optional<String> optionalString = Optional.of("java");
        System.out.println(optionalString);

        Optional<String> empty = Optional.empty();
        System.out.println(empty);

        Optional<String> mayBe = Optional.ofNullable(null);
        System.out.println(mayBe);

        //Checking Values
        System.out.println(optionalString.isPresent());
        System.out.println(mayBe.isPresent());

        System.out.println(optionalString.isEmpty());
        System.out.println(mayBe.isEmpty());

        // get()
        System.out.println(optionalString.get());
        System.out.println(mayBe.get());
    }
}
