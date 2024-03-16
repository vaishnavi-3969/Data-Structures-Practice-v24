package Advanced_Java_Programming_LL.Streams;

import java.util.ArrayList;

public class Library {
    public static void main(String[] args) {
        ArrayList<Book> books = populateLibrary();
       books.stream().filter(book -> {
           return book.getAuthor().startsWith("T");
       }).forEach(System.out::println);
        System.out.println("\nAll List of books: ");
        books.stream().forEach(System.out::println);
    }

    private static ArrayList<Book> populateLibrary() {
        ArrayList<Book> books = new ArrayList<>();
        books.add(new Book("Alice Walker", "The color purple"));
        books.add(new Book("Alice Walker", "Meridian"));
        books.add(new Book("Toni Morrison", "Beloved"));
        books.add(new Book("Toni Morrison", "Jazz"));
        books.add(new Book("Toni Morrison", "Paradise"));
        return books;
    }

}
