package my_tasks.task36;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class BookStore {
    private Map<String, ArrayList<Book>> books;

    public BookStore() {
        this.books = new HashMap<>();
    }

    public void addBook(Book book) {
        books.putIfAbsent(book.getCategory(), new ArrayList<>());
        books.get(book.getCategory()).add(book);
    }

    public void printAllBooks() {
        System.out.println(books.entrySet());
    }

    public List<Book> filterByCategory(String category) {
        List<Book> finalList = new ArrayList<>();

        for (Map.Entry<String, ArrayList<Book>> entry : books.entrySet()) {
            if (entry.getKey().equals(category)) {
                finalList.addAll(entry.getValue());
            }
        }
        return finalList;
    }
}
