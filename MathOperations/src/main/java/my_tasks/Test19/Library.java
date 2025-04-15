package my_tasks.Test19;

import java.util.ArrayList;
import java.util.List;

public class Library {
    List<Book> storage;

    public Library() {
        this.storage = new ArrayList<>();
    }

    public void addBook(Book book) {
        this.storage.add(book);
        System.out.println("The book " + book.getTitle() + " has been added to the library");
    }

    public void deleteBook(String title) {
        long c = this.storage.stream().filter(book -> book.getTitle().equals(title)).count();

        if (c == 1) {
            this.storage.removeIf(bookTitle -> bookTitle.equals(title));
            System.out.println("The book " + title + " has been deleted from the library");
        } else {
            throw new NullPointerException("There is no this book in the library");
        }

    }

    public void printAllBooks() {
        System.out.println("The list of books:");
        this.storage.forEach(System.out::println);
    }
}


