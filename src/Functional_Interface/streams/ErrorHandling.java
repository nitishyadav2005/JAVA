package Functional_Interface.streams;

import java.util.List;

public class ErrorHandling {
    static void main(String[] args) {
        List<String> books = List.of("Java", "Python", "c++");
        books.stream()
                .forEach(b -> {
                    try{
                        if(b.equals("Python"))
                            throw new RuntimeException("Invalid Book");
                        System.out.println(b);
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                });
    }
}
