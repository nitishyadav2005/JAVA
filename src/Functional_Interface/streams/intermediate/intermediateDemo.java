package Functional_Interface.streams.intermediate;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class intermediateDemo {
    static void main(String[] args) {
        List<Book> books = Arrays.asList(
                new Book("Effective Java", 2018, 850.0, "Programming"),
                new Book("Clean Code", 2008, 750.0, "Programming"),
                new Book("Java: The Complete Reference", 2021, 1200.0, "Programming"),
                new Book("Head First Java", 2022, 950.0, "Programming"),
                new Book("The Alchemist", 1988, 350.0, "Fiction"),
                new Book("Atomic Habits", 2018, 600.0, "Self-Help"),
                new Book("Rich Dad Poor Dad", 1997, 450.0, "Finance"),
                new Book("Think and Grow Rich", 1937, 400.0, "Finance"),
                new Book("The Hobbit", 1937, 550.0, "Fantasy"),
                new Book("Harry Potter and the Philosopher's Stone", 1997, 700.0, "Fantasy")
        );
        // 1. Filtering: Books cheaper than 500
        System.out.println("== Books cheaper than 500 ==");
        Stream<Book> filteredBook = books.stream()
                .filter(predicate);
        filteredBook.forEach(System.out::println);

        // 2. Mapping: convert books title to uppercase
        System.out.println("== convert books title to uppercase ==");
        Stream<String> upperCaseTitles = books.stream()
                .map(book -> book.title.toUpperCase());
        upperCaseTitles.forEach(System.out::println);

        //3. Sorting: Books by publication date
        System.out.println("== Books by publication date ==");
        Stream<Book> sortedBooks = books.stream()
                .sorted(Comparator.comparingInt(book -> book.publicationYear));
        sortedBooks.forEach(System.out::println);

        //4. Distinct: Remove duplicate titles
        System.out.println("== Remove duplicate titles ==");
        Stream<Book> uniqueBook = books.stream()
                .distinct();
        uniqueBook.forEach(System.out::println);

        //5. Limit: Display only the first 3 books
        System.out.println("== Display only the first 3 books ==");
        Stream<Book> firstThreeBook = books.stream()
                .limit(3);
        firstThreeBook.forEach(System.out::println);

        //6. Skip: Skip the first 2 books
        System.out.println("== Skip the first 2 books ==");
        Stream<Book> afterSkippingTwo = books.stream()
                .skip(2);
        afterSkippingTwo.forEach(System.out::println);
    }


    static Predicate<Book> predicate = new Predicate<Book>() {
        @Override
        public boolean test(Book book) {
            return book.price < 500;
        }
    };
}
