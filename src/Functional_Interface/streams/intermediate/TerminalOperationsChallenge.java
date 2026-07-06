package Functional_Interface.streams.intermediate;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class TerminalOperationsChallenge {
    static void main(String[] args) {
        /*
        - Discounted Books: The bookstore is planning a sale.
            Identify all books that are priced over 400. Display these books.
        - Classics Collection: The bookstore is launching a classics collection.
            Identify and display books that were published before the year 2000.
        - Upcoming Titles: Generate a list of future book titles for the next year
            by adding the suffix "(Coming Soon)" to all the current titles.
        - Sort by Price: The bookstore wants to print price tags for all the books.
            Display the books sorted by their prices in ascending order.
        - Rare Books: The bookstore believes there might be rare books in the
            collection. A rare book is one where the title has more than 20
            characters. Identify and display these books.
         */

        List<Book> books = Arrays.asList(
                new Book("Clean Code", 2008, 499.99, "Programming"),
                new Book("Effective Java", 2018, 699.50, "Programming"),
                new Book("Java: The Complete Reference", 2022, 899.00, "Programming"),
                new Book("Atomic Habits", 2018, 450.00, "Self Help"),
                new Book("The Alchemist", 1988, 299.00, "Fiction"),
                new Book("Rich Dad Poor Dad", 1997, 350.00, "Finance"),
                new Book("The Pragmatic Programmer", 1999, 799.99, "Programming"),
                new Book("Thinking in Java", 2006, 650.00, "Programming"),
                new Book("Deep Work", 2016, 399.00, "Productivity"),
                new Book("The Hobbit", 1937, 550.00, "Fantasy"),

                // Upcoming books (2027)
                new Book("Modern Java in Action", 2027, 799.99, "Programming"),
                new Book("AI for Software Engineers", 2027, 899.99, "Technology")
        );
        // Total cost of all books in the bookstore

        Double costOfBooks = books.stream()
                .mapToDouble(book -> book.price)
                .reduce(0,Double::sum);
        System.out.println(costOfBooks);

        // collecting books into a list of titles

        List<String> bookTitle = books.stream()
                .map(book -> book.title)
                .collect(Collectors.toList());
        System.out.println(bookTitle);

        // Grouping books of category

        Map<String, List<Book>> byCategory = books.stream()
                .collect(Collectors.groupingBy(bookStringFunction));
        byCategory.forEach((category, bookList) -> {
            bookList.forEach(System.out::println);
        });
    }

    static Function<Book, String> bookStringFunction = new Function<Book, String>() {
        @Override
        public String apply(Book book) {
            return book.getCategory();
        }
    };
}
